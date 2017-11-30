package com.jieve.utils;

import java.util.List;

/**
* @ClassName: CollectionUtil
* @Description: 集合工具类
* @author yyy
* @date 2017年11月22日 下午4:18:34
* 
*/
public class CollectionUtil {

	/**
	* <p>Title:私有构造函数 </p>
	* <p>Description:即不允许实例化 </p>
	*/
	private CollectionUtil() {
	}
	
	public static <T> boolean equals(List<T> cur, List<T> list) {
		
		boolean flag = true;
		for (int i = 0; i < cur.size(); i++) {
			if (Integer.compare((Integer)cur.get(i), (Integer)list.get(i)) != 0) {
				System.out.println(i + "_" + cur.get(i) + "_" + list.get(i));
				flag = false;
			}

		}
		return flag;
		
	}
	
	public static <T> String array2String(T array, int dimension) {
		if (null == array ||dimension<1||dimension>2) {
			return null;
		}
		String result = null;
		switch (dimension) {
		case 1:
			
			result = array2String((int[])array);
			break;
		case 2:
			result = array2String((int[][])array);
			break;

		default:
			break;
		}
		return result;
		
	}
	
	private static String array2String(int[] array) {
		StringBuffer sb = new StringBuffer();
		if (array.length>0) {
			sb.append("{");
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i]);
				if (i != array.length-1) {
					sb.append(",");
				}
			}
			sb.append("}");
		}
		return sb.toString();
		
	}
	private static String array2String(int[][] array) {
		StringBuffer sb = new StringBuffer();
		if (array.length>0){
			sb.append("{");
			for (int i = 0; i < array.length; i++) {
				sb.append(array2String(array[i]));
				if (i != array.length-1) {
					sb.append(",");
				}
			}
			sb.append("}");
		}
		return sb.toString();
		
	}

}
