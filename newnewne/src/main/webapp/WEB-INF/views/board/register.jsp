<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="../includes/header.jsp"%>

<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- Page Heading -->
	<h1 class="h3 mb-2 text-gray-800">register</h1>

	<!-- DataTales Example -->
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
		</div>
		<div class="card-body"></div>
		<!-- 여기 입력폼 -->
		<form method="POST">
		<input type="text" class="form-control form-control-user" name="title" placeholder="제목">
		<!--  여기 분류 들어가야함. 분류는 대분류 소분류 도시  자바스크립트로 만들어야 할 듯 하다. -->
		<select name="firstcategory">
			<option value="아시아">아시아</option>
			<option value="유럽">유럽</option>
			<option value="북아메리카">북아메리카</option>
			<option value="남아메리카">남아메리카</option>
			<option value="오세아니아">오세아니아</option>
		</select>
		
		<select name="secondcategory">
		
		</select>
		
		<input type="text" class="form-control form-control-user" name="writer" placeholder="작성자">
		<textarea rows="20" class="form-control form-control-user" cols="40" name="content" placeholder="내용"></textarea>
		<input type="file" name="pictuers" multiple="multiple">
		<input type="SUBMIT" class="btn btn-primary btn-user btn-block" value="확인">
		</form>
	</div>


</div>
<!-- /.container-fluid -->

<script>
	var fc =$("select[name=firstcategory]"))

	$(document)
	.ready(	function() {
		console.log("ready............")
		
		
	
		
		
		
		})
</script>
<%@include file="../includes/footer.jsp"%>

