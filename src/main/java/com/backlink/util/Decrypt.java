package com.backlink.util;

import org.mindrot.jbcrypt.BCrypt;

public class Decrypt {

	public static boolean verify(String password, String hashed) {
		return BCrypt.checkpw(password, hashed);
	}
}
