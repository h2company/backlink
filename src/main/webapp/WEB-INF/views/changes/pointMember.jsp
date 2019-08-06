<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
											<th></th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<th scope="row">1</th>
											<td>Mark</td>
											<td>Otto</td>
											<td>@mdo</td>
											<td class="text-center">
												<button type="button" class="btn btn-outline-info mr-1">
													<i class="ft-edit"></i>
												</button>
												<button type="button" class="btn btn-outline-danger mr-1">
													<i class="ft-trash-2"></i>
												</button>
											</td>
										</tr>
										<tr>
											<th scope="row">2</th>
											<td>Mark</td>
											<td>Otto</td>
											<td>@TwBootstrap</td>
											<td class="text-center">
												<button type="button" class="btn btn-outline-info mr-1">
													<i class="ft-edit"></i>
												</button>
												<button type="button" class="btn btn-outline-danger mr-1">
													<i class="ft-trash-2"></i>
												</button>
											</td>
										</tr>
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