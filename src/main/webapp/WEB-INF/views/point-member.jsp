<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Quản lý thành viên</title>
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
	<!-- END: Main Menu -->

	<div class="app-content content">
		<div class="content-wrapper">
			<div class="content-wrapper-before"></div>
			<div class="content-header row">
				<div class="content-header-left col-md-4 col-12 mb-2">
					<h3 class="content-header-title">Thành Viên</h3>
				</div>
				<div class="content-header-right col-md-8 col-12">
					<div class="breadcrumbs-top float-md-right">
						<div class="breadcrumb-wrapper mr-1">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="index.html">Trang
										chủ</a></li>
								<li class="breadcrumb-item"><a href="#">Quản Lý Điểm</a></li>
								<li class="breadcrumb-item active">Thành Viên</li>
							</ol>
						</div>
					</div>
				</div>
			</div>
			<div class="content-body">
				<c:if test="${empty pm}">
					<!-- Bordered striped start -->
					<div class="row">
						<div class="col-12">
							<div class="card">
								<div class="card-header">
									<h4 class="card-title">Thêm, xóa, sửa thành viên</h4>
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
													<th>Tên Thành Viên</th>
													<th>Username</th>
													<th>Điểm</th>
													<th>Ngày Tạo</th>
													<th></th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="pointMember" items="${listPointMember}">
													<tr>
														<th scope="row">${pointMember.id}</th>
														<td>${pointMember.account.accountInfo.fullname}</td>
														<td>${pointMember.account.username}</td>
														<td>${pointMember.point}</td>
														<td><fmt:formatDate value="${pointMember.createAt}"
																pattern="HH:mm:ss dd-MM-yyy " /></td>
														<td class="text-center"><a
															href="./point/member.html?id=${pointMember.id }"><button
																	type="button" class="btn btn-outline-info mr-1">
																	<i class="ft-edit"></i>
																</button></a>
															<button class="btn btn-outline-danger mr-1">
																<i class="ft-trash-2"></i>
															</button></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${not empty pm}">
					<!-- edit pointMember -->
					<div class="row">
						<div class="col-xl-12">
							<div class="card">
								<div class="card-header">
									<h4 class="card-title" id="horz-layout-basic">Thay Đổi
										Thông Tin Thành Viên</h4>
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
								<div class="card-content collpase show">
									<div class="card-body">
										<div class="card-text">
											<p><span style="color: red">*Chú ý:</span> Hãy cẩn trọng khi thay đổi bất kì thông tin nào.</p>
										</div>
										<form class="form form-horizontal"
											action="./point/member.html" method="POST">
											<c:if test="${not empty response}">
												<div class="alert alert-${response.status} mb-2 text-center"
													role="alert">
													<strong>${response.message}</strong>
												</div>
											</c:if>
											<div class="form-body">
												<h4 class="form-section">
													<i class="ft-clipboard"></i>Thông Tin Cá Nhân
												</h4>
												<div class="form-group row">
													<label class="col-md-3 label-control" for="projectinput5">ID</label>
													<div class="col-md-9">
														<input type="text" id="projectinput5" class="form-control"
															value="${pm.id}" name="id" readonly="readonly">
													</div>
												</div>
												<div class="form-group row">
													<label class="col-md-3 label-control" for="projectinput5">Tên
														Thành Viên</label>
													<div class="col-md-9">
														<input type="text" id="projectinput5" class="form-control"
															value="${pm.account.accountInfo.fullname}"
															name="fullname" disabled>
													</div>
												</div>
												<div class="form-group row">
													<label class="col-md-3 label-control" for="projectinput5">Username</label>
													<div class="col-md-9">
														<input type="text" id="projectinput5" class="form-control"
															value="${pm.account.username}" name="username" disabled>
													</div>
												</div>
												<div class="form-group row">
													<label class="col-md-3 label-control" for="projectinput5">Điểm</label>
													<div class="col-md-9">
														<input type="number" id="projectinput5"
															class="form-control" value="${pm.point}" name="point">
													</div>
												</div>
												<div class="form-group row">
													<label class="col-md-3 label-control" for="projectinput5">Ngày
														Tạo</label>
													<div class="col-md-9">
														<input type="text" id="projectinput5" class="form-control"
															value="<fmt:formatDate value="${pm.createAt}" pattern="HH:mm:ss dd-MM-yyy " />"
															name="createAt" disabled>
													</div>
												</div>
												<input type="hidden" name="_method" value="PUT">
											</div>
											<div class="form-actions right">
												<a href="./point/member.html"><button type="button"
														class="btn btn-danger mr-1">
														<i class="ft-x"></i> Trở về
													</button> </a>
												<button type="submit" class="btn btn-primary">
													<i class="la la-check-square-o"></i> Cập nhật
												</button>
											</div>

										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:if>
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