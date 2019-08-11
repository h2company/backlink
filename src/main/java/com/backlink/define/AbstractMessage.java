package com.backlink.define;

public interface AbstractMessage {

	final String NOT_AUTHENTICATION = "You don't have permission to access";
	final String NOT_FOUND_API = "Can't found API";
	final String SYSTEM_MAINTENANCE = "Hệ thống đang bảo trì, vui lòng thử lại sau";

	final String STATUS_ERROR = "danger";
	final String STATUS_SECCESS = "success";
	final String STATUS_WARNING = "warning";
	
	final String MESSAGE_EMAIL_INVALID = "Email không hợp lệ";
	final String MESSAGE_PHONE_INVALID = "Số điện thoại không hợp lệ. Phải là 10 số <br>(VD: 0377312606)";

	final String MESSAGE_ACCOUNT_NULL = "Tài khoản hoặc mật khẩu không đúng";
	final String MESSAGE_ACCOUNT_SUCCESS = "Đăng nhập thành công";
	
	final String MESSAGE_RIGISTER_EXIST = "Tên đăng nhập đã tồn tại";
	final String MESSAGE_RIGISTER_NOT_SAME_PASSWORD = "Mật khẩu không trùng khớp";
	final String MESSAGE_RIGISTER_PASSWORD_MUST_MIN_8_LENGTHS = "Mật khẩu phải lớn hơn hoặc bằng 8 kí tự";
	final String MESSAGE_RIGISTER_SUCCESS = "Đăng kí tài khoản thành công";
	
	final String MESSAGE_REQUIRE_INPUT = "Vui lòng nhập đầy đủ thông tin";
}
