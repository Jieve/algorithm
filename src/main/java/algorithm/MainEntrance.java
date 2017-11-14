package algorithm;

import java.io.IOException;
import java.util.List;

import implement.HeapSort;
import interfaces.Sort;
import util.FileUtil;

/**
* @ClassName: MainEntrance
* @Description: 程序运行主入口
* @author yyy
* @date 2017年11月14日 下午2:11:01
* 
*/
public class MainEntrance {

	public static void main(String[] args) {
		
		List<Integer> originalList = null;
		try {
			originalList = FileUtil.getSortCondition("sort.data");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sort heapSort = new HeapSort();
		long start = System.nanoTime();
		heapSort.process(originalList);
		long end = System.nanoTime();
		System.out.println("耗时：" + (end - start) + "ns");
		System.out.println(originalList);
//		System.out.println(1<<31);
//		System.out.println(Integer.MAX_VALUE);
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append("289234732");
//		System.out.println(sb.toString().substring(0,sb.length()-1));
		
//		try {
//			FileUtil.generateSortData("sort.data");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
