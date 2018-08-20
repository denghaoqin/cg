package com.dhq.cg.utils;

public class StringUtils {

	/**
	 * 
	 * @param str
	 * @return 把一个字符串首字母大写
	 */
	public static String capitalFirstChar(String str){
		if(str == null || str.trim().equals(""))
			return str;
		else{
			char[] charArray = str.toCharArray();
			if(charArray[0] >= 'a' && charArray[0] <= 'z'){
				charArray[0] = (char) (charArray[0] - 32);
				return String.valueOf(charArray);				
			}
			else
				return str;
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return 把带下划线的字符串转换成驼峰标识
	 */
	public static String hump(String str){
		if(str == null || str.trim().equals(""))
			return str;
		else{
			str = str.toLowerCase();
			String[] split = str.split("_");
			if(split.length>0){
				StringBuffer res = new StringBuffer(split[0]);
				for(int i=1;i<split.length;i++){
					res.append(capitalFirstChar(split[i]));
				}
				return res.toString();
			}else{
				return str;
			}
		}
	}
}
