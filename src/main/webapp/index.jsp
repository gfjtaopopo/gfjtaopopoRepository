<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<!-- web路径：
不以/开始的相对路径，找资源是以当前资源的路径为基准，容易出问题。
以/开始的相对路径，找资源是以服务器的路径为基准(http://localhost:3306)：需要加上项目名
	 http://localhost:3306/crud

 -->
<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.3.1.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<!-- 员工添加的模态框Modal -->
	<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">员工添加</h4>
	      </div>
	      <div class="modal-body">
	      	<form class="form-horizontal">
	      	  <!-- 姓名 -->
			  <div class="form-group">
			    <label for="empName_add_input" class="col-sm-2 control-label">empName</label>
			    <div class="col-sm-10">
			      <input type="text" name="empName" class="form-control" id="empName_add_input" placeholder="empName">
			      <span class="help-block"></span>
			    </div>
			  </div>
			  <!-- 邮件 -->
			  <div class="form-group">
			    <label for="email_add_input" class="col-sm-2 control-label">email</label>
			    <div class="col-sm-10">
			      <input type="text" name="email" class="form-control" id="email_add_input" placeholder="email@atguigu.com">
			      <span class="help-block"></span>
			    </div>
			  </div>
			  <!-- 性别 -->
			  <div class="form-group">
			    <label class="col-sm-2 control-label">gender</label>
			    <div class="col-sm-10">
			      <label class="radio-inline">
				  	<input type="radio" name="gender" id="gender1_add_input" value="M" checked="checked"> 男
				  </label>
				  <label class="radio-inline">
					<input type="radio" name="gender" id="gender2_add_input" value="F"> 女
				  </label>
			    </div>
			  </div>
			  <!-- 部门 -->
			  <div class="form-group">
			    <label class="col-sm-2 control-label">deptName</label>
			    <div class="col-sm-4">
			      <!-- 部门提交部门id即可 -->
				  <select class="form-control" name="dId" id="dept_add_select">
				  	
				  </select>
			    </div>
			  </div>
			  
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="emp_save_btn">保存</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
			<h1>SSM-CRUD</h1>
			</div>
		</div>
		
		<!-- 按钮 -->
		<div class="row">
		  <div class="col-md-4 col-md-offset-8">
			<button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
			<button class="btn btn-danger">删除</button>
		  </div>
		</div>
		
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emp_table">
					<thead>
						<tr>
							<th>#</th>
							<th>empName</th>
							<th>gender</th>
							<th>email</th>
							<th>deptName</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						
					</tbody>
				</table>
			</div>
		</div>
			
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area"></div>
		</div>
	
	</div>
	
	<script type="text/javascript">
	
		// 总记录数 
		var totalRecord;
		
		// 1.页面加载完成以后，直接去发送一个ajax请求,要到分页数据
		$(function(){
			// 去首页
			to_page(1);
		});
		
		function to_page(pn){
			$.ajax({
				url:"${APP_PATH}/emps",
				data:"pn="+pn,
				type:"get",
				success:function(result){
					// 1,解析并显示员工数据
					build_emps_table(result);
					// 2,解析并显示分页信息
					build_page_info(result);
					// 3,解析显示分页条数据
					build_page_nav(result);
				}
			});
		}
		
		function build_emps_table(result){
			// 清空table表格
			$("#emp_table tbody").empty();
			var emps = result.extend.pageInfo.list;
			$.each(emps, function(index, item){
				var empIdTd = $("<td></td>").append(item.empId);
				var empNameTd = $("<td></td>").append(item.empName);
				var genderTd = $("<td></td>").append(item.gender=='M'?"男":"女");
			//或 var genderTd = $("<td></td>").append(item.gender=="M"?"男":"女");
				var emailTd = $("<td></td>").append(item.email);
				var deptNameTd = $("<td></td>").append(item.department.deptName);

				// 编辑按钮
				var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm")
								.append($("<span></span>").addClass("glyphicon glyphicon-pencil"))
								.append("编辑");
				var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm")
								.append($("<span></span>").addClass("glyphicon glyphicon-trash"))
								.append("删除");
				var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
				
				$("<tr></tr>").append(empIdTd)
							.append(empNameTd)
							.append(genderTd)
							.append(emailTd)
							.append(deptNameTd)
							.append(btnTd)
							.appendTo("#emp_table tbody");
			});
		}
		
		// 解析显示分页信息
		function build_page_info(result){
			// 清空分页信息
			$("#page_info_area").empty();
			$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"
											+result.extend.pageInfo.pages+"页,总"
											+result.extend.pageInfo.total+"条记录");
			
			totalRecord = result.extend.pageInfo.total;
		}
		
		// 解析显示分页条,点击分页能去下一页...
		function build_page_nav(result){
			// 清空分页条
			$("#page_nav_area").empty();
			
			var ul = $("<ul></ul>").addClass("pagination")
			
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
			
			var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
			
			if(!result.extend.pageInfo.hasPreviousPage) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				// 为元素添加点击翻页的事件
				firstPageLi.click(function(){
					to_page(1);
				});
				prePageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum-1);
				});
			}
			
			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
			
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
			
			if(!result.extend.pageInfo.hasNextPage) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				nextPageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum+1);
				});
				lastPageLi.click(function(){
					to_page(result.extend.pageInfo.pages);
				});
			}
			
			// 添加首页和前一页的提示
			ul.append(firstPageLi).append(prePageLi);
			
			// 1,2,3,4,5 遍历给ul中添加页码提示
			$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if(result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				// 绑定翻页事件
				numLi.click(function(){
					to_page(item);
				});
				ul.append(numLi);
			});
			
			// 添加后一页和末页的提示
			ul.append(nextPageLi).append(lastPageLi);
			
			// 把ul加入到nav中
			var navEle = $("<nav></nav>").append(ul);
			
			$("#page_nav_area").append(navEle);
		}
		
		// 点击新增按钮弹出模态框
		$("#emp_add_modal_btn").click(function(){
			
			// 发出Ajax请求,查出部门信息,显示在下拉列表中
			getDepts();
			
			// 弹出模态框
			$("#empAddModal").modal({
				backdrop:"static"
			});
		});
		
		// 查出所有的部门信息并显示在下拉列表中
		function getDepts(){
			
			// 清空下拉列表
			$("#dept_add_select").empty();
			
			$.ajax({
				url:"${APP_PATH}/depts",
				type:"GET",
				success:function(result){
					// console.log(result);
					// 显示部门信息的下拉列表
					$.each(result.extend.depts, function(){
						var optionEle = $("<option></option>").append(this.deptId + ":" + this.deptName).attr("value", this.deptId);
						optionEle.appendTo("#empAddModal select");
						// 或 optionEle.appendTo("#dept_add_select");
					});
				}
			});
		}
		
		// 校验表单数据方法	.has-warning、.has-error 或 .has-success
		function validate_add_form(){
			// 1,校验用户名
			var empName = $("#empName_add_input").val();
			var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,6}$)/;
			if(!regName.test(empName)) {
				// .has-warning、.has-error 或 .has-success
				show_validate_msg("#empName_add_input","has-error","用户名:2-6位中文 或者 6-16位英文和数字的组合")
				
				return false;
			} else {
				show_validate_msg("#empName_add_input","has-success","")
			}
			
			// 2,校验邮箱信息
			var email = $("#email_add_input").val();
			var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
			if(!regEmail.test(email)) {
				show_validate_msg("#email_add_input","has-error","邮箱格式不正确")
				
				return false;
			} else {
				show_validate_msg("#email_add_input","has-success","")
			}
			return true;
		}
		
		// 显示验证信息
		function show_validate_msg(ele,status,msg){
			// 清楚已经存在的样式
			$(ele).parent().removeClass("has-error has-success");
			$(ele).parent().addClass(status);
			$(ele).next("span").text(msg);
		}

		// 1,模态框中填写的表单数据提交给服务器进行保存
		$("#emp_save_btn").click(function(){
			// 2,对提交给服务器的数据进行校验
			if(!validate_add_form()){
				return	false;
			}
			
			// 3,发送ajax请求保存员工
			$.ajax({
				url:"${APP_PATH}/emp",
				type:"POST",
				data:$("#empAddModal form").serialize(),
				success:function(result){
					// alert(result.msg);
					// 员工保存成功
					// 1,关闭模态框
					$('#empAddModal').modal('hide');
					
					// 2,来到最后一页,查看保存的数据
					to_page(totalRecord);
				}
			});
		});
	</script>
	
</body>
</html>