package com.backlink.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

	private final static String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	public static Date parseStringToDate(String stringDate) {
		try {
			return sdf.parse(stringDate);
		} catch (ParseException e) {
			return null;
		}
	}

	public static String parseDateToString(Date date) {
		return sdf.format(date);
	}
	
	public static boolean notNull(String... data) {
		boolean result = false;
		if(data != null && data.length > 0) {
			result = !result;
			for(String field : data) {
				if(field.equals("")) {
					result = !result;
					break;
				}
			}
		}
		return result;
	}

}
