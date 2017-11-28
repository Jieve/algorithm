package com.jieve.algorithm.sort.implement;

import java.util.List;

/**
 * @ClassName: BaseSort
 * @Description: 排序算法父类，定义一个待处理List
 * @author yyy
 * @date 2017年11月16日 下午5:40:20
 * 
 */
public abstract class BaseSort {

	List<Integer> originalList = null;

	public BaseSort(List<Integer> originalList) {
		this.originalList = originalList;
	}
}
