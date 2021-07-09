<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title><dec:title default="Trang chủ" /></title>
		<link href=" <c:url value='/template/admin/css/styles.css'/>" rel="stylesheet" />
		<link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
		<script src="<c:url value='/template/paging/jquery.twbsPagination.js' />" type="text/javascript" ></script>
		
</head>
<body class="sb-nav-fixed">
	<!-- header -->
    <%@ include file="/common/admin/header.jsp" %>
    <!-- header -->
	
	<div id="layoutSidenav">
		<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
		</script>
		<!-- menu -->
    	<%@ include file="/common/admin/menu.jsp" %>
    	<!-- menu -->
		
		<div id="layoutSidenav_content">
			<dec:body/>
			
			<!-- footer -->
	    	<%@ include file="/common/admin/footer.jsp" %>
	    	<!-- footer -->
		</div>
	</div>
	
	
	<script src="<c:url value='/template/admin/js/scripts.js' />"></script>
	<script src="<c:url value='/template/admin/assets/demo/chart-bar-demo.js' />"></script>
	<script src="<c:url value='/template/admin/assets/demo/chart-area-demo.js' />"></script>	
	<script src="<c:url value='/template/admin/js/datatables-simple-demo.js'/>"></script>	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
	
</body>
</html>