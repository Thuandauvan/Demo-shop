<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action=" <c:url value='/admin-product'/>" id="formId" method="get" >
<table class="table table-bordered">
    <thead>
      <tr>
        <th>Title</th>
        <th>Short Description</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="item" items="${model.listResult}">
	      <tr>
	        <td>${item.title}</td>
	        <td>${item.shortDescription}</td>
	        <td>${item.price}</td>
	      </tr>
      </c:forEach> 
    </tbody>
  </table>
<ul class="pagination" id="pagination"></ul>
<input type="hidden" id="page" value="" name="page" />
<input type="hidden" id="maxPageItem" value="" name="maxPageItem" />
<input type="hidden" id="sortName" value="" name="sortName" />
<input type="hidden" id="sortType" value="" name="sortType" />
</form>
<script type="text/javascript">
	var totalPage = ${model.totalPage};
	var currentPage = ${model.page};
	var limit = 3;
	 $(function () {
	        window.pagObj = $('#pagination').twbsPagination({
	            totalPages: totalPage,
	            visiblePages: 10,
	            startPage: currentPage,
	            onPageClick: function (event, page) {
	            	if (currentPage != page) {
	                    $('#page').val(page);
	                    $('#maxPageItem').val(limit);
	                    $('#sortName').val('title');
	                    $('#sortType').val('desc');
	                    $('#formId').submit();
	                	}
	            }
	        })
	    });
    
</script>
</body>
</html>