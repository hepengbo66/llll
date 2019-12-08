<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<form action="query" method="post">
		<input type="hidden" name="pageNum" value="1">
		电影名称:<input type="text" name="key" value="${model.key}">
		<input type="submit" value="提交">
	</form>
	<button onclick="topye(1)">首页</button>
	<button onclick="topye(${model.pageNum-1})">上一页</button>
	当前${model.pageNum}页/总共${model.pages}页
	<button onclick="topye(${model.pageNum+1})">下一页</button>
	<button onclick="topye(${model.pages})">尾页</button>
		<table>
			<tr>
				<th>请选择</th>
				<th>序号</th>
				<th>电影名称</th>
				<th>剧情介绍</th>
				<th>导演</th>
				<th>分类</th>
				<th>日期</th>
				<th>操作</th>
			</tr>
			
			<c:forEach items="${list}" var="l">
				<tr>
					<td>
						<input type="checkbox" name="ch" value="${l.id}">
					</td>
					<td>${l.id}</td>
					<td>${l.name}</td>
					<td>${l.introduce}</td>
					<td>${l.direct}</td>
					<td>
						<c:forEach items="${l.cla}" var="c">
							${c.cname}
						</c:forEach>
					</td>
					<td>
						<f:formatDate value="${l.time}" pattern="yyyy-MM-dd"/>
					</td>
					<td>
						<button onclick="del(${l.id})">删除</button>
					</td>
				</tr>
			</c:forEach>
		</table>
		<button id="add">添加</button>
		<button id="dels">批删</button>
	</div>
	
<script type="text/javascript">

	function topye(t){
		$("[name=pageNum]").val(t);
		$("form").submit();
	}
	
	$("#add").click(function(){
		location = "add.jsp";
	});

	$("#dels").click(function(){
		var id = $("[name=ch]:checked").map(function(){
			return $(this).val();
		}).get().join(",");
		del(id);
	});
	
	function del(id){
		var ho = confirm("确定要"+id+"删除吗");
		if(ho){
			$.post("delete?ids="+id,function(res){
				if(res){
					alert("删除成功");
					history.go(0);
				}else{
					alert("删除失败");
				}
			},"json");
		}
	}
	

</script>
</body>
</html>