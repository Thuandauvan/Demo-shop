<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title><dec:title default="Trang chủ" /></title>
<link rel="stylesheet"
	href="<c:url value='/template/web/css/styles.css'/>" />
<link rel="icon" type="image/x-icon"
	href="<c:url value='/template/web/assets/favicon.ico'/> " />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
</head>
<body>
	<!-- header -->
	<%@ include file="/common/web/header.jsp"%>
	<!-- header -->
	
	<dec:body/>
	
	<!-- footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- footer -->


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<script src="<c:url value='/template/web/js/scripts.js'/> "></script>
</body>
</html>