package com.dhq.cg.utils;

public class StringUtils {

	/**
	 * 
	 * @param str
	 * @return ��һ���ַ�������ĸ��д
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
	 * @return ȥ���ַ����е��»��ߣ������»��ߺ���ĵ�һ���ַ���Ϊ��д
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
