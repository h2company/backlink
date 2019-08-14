<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Quản Lý POINT LOG</title>
<link rel="apple-touch-icon"
	href="app-assets\images\ico\apple-icon-120.png">
<link rel="shortcut icon" type="image/x-icon"
	href="app-assets\images\ico\favicon.ico">
<link
	href="https://fonts.googleapis.com/css?family=Muli:300,300i,400,400i,600,600i,700,700i%7CComfortaa:300,400,700"
	rel="stylesheet">

<!-- BEGIN: Vendor CSS-->
<link rel="stylesheet" type="text/css"
	href="app-assets\vendors\css\vendors.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\vendors\css\forms\toggle\switchery.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\plugins\forms\switch.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\core\colors\palette-switch.min.css">
<!-- END: Vendor CSS-->

<!-- BEGIN: Theme CSS-->
<link rel="stylesheet" type="text/css"
	href="app-assets\css\bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\bootstrap-extended.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\colors.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\components.min.css">
<!-- END: Theme CSS-->

<!-- BEGIN: Page CSS-->
<link rel="stylesheet" type="text/css"
	href="app-assets\css\core\menu\menu-types\vertical-menu.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\core\colors\palette-gradient.min.css">
<!-- END: Page CSS-->

<!-- BEGIN: Custom CSS-->
<link rel="stylesheet" type="text/css" href="assets\css\style.css">
<!-- END: Custom CSS-->
</head>
<body class="vertical-layout vertical-menu 2-columns   fixed-navbar"
	data-open="click" data-menu="vertical-menu"
	data-color="bg-gradient-x-purple-blue" data-col="2-columns">

	<!-- BEGIN: Header-->
	<jsp:include page="blocks/header.jsp" />
	<!-- END: Header-->

	<!-- BEGIN: Main Menu-->
	<jsp:include page="blocks/sidebar.jsp" />
	<!-- END: Main Menu-->

	<div class="app-content content">
		<div class="content-wrapper">
			<div class="content-wrapper-before"></div>
			<div class="content-header row">
				<div class="content-header-left col-md-4 col-12 mb-2">
					<h3 class="content-header-title">Lịch Sử - Log</h3>
				</div>
				<div class="content-header-right col-md-8 col-12">
					<div class="breadcrumbs-top float-md-right">
						<div class="breadcrumb-wrapper mr-1">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="index.html">Trang
										chủ</a></li>
								<li class="breadcrumb-item"><a href="#">Quản Lý Điểm</a></li>
								<li class="breadcrumb-item active">Log</li>
							</ol>
						</div>
					</div>
				</div>
			</div>
			<div class="content-body">
				<!-- Bordered striped start -->
				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-header">
								<h4 class="card-title">Hoạt động gần đây</h4>
								<a class="heading-elements-toggle"><i
									class="la la-ellipsis-v font-medium-3"></i></a>
								<div class="heading-elements">
									<ul class="list-inline mb-0">
										<li><a data-action="collapse"><i class="ft-minus"></i></a></li>
										<li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
										<li><a data-action="expand"><i class="ft-maximize"></i></a></li>
										<li><a data-action="close"><i class="ft-x"></i></a></li>
									</ul>
								</div>
							</div>
							<div class="card-content collapse show">
								<div class="table-responsive">
									<table class="table table-bordered table-striped">
										<thead>
											<tr>
												<th>#</th>
												<th>Username</th>
												<th>IDLog</th>
												<th>Mô Tả</th>
												<th>Ngày</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="count" value="1" />
											<c:forEach var="pointLog" items="${listPointLog}">
												<tr>
													<th scope="row">${count}</th>
													<td>${pointLog.pointMember.account.username}</td>
													<td>${pointLog.id}</td>
													<td>${pointLog.des}</td>
													<td>${pointLog.createAt}</td>
												</tr>
												<c:set var="count" value="${count + 1 }" />
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- BEGIN: Footer-->
	<jsp:include page="blocks/footer.jsp" />
	<!-- END: Footer-->

	<!-- BEGIN: Vendor JS-->
	<script src="app-assets\vendors\js\vendors.min.js"
		type="text/javascript"></script>
	<script src="app-assets\vendors\js\forms\toggle\switchery.min.js"
		type="text/javascript"></script>
	<script src="app-assets\js\scripts\forms\switch.min.js"
		type="text/javascript"></script>
	<!-- BEGIN Vendor JS-->

	<!-- BEGIN: Page Vendor JS-->
	<!-- END: Page Vendor JS-->

	<!-- BEGIN: Theme JS-->
	<script src="app-assets\js\core\app-menu.min.js" type="text/javascript"></script>
	<script src="app-assets\js\core\app.min.js" type="text/javascript"></script>
	<script src="app-assets\js\scripts\customizer.min.js"
		type="text/javascript"></script>
	<script src="app-assets\vendors\js\jquery.sharrre.js"
		type="text/javascript"></script>
	<!-- END: Theme JS-->
</body>
</html>