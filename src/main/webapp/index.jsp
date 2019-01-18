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

<!-- 引入样式  -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.fr.js"></script>

<!-- layDate 日期与时间组件 -->
<!-- 官网：https://www.layui.com/laydate/ -->
<script src="${APP_PATH}/static/laydate/laydate.js"></script>

<!-- 日历控件:基于Bootstrap和jQuery的日历控件和日期选择插件 -->
<%-- <script type="text/javascript" src="${APP_PATH}/static/jquery-bootstrap-calendar/js/dcalendar.picker.js"></script>
<link type="text/css" href="${APP_PATH}/static/jquery-bootstrap-calendar/css/dcalendar.picker.css" rel="stylesheet" /> --%>
<%-- <link rel="stylesheet" href="${APP_PATH}/static/jquery-bootstrap-calendar/css/zzsc.css" type="text/css"/> --%>

</head>
<body>
	<!-- 员工修改的模态框Modal -->
	<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">员工修改</h4>
	      </div>
	      <div class="modal-body">
	      	<form class="form-horizontal">
	      	  <!-- 姓名 -->
			  <div class="form-group">
			    <label for="empName_update_input" class="col-sm-2 control-label">empName</label>
			    <div class="col-sm-10">
			      <p class="form-control-static" id="empName_update_static"></p>
			    </div>
			  </div>
			  <!-- 邮件 -->
			  <div class="form-group">
			    <label for="email_update_input" class="col-sm-2 control-label">email</label>
			    <div class="col-sm-10">
			      <input type="text" name="email" class="form-control" id="email_update_input" placeholder="email@atguigu.com">
			      <span class="help-block"></span>
			    </div>
			  </div>
			  <!-- 性别 -->
			  <div class="form-group">
			    <label class="col-sm-2 control-label">gender</label>
			    <div class="col-sm-10">
			      <label class="radio-inline">
				  	<input type="radio" name="gender" id="gender1_update_input" value="M" checked="checked"> 男
				  </label>
				  <label class="radio-inline">
					<input type="radio" name="gender" id="gender2_update_input" value="F"> 女
				  </label>
			    </div>
			  </div>
			  <!-- 部门 -->
			  <div class="form-group">
			    <label class="col-sm-2 control-label">deptName</label>
			    <div class="col-sm-4">
			      <!-- 部门提交部门id即可 -->
				  <select class="form-control" name="dId" id="dept_update_select">
				  	
				  </select>
			    </div>
			  </div>
			  
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="emp_update_btn">更新</button>
	      </div>
	    </div>
	  </div>
	</div>

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
			<div class="col-md-5 col-md-offset-7">

				<span id="date_input_label" class="glyphicon glyphicon-calendar"></span>
				<input id="date_input_text" type="text" />

				<button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
				<button class="btn btn-danger" id="emp_delete_all_btn">删除</button>
				<button class="btn btn-default" id="emp_next_page"
					onclick="window.location.href='user/login'">登录</button>
			</div>
		</div>

		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emp_table">
					<thead>
						<tr>
							<th><input type="checkbox" id="check_all" /></th>
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

		<!-- 基于Bootstrap和jQuery的日历控件和日期选择插件 -->
		<!-- <div class="row">
			<div class="col-md-6">
				<h3>日历-calendar</h3>
				<table id='mycalendar' class='calendar'></table>
			</div>
			<div class="col-md-6">
				<h3>日期选择器-datepicker</h3>
				<input id='mydatepicker' type='text' />
				<h3>格式化日期</h3>
				<input id='mydatepicker2' type='text' />
			</div>
		</div> -->
		<div class="row">
			<label>中文版</label><input type="text" id="test1">
			<label>国际版</label><input type="text" id="test1-1">
		</div>
		<div class="row">
		</div>
	</div>

	<script type="text/javascript">
	
		// 日历控件:基于Bootstrap和jQuery的日历控件和日期选择插件
/* 		$('#mydatepicker').dcalendarpicker();
		$('#mydatepicker2').dcalendarpicker({
			format:'yyyy-MM-dd'
		});
		$('#mycalendar').dcalendar(); */
		
		// 日时控件 bootstrap-datetimepicker
		$('#date_input_text').datetimepicker({
			language:  'fr',
			format: 'yyyy-mm-dd',
	    });
		
		
		//常规用法
		laydate.render({
		  elem: '#test1'
		});
		//国际版
		laydate.render({
		  elem: '#test1-1'
		  ,lang: 'en'
		}); 

		// 总记录数 ,当前页
		var totalRecord, currentPage;
		
		// 1.页面加载完成以后，直接去发送一个ajax请求,要到分页数据
		$(function(){
			// 去首页
			to_page(1);
		});
		
		function to_page(pn){
			
			// 清除全选按钮
			$("#check_all").prop("checked",false);
			
			$('#emp_delete_all_btn').attr("disabled","disabled"); 
			
			$.ajax({
				url:"${APP_PATH}/emps",
				data:"pn="+pn,
				type:"GET",
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
				var checkBoxTd = $("<td style='vertical-align:middle;'><input type='checkbox' class='check_item' /></td>");
				var empIdTd = $("<td style='vertical-align:middle;'></td>").append(item.empId);
				var empNameTd = $("<td style='vertical-align:middle;'></td>").append(item.empName);
				var genderTd = $("<td style='vertical-align:middle;'></td>").append(item.gender=='M'?"男":"女");
			//或 var genderTd = $("<td style='vertical-align:middle;'></td>").append(item.gender=="M"?"男":"女");
				var emailTd = $("<td style='vertical-align:middle;'></td>").append(item.email);
				var deptNameTd = $("<td style='vertical-align:middle;'></td>").append(item.department.deptName);

				// 编辑按钮
				var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
								.append($("<span></span>").addClass("glyphicon glyphicon-pencil"))
								.append("编辑");
				// 为编辑按钮添加一个自定义的属性,来表示当前员工的id
				editBtn.attr("edit-id",item.empId);
				
				var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
								.append($("<span></span>").addClass("glyphicon glyphicon-trash"))
								.append("删除");
				
				// 为删除按钮添加一个自定义的属性,来表示当前员工的id
				delBtn.attr("del-id",item.empId);
				
				var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
				
				$("<tr></tr>").append(checkBoxTd)
							.append(empIdTd)
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
			currentPage = result.extend.pageInfo.pageNum;
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
		
		// 清除表单内容和样式
		function reset_form(ele){
			// 表单内容
			$(ele)[0].reset();
			// 表单样式
			$(ele).find("*").removeClass("has-error has-success");
			$(ele).find(".help-block").text("");
		}
		
		// 点击新增按钮弹出模态框
		$("#emp_add_modal_btn").click(function(){
			
			// 清除表单数据(表单完整重置(表单数据,表单样式))
			reset_form("#empAddModal form");
			
			// 发出Ajax请求,查出部门信息,显示在下拉列表中
			getDepts("#empAddModal select");
			//或 getDepts("#dept_add_select");;
			
			// 弹出模态框
			$("#empAddModal").modal({
				backdrop:"static"
			});
		});
		
		// 查出所有的部门信息并显示在下拉列表中
		function getDepts(ele){
			
			// 清空下拉列表
			$(ele).empty();
			
			$.ajax({
				url:"${APP_PATH}/depts",
				type:"GET",
				success:function(result){

					// 显示部门信息的下拉列表
					$.each(result.extend.depts, function(){
						var optionEle = $("<option></option>").append(this.deptId + ":" + this.deptName).attr("value", this.deptId);
						optionEle.appendTo(ele);
					});
				}
			});
		}
		
		// 校验表单数据方法	.has-warning、.has-error 或 .has-success
		function validate_add_form(){
			// 1,校验用户名
			var empName = $("#empName_add_input").val();
			var regName = /(^[a-zA-Z0-9_-]{3,16}$)|(^[\u2E80-\u9FFF]{2,6}$)/;
			if(!regName.test(empName)) {
				// .has-warning、.has-error 或 .has-success
				show_validate_msg("#empName_add_input","has-error","员工名:2-6位中文 或者 3-16位英文和数字的组合")
				
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
		
		// 校验用户名是否可用
		$("#empName_add_input").change(function(){
			// 发送Ajax请求校验用户名是否可用
			empName = this.value;
			$.ajax({
				url:"${APP_PATH}/checkuser",
				type:"POST",
				data:"empName=" + empName,
				success:function(result){
					if(result.code == 100) {
						show_validate_msg("#empName_add_input","has-success","用户名可用");
						$("#emp_save_btn").attr("ajax-va","success");
					} else {
						show_validate_msg("#empName_add_input","has-error",result.extend.va_msg);
						$("#emp_save_btn").attr("ajax-va","error");
					}
				}
			});
		});

		// 1,模态框中填写的表单数据提交给服务器进行保存
		$("#emp_save_btn").click(function(){
			// 1,对提交给服务器的数据进行校验
			if(!validate_add_form()){
				return false;
			}

			// 2,判断之前的ajax用户名校验是否成功.如果成功
			if($(this).attr("ajax-va") == "error") {
				return false;
			}
			
			// 3,发送ajax请求保存员工
			$.ajax({
				url:"${APP_PATH}/emp",
				type:"POST",
				data:$("#empAddModal form").serialize(),
				success:function(result){
					
					// 后端校验成功(JSR303校验)
					if(result.code == 100) {
						// 员工保存成功
						// 1,关闭模态框
						$('#empAddModal').modal('hide');
						
						// 2,来到最后一页,查看保存的数据
						to_page(totalRecord);
					
					// 显示失败信息
					} else {
						
						if(undefined != result.extend.errorFields.empName) {
							// 显示名字错误信息
							show_validate_msg("#empName_add_input","has-error",result.extend.errorFields.empName);
						}
						if(undefined != result.extend.errorFields.email) {
							// 显示邮箱错误信息
							show_validate_msg("#email_add_input","has-error",result.extend.errorFields.email);
						}
					}
				}
			});
		});
		
		// 1,我们是按钮创建之前就绑定click,所以绑定不上
		// 2,解决方法 1)可以在创建按钮的时候绑定 2)绑定点击.live()--在新版jquery中live方法被删除,使用on进行替代
		$(document).on("click",".edit_btn",function(){
			
			// 1,查出部门信息,并显示部门列表
			//getDepts("#dept_update_select");
			getDepts("#empUpdateModal select");

			// 2,查出员工信息,显示员工信息
			getEmp($(this).attr("edit-id"));
			
			// 3,把员工的id传递给模态框的更新按钮
			$("#emp_update_btn").attr("edit-id",$(this).attr("edit-id"));
			
			// 弹出模态框
			$("#empUpdateModal").modal({
				backdrop:"static"
			});
		});
		
		// 查出要编辑的员工信息
		function getEmp(id){
			$.ajax({
				url:"${APP_PATH}/emp/"+id,
				type:"GET",
				success:function(result){
					//console.log(result);
					var empData = result.extend.emp;
					$("#empName_update_static").text(empData.empName);
					$("#email_update_input").val(empData.email);
					$("#empUpdateModal input[name=gender]").val([empData.gender]);
					$("#empUpdateModal select").val([empData.dId]);
					//或$("#dept_update_select").val(empData.dId);
				}
			});
		}
		
		// 点击更新,更新员工信息
		$("#emp_update_btn").click(function(){
			
			// 1,校验邮箱信息
			var email = $("#email_update_input").val();
			var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
			if(!regEmail.test(email)) {
				show_validate_msg("#email_update_input","has-error","邮箱格式不正确")
				return false;
			} else {
				show_validate_msg("#email_update_input","has-success","")
			}
			
			// 2,发送ajax请求保存更新的员工数据
			$.ajax({
				url:"${APP_PATH}/emp/"+$(this).attr("edit-id"),
				// ---------------------
				//type:"POST",
				//data:$("#empUpdateModal form").serialize()+"&_method=PUT",
				// ----------------------
				type:"PUT",
				data:$("#empUpdateModal form").serialize(),
				success:function(result){

					// 后端校验成功(JSR303校验)
			//		if(result.code == 100) {
						// 员工保存成功
						// 1,关闭模态框
						$("#empUpdateModal").modal('hide');
						
						// 2,回到本页,查看修改的数据
						to_page(currentPage);
					/*
					// 显示失败信息
					} else {
						
						if(undefined != result.extend.errorFields.empName) {
							// 显示名字错误信息
							show_validate_msg("#empName_add_input","has-error",result.extend.errorFields.empName);
						}
						if(undefined != result.extend.errorFields.email) {
							// 显示邮箱错误信息
							show_validate_msg("#email_add_input","has-error",result.extend.errorFields.email);
						}
					} */
				}
			});
		});

		// 删除单个员工信息
		$(document).on("click",".delete_btn",function(){
			
			// 1,弹出删除确认框
			var empName = $(this).parents("tr").find("td:eq(2)").text();
			var empId = $(this).attr("del-id");
			if(confirm("确认删除【" + empName + "】吗?")) {
				// 确认,发送删除请求
				$.ajax({
					url:"${APP_PATH}/emp/"+empId,
					type:"DELETE",
					success:function(result){
						alert(result.msg);
						
						// 2,回到本页,查看删除情况
						to_page(currentPage);
					}
				});
			}

		});
		
		// 完成全选/全部选功能
		$("#check_all").click(function(){
			// attr获取checked是undefined;
			//alert($(this).attr("checked"));
			// 使用prop修改和读取dom原生属性,使用attr获取自定义属性;
			$(".check_item").prop("checked",$(this).prop("checked"));
			
			// 删除按钮制御
			if($(".check_item:checked").length > 0) {
				$('#emp_delete_all_btn').removeAttr("disabled"); 
			} else {
				$('#emp_delete_all_btn').attr("disabled","disabled"); 
			}
		});
		
		// check_item
		$(document).on("click",".check_item",function(){
			// 判断当前选择中的元素是否是6个
			var flag = $(".check_item:checked").length == $(".check_item").length;
			$("#check_all").prop("checked",flag);

			// 删除按钮制御
			if($(".check_item:checked").length > 0) {
				$('#emp_delete_all_btn').removeAttr("disabled"); 
			} else {
				$('#emp_delete_all_btn').attr("disabled","disabled"); 
			}
		});
		
		// 点击全部删除,就批量删除
		$("#emp_delete_all_btn").click(function(){

			var empIds = "";
			var empNames = "";
			$.each($(".check_item:checked"),function(){
				// 组装员工id,empName字符串
				empIds += $(this).parents("tr").find("td:eq(1)").text() + "-";
				empNames += $(this).parents("tr").find("td:eq(2)").text() + ",";
			});
			// 去除empIds中多余的"-"
			empIds = empIds.substring(0, empIds.length - 1);
			// 去除empNames中多余的","
			empNames = empNames.substring(0, empNames.length - 1);
			
			if(confirm("确认删除【" + empNames + "】吗?")) {
				// 确认,发送删除请求
				$.ajax({
					url:"${APP_PATH}/emp/"+empIds,
					type:"DELETE",
					success:function(result){
						alert(result.msg);
						
						// 2,回到当前页,查看删除情况
						to_page(currentPage);
					}
				});
			}
		});
		
		// 页面跳转
		/*$("#emp_next_page").click(function(){

			$.ajax({
				url:"${APP_PATH}/user/gotologin",
				type:"POST"
			});
		});*/
	</script>
	
</body>
</html>