<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>日历控件</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>

<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.3.1.min.js"></script>

<!-- 引入样式  -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<!-- layDate 日期与时间组件 -->
<!-- 官网：https://www.layui.com/laydate/ -->
<script src="${APP_PATH}/static/laydate/laydate.js"></script>

<script src="${APP_PATH}/js/dateTimeExample.js"></script>
</head>
<body>
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>日历控件</h3>
			</div>
		</div>
		<br>
		<label>常规用法</label>
		<div class="row">
			<label>中文版</label><input type="text" id="test1" placeholder="yyyy-MM-dd">
			<label>国际版</label><input type="text" id="test1-1" placeholder="yyyy-MM-dd">
		</div>
		<br>
		<label>其它选择器</label>
		<div class="row">
			<label>年选择器</label><input type="text" id="test2" placeholder="yyyy">
			<label>年月选择器</label><input type="text" id="test3" placeholder="yyyy-MM">
			<label>时间选择器</label><input type="text" id="test4" placeholder="HH:mm:ss">
		</div>
		<div class="row">
			<label>日期时间选择器</label><input type="text" id="test5" placeholder="yyyy-MM-dd HH:mm:ss">
		</div>
		<br>		
		<label>范围选择</label>
		<div class="row">
			<label>日期范围</label><input type="text" id="test6" placeholder=" - ">
			<label>年范围</label><input type="text" id="test7" placeholder=" - ">
			<label>年月范围</label><input type="text" id="test8" placeholder=" - ">
		</div>
		<div class="row">
			<label>时间范围</label><input type="text" id="test9" placeholder=" - ">
			<label>日期时间范围</label><input type="text" id="test10" placeholder=" - ">
		</div>
		<br>
		<label>自定义格式 </label>
		<div class="row">
			<label>请选择日期</label><input type="text" id="test11" placeholder="yyyy年MM月dd日">
			<label>请选择日期</label><input type="text" id="test12" placeholder="dd/MM/yyyy">
			<label>请选择月份</label><input type="text" id="test13" placeholder="yyyyMM">
		</div>
		<div class="row">
			<label>请选择时间</label><input type="text" id="test14" placeholder="H点m分">
			<label>请选择范围</label><input type="text" id="test15" placeholder=" ~ ">
			<label>请选择范围</label><input type="text" id="test16" placeholder="开始 到 结束">
		</div>
		<br>
		<label>公历节日和自定义重要日子</label>
		<div class="row">
			<label>开启公历节日</label><input type="text" id="test17" placeholder="yyyy-MM-dd">
			<label>自定义重要日</label><input type="text" id="test18" placeholder="yyyy-MM-dd">
		</div>
		<br>
		<label>公历节日和自定义重要日子</label>
		<div class="row">
			<label>限定可选日期</label><input type="text" id="test-limit1" placeholder="yyyy-MM-dd">
			<label>前后若干天可选</label><input type="text" id="test-limit2" placeholder="yyyy-MM-dd">
			<label>限定可选时间</label><input type="text" id="test-limit3" placeholder="HH:mm:ss">
		</div>
		<br>
		<label>同时绑定多个</label>
		<div class="row">
			<label>限定可选日期</label><input type="text" class="test-item" placeholder="yyyy-MM-dd">
			<label>前后若干天可选</label><input type="text" class="test-item" placeholder="yyyy-MM-dd">
			<label>限定可选时间</label><input type="text" class="test-item" placeholder="yyyy-MM-dd">
		</div>		
		<br>
		<label>其它功能示例 </label>
		<div class="row">
			<label>初始赋值</label><input type="text" id="test19" placeholder="yyyy-MM-dd">
			<label>选中后的回调</label><input type="text" id="test20" placeholder="yyyy-MM-dd">
			<label>日期切换的回调</label><input type="text" id="test21" placeholder="yyyy-MM-dd">
		</div>
		<div class="row">
			<label>不出现底部栏</label><input type="text" id="test22" placeholder="yyyy-MM-dd">
			<label>只出现确定按钮</label><input type="text" id="test23" placeholder="yyyy-MM-dd">
			<label>自定义事件</label><input type="text" id="test24" placeholder="yyyy-MM-dd">
		</div>
		<div class="row">
			<label id="test25-1">点我触发</label><input type="text" id="test25" placeholder="yyyy-MM-dd">
			<label id="test26-1">双击我触发</label><input type="text" id="test26" placeholder="yyyy-MM-dd">
			<label>日期只读</label><input type="text" id="test27" readonly placeholder="yyyy-MM-dd">
		</div>
		<div class="row">
			<label>非input元素</label><input type="text" id="test28">
		</div>
		
		<br>
		<label>其它主题</label>
		<div class="row">
			<label>墨绿主题</label><input type="text" id="test29" placeholder="yyyy-MM-dd">
			<label>自定义颜色主题</label><input type="text" id="test30" placeholder="yyyy-MM-dd">
			<label>格子主题</label><input type="text" id="test31" placeholder="yyyy-MM-dd">
		</div>
		<br>
		<br>
		<br>
		<label>閉じる</label>		
	</div>
</body>
</html>