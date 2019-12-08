package com.hepengbo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringUtils {
	
	//判断元字符串是否有值
	public static boolean isEmp(String str){
		return str == null || str.trim().length()<=0;
	}
	
	//手机号码
	public static boolean ste(String str){
		String regex = "1[3|5|6|7|8]\\d{9}";
		return str.matches(regex);
	}
	
	//判断是否电子邮箱
	public static boolean isEmail(String str){
		String regex = "\\w+@\\w{2,3}+(.com|.cn|.com.cn)";
		return str.matches(regex);
	}
	
	//判断是否全是字母
	public static boolean isString(String str){
		String regex = "[a-zA-Z]+";
		return str.matches(regex);
	}
	
	
	//将日期字符串转成Date类型
	public static Date isTime(String str) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(str);
	}
	
	//将Date转换成Calendar类型
	public static Calendar dateTo(Date date){
		Calendar instance = Calendar.getInstance();
		instance.setTime(date);
		return instance;
	}
	
	
	
	/*public static void main(String[] args){
			System.out.println(dateTo(null));
	}*/
}
