package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *                    .::::.
 *                  .::::::::.
 *                 :::::::::::
 *             ..:::::::::::'
 *           '::::::::::::'
 *             .::::::::::
 *        '::::::::::::::..
 *             ..::::::::::::.
 *           ``::::::::::::::::
 *            ::::``:::::::::'        .:::.
 *           ::::'   ':::::'       .::::::::.
 *         .::::'      ::::     .:::::::'::::.
 *        .:::'       :::::  .:::::::::' ':::::.
 *       .::'        :::::.:::::::::'      ':::::.
 *      .::'         ::::::::::::::'         ``::::.
 *  ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 *                    '.:::::'                    ':'````..
 */
public class FileUtil {

	public static final String ROOTPATH = "src/main/resources/";
	
	/**
	* <p>Title:私有构造函数 </p>
	* <p>Description:即不允许实例化 </p>
	*/
	private FileUtil() {
	}

	/**
	* @Title: getCondition
	* @Description: 以字符串方式获取文本内容
	* @param @param fileName
	* @param @return
	* @param @throws IOException
	* @return String
	* @throws
	*/
	public static final String getCondition(String fileName) throws IOException {
		if (null == fileName || "".equals(fileName.trim())) {
			return null;
		}
		File file = null;
		BufferedReader reader = null;
		try {
			file = new File(ROOTPATH + fileName);
			reader = new BufferedReader(new FileReader(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		String temp = null;
		while ((temp = reader.readLine()) != null) {
			sb.append(temp);
		}
		return sb.toString();
	}
	
	/**
	* @Title: getConditionMap
	* @Description: 以行为单位获取文本内容
	* @param @param fileName
	* @param @return
	* @param @throws IOException
	* @return Map<String,String>  *** map结构，key为行号，value为该行读出的值  ***
	* @throws
	*/
	public static final Map<String, String> getConditionMap(String fileName) throws IOException {
		if (null == fileName || "".equals(fileName.trim())) {
			return null;
		}
		File file = null;
		BufferedReader reader = null;
		try {
			file = new File(ROOTPATH + fileName);
			reader = new BufferedReader(new FileReader(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, String> map = new HashMap<String, String>();
		String temp = null;
		int line = 1;
		while ((temp = reader.readLine()) != null) {

			map.put(String.valueOf(line), temp);
			line++;
		}
		return map;
	}
	
	/**
	* @Title: getSortCondition
	* @Description: 将排序算法待排序数据从文件取出并打包成list
	* @param @param fileName
	* @param @return
	* @param @throws IOException    param
	* @return List<Integer>    returnType
	* @throws
	*/
	public static final List<Integer> getSortCondition(String fileName) throws IOException {
		if (null == fileName || "".equals(fileName.trim())) {
			return null;
		}
		File file = null;
		BufferedReader reader = null;
		try {
			file = new File(ROOTPATH + fileName);
			reader = new BufferedReader(new FileReader(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		String temp = null;
		while ((temp = reader.readLine()) != null) {
			sb.append(temp);
		}
		List<Integer> list = new LinkedList<>();
		for (String element : Arrays.asList(sb.toString().split(","))) {
			list.add(Integer.valueOf(element));
		}
		return list;
	}
	
	/**
	* @Title: generateSortData
	* @Description: 生成排序算法的测试数据
	* @param @param fileName
	* @param @throws IOException    param
	* @return void    returnType
	* @throws
	*/
	public static void generateSortData(String fileName) throws IOException {
		if (null == fileName || "".equals(fileName.trim())) {
			return;
		}
		File file = null;
		BufferedWriter writer = null;
		try {
			file = new File(ROOTPATH + fileName);
			writer = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= 5000; i++) {
			Random random = new Random();
			sb.append(random.nextInt(10000)).append(",");
		}
		try {
			writer.write(sb.toString().substring(0, sb.length() - 1));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
}
