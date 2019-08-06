<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<jsp:include page="css/css-${param.view}" />

</head>
<body class="vertical-layout vertical-menu 2-columns   fixed-navbar" data-open="click" data-menu="vertical-menu" data-color="bg-gradient-x-purple-blue" data-col="2-columns">
	<!-- BEGIN: Header-->
    <jsp:include page="blocks/header.jsp" />
    <!-- END: Header-->
    
    <!-- BEGIN: Main Menu-->
    <jsp:include page="blocks/sidebar.jsp" />
    <!-- END: Main Menu-->

	<jsp:include page="changes/${param.view}" />
	
	<!-- BEGIN: Footer-->
	<jsp:include page="blocks/footer.jsp" />
    <!-- END: Footer-->
	
	<jsp:include page="js/js-${param.view}" />
</body>
</html>