# algorithm
## 本项目宗旨是收集各种排序和搜索算法并用JAVA语言加以实现

## 目前已实现算法有：
### 排序：
1. 选择排序：
	* HeapSort（堆排序）
	* SimpleSelectionSort（简单选择排序）
	* BinarySelectionSort（二分选择排序）
2. 插入排序：
	* StraightInsertionSort（直接插入排序）
	* BinaryInsertionSort（二分插入排序）
	* TwoPathInsertionSort（2—路插入排序）
	* ShellInsertSort（希尔插入排序）
3. 交换排序：
	* BubbleSort（冒泡排序）
	* ImprovedBubbleSort（改进的冒泡排序）
	* BinaryBubbleSort（折半的冒泡排序）
	* QuickSort（快速排序）
4. 归并排序：
	* MergeSort（归并排序）
5. 桶排序/基数排序(Radix Sort)未实现，此排序方法适用于多个排序因子，且排序因子有优先级之分的场景。

各时间复杂度下数据量与运行时间的比较：

 <img src="http://my.csdn.net/uploads/201207/21/1342856655_3698.jpg"></img>

***
### 参考文档：

* [八大排序算法](http://blog.csdn.net/hguisu/article/details/7776068)

***

注：排序算法测试数据文件sort.data,由工具类FileUtil生成，读者可修改该工具类的代码以更改测试数据的规模，
另外测试算法性能入口为MainEntrance,可通过run as Java Application测试观察不同规模数据下各个算法的差异

有疑问请联系jieve_y@163.com


***
运行环境JDK1.8


