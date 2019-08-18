<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>HỆ THỐNG BACKLINK</title>
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
<link rel="stylesheet" type="text/css"
	href="app-assets\vendors\css\charts\chartist.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\vendors\css\charts\chartist-plugin-tooltip.css">
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
<link rel="stylesheet" type="text/css"
	href="app-assets\css\core\colors\palette-gradient.min.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\pages\chat-application.css">
<link rel="stylesheet" type="text/css"
	href="app-assets\css\pages\dashboard-analytics.min.css">
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

	<!-- BEGIN: Content-->
	<div class="app-content content">
		<div class="content-wrapper">
			<div class="content-wrapper-before"></div>
			<div class="content-header row"></div>
			<div class="content-body">
				<!-- Revenue, Hit Rate & Deals -->
				<div class="row">
					<div class="col-lg-8 col-md-12">
						<div class="card">
							<div class="card-header">
								<h4 class="card-title">Thống Kê Lưu Lượng Backlink</h4>
								<a class="heading-elements-toggle"><i
									class="la la-ellipsis-v font-medium-3"></i></a>
								<div class="heading-elements">
									<ul class="list-inline mb-0">
										<li><button type="button"
												class="btn btn-glow btn-round btn-bg-gradient-x-red-pink">Xem
												thêm</button></li>
									</ul>
								</div>
							</div>
							<div class="card-content collapse show">
								<div class="card-body p-0 pb-0">
									<div class="chartist">
										<div id="project-stats" class="height-350 areaGradientShadow1"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-12">
						<div class="row">
							<div class="col-12">
								<div class="card pull-up">
									<div class="card-header">
										<h4 class="card-title float-left">Tác vụ</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis-v font-medium-3"></i></a> <span
											class="badge badge-pill badge-info float-right m-0">Đang trong tiến trình</span>
									</div>
									<div class="card-content collapse show">
										<div class="card-body pt-0 pb-1">
											<h6 class="text-muted font-small-3">Task đã hoàn thành:
												4/10</h6>
											<div class="progress progress-sm mt-1 mb-0 box-shadow-2">
												<div class="progress-bar bg-gradient-x-info"
													role="progressbar" style="width: 25%" aria-valuenow="25"
													aria-valuemin="0" aria-valuemax="100"></div>
											</div>
											<div class="media d-flex">
												<div class="align-self-center">
													<h6 class="text-bold-600 mt-2">
														Chiến dịch: <span class="info">Xeon Inc.</span>
													</h6>
													<h6 class="text-bold-600 mt-1">
														Deadline: <span class="blue-grey">25/08/2019</span>
													</h6>
												</div>
												<div class="media-body text-right mt-2">
													<ul class="list-unstyled users-list">
														<li data-toggle="tooltip" data-popup="tooltip-custom"
															data-original-title="John Doe"
															class="avatar avatar-sm pull-up"><img
															class="media-object rounded-circle"
															src="app-assets\images\portrait\small\avatar-s-19.png"
															alt="Avatar"></li>
														<li data-toggle="tooltip" data-popup="tooltip-custom"
															data-original-title="Katherine Nichols"
															class="avatar avatar-sm pull-up"><img
															class="media-object rounded-circle"
															src="app-assets\images\portrait\small\avatar-s-18.png"
															alt="Avatar"></li>
														<li data-toggle="tooltip" data-popup="tooltip-custom"
															data-original-title="Joseph Weaver"
															class="avatar avatar-sm pull-up"><img
															class="media-object rounded-circle"
															src="app-assets\images\portrait\small\avatar-s-17.png"
															alt="Avatar"></li>
													</ul>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12">
								<div class="card pull-up border-top-info border-top-3 rounded-0">
									<div class="card-header">
										<h4 class="card-title">
											Khách hàng mới  <span
												class="badge badge-pill badge-info float-right m-0">500+</span>
										</h4>
									</div>
									<div class="card-content collapse show">
										<div class="card-body p-1">
											<h4 class="font-large-1 text-bold-400">
												185,055 <i class="ft-users float-right"></i>
											</h4>
										</div>
										<div class="card-footer p-1">
											<span class="text-muted"><i
												class="la la-arrow-circle-o-up info"></i> Tăng 23.67%</span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--/ Revenue, Hit Rate & Deals -->
				<!-- Emails Products & Avg Deals -->
				<div class="row">
					<div class="col-md-12 col-lg-12">
						<div class="card">
							<div class="card-header p-1">
								<h4 class="card-title float-left">
									Chiến dịch SEO - <span class="blue-grey lighten-2 font-small-3 mb-0">08/08/2019 - 09/09/2019</span>
								</h4>
								<span class="badge badge-pill badge-info float-right m-0">Đang trong tiến trình</span>
							</div>
							<div class="card-content collapse show">
								<div class="card-footer text-center p-1">
									<div class="row">
										<div
											class="col-md-3 col-12 border-right-blue-grey border-right-lighten-5 text-center">
											<p class="blue-grey lighten-2 mb-0">Tasks</p>
											<p class="font-medium-5 text-bold-400">56</p>
										</div>
										<div
											class="col-md-3 col-12 border-right-blue-grey border-right-lighten-5 text-center">
											<p class="blue-grey lighten-2 mb-0">Hoàn thành</p>
											<p class="font-medium-5 text-bold-400">58%</p>
										</div>
										<div
											class="col-md-3 col-12 border-right-blue-grey border-right-lighten-5 text-center">
											<p class="blue-grey lighten-2 mb-0">Chưa giải quyết</p>
											<p class="font-medium-5 text-bold-400">42%</p>
										</div>
										<div class="col-md-3 col-12 text-center">
											<p class="blue-grey lighten-2 mb-0">Thời hạn</p>
											<p class="font-medium-5 text-bold-400">09/09/2019</p>
										</div>
									</div>
									<hr>
									<span class="text-muted"><a href="#"
										class="danger darken-2">Backlink H2TEAM</a> Số liệu thống kê</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--/ Emails Products & Avg Deals -->
				<!--/ Products sell and New Orders -->
			</div>
		</div>
	</div>
	<!-- END: Content-->

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
	<script src="app-assets\vendors\js\charts\chartist.min.js"
		type="text/javascript"></script>
	<script
		src="app-assets\vendors\js\charts\chartist-plugin-tooltip.min.js"
		type="text/javascript"></script>
	<!-- END: Page Vendor JS-->

	<!-- BEGIN: Theme JS-->
	<script src="app-assets\js\core\app-menu.min.js" type="text/javascript"></script>
	<script src="app-assets\js\core\app.min.js" type="text/javascript"></script>
	<script src="app-assets\js\scripts\customizer.min.js"
		type="text/javascript"></script>
	<script src="app-assets\vendors\js\jquery.sharrre.js"
		type="text/javascript"></script>
	<!-- END: Theme JS-->

	<!-- BEGIN: Page JS-->
	<script src="app-assets\js\scripts\pages\dashboard-analytics.min.js"
		type="text/javascript"></script>
	<!-- END: Page JS-->
</body>
</html>
