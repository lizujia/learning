<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>book08/books</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
        <script type="text/javascript" src="js/jQuery.v1.11.1.min.js"></script>
        <script type="text/javascript" src="js/json2.js"></script>
        <script type="text/javascript">
            $(function(){
                
                function add() {
                    var _name = $('#name').val(),
                        _auth = $('#auth').val();
                    
                    if(_name == "") {
                    	alert("书名不能为空");
                    	return ;
                    }
                    if(_auth == "") {
                        alert("作者不能为空");
                        return ;
                    }
                    
                    $.ajax({
                        type: "post",
                        url: "book08/add",
                        dataType: "json",
                        contentType:"application/json;charset=utf-8",
                        // JSON.stringify()用于将Javascript对象转换为JSON字符串
                        data: JSON.stringify({
                            bookName: _name,
                            author: _auth
                        }),
                        success: function(data) {
                            var _tr = $("<tr/>");
                            $("<td/>").html(data.id).appendTo(_tr);
                            $("<td/>").html(data.bookName).appendTo(_tr);
                            $("<td/>").html(data.author).appendTo(_tr);
                            $("#booktable").append(_tr);
                            $("input[type=text]").val("");
                            alert("添加成功");
                        },
                        error: function(rs) {
                            alert("error...");
                        }
                    });
                    
                }
                
                $('#addbutton').click(function() {
                    add();
                });
                
            });
        </script>
</head>

<body>
	<div>
	 书名: <input id="name" type="text" />
	作者: <input id="auth" type="text" />
	<input id="addbutton" type="button" value="添加" />
	</div>
	<table id="booktable">
		<tr>
			<td>序号</td>
			<td>书名</td>
			<td>作者</td>
		</tr>
		<c:forEach items="${books}" varStatus="i" var="item" >
		<tr>
			<td>${item.id }</td>
			<td>${item.bookName }</td>
			<td>${item.author }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
