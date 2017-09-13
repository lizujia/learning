<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ModelAttribute</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		div {
			line-height: 28px;
		}
	</style>
  </head>
  
  <body>
    <div><a href="mac01/show?param=hello">测试@ModelAttribute注解修饰的方法有返回值, 返回值类型为String, 此链接中有1个param参数</a></div>
    <div><a href="mac02/show?userId=4">测试@ModelAttribute注解修饰的方法有返回值, 返回值类型为User, 此链接中有1个userId参数</a></div>
    <div><a href="mac03/show?userId=4">测试@ModelAttribute注解修饰的方法有返回值, 返回值类型为void, 此链接中有1个userId参数</a></div>
    <div><a href="mac04/show?userId=4">测试@ModelAttribute和@RequestMapping修饰同一个方法, 此链接中有1个userId参数</a></div>
    <div><a href="mac05/show?userId=4">测试@ModelAttribute修饰一个请求处理方法的参数, 此链接中有1个userId参数</a></div>
  </body>
</html>
