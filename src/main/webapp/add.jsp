<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<link href="css/index2.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="">
			<p>
				电影名称:<input type="text" name="name">
			</p>
			<p>
				剧情介绍:
				<textarea rows="10" cols="15" name="introduce"></textarea>
			</p>
			<p>
				导演:<input type="text" name="direct">
			</p>
			<p>
				发行日期:<input type="date" name="time">
			</p>
			电影分类:<div id="cid"></div>
			<span id="sp" style="color:red; "></span>
		</form>
		<button id="add">添加</button>
	</div>
	
<script type="text/javascript">


	$("#add").click(function(){
		$.post("addFilm",$("form").serialize(),function(res){
			if(res){
				alert("添加成功");
				location = "blist.jsp";
			}else{
				alert("添加失败");
			}
			
		},"json");
	});
	
	$(function(){
		$.post("clist",function(clist){
			$.each(clist,function(index,itme){
				$("#cid").append("<input type='checkbox' name='arr' value='"+itme.cid+"'>"+itme.cname);
			});
		},"json");
	});

</script>
</body>
</html>