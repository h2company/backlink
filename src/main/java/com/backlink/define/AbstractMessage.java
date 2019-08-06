package com.backlink.define;

public interface AbstractMessage {

	final String NOT_AUTHENTICATION = "You don't have permission to access";
	final String NOT_FOUND_API = "Can't found API";

	final String STATUS_ERROR = "danger";
	final String STATUS_SECCESS = "success";
	final String STATUS_WARNING = "warning";

	final String MESSAGE_ACCOUNT_NULL = "Tài khoản hoặc mật khẩu không đúng";
	final String MESSAGE_ACCOUNT_SUCCESS = "Đăng nhập thành công";
	
	final String MESSAGE_REQUIRE_INPUT = "Vui lòng nhập đầy đủ thông tin";
}
