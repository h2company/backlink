package com.backlink.util;

import org.mindrot.jbcrypt.BCrypt;

import com.backlink.define.GlobalConfig;

public class Encrypt {
	
	public static String password(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt(GlobalConfig.GEN_SALT));
	}
}
