package util;

/**
* @ClassName: MathUtil
* @Description: 项目计算和比较类型工具类
* @author yyy
* @date 2017年11月14日 下午2:12:01
* 
*/
public class MathUtil {

	/**
	* @Title: toLeft
	* @Description: 判断左孩子是不是最大（在父节点、左孩子、右孩子中）
	* @param @param left
	* @param @param cur
	* @param @param right
	* @param @return    param
	* @return boolean
	* @throws
	*/
	public static boolean toLeft(int left, int cur, int right) {
		return left > cur && left >= right;
	}
	
	/**
	* @Title: toRight
	* @Description: 判断右孩子是不是最大（在父节点、左孩子、右孩子中）
	* @param @param left
	* @param @param cur
	* @param @param right
	* @param @return    param
	* @return boolean
	* @throws
	*/
	public static boolean toRight(int left, int cur, int right) {
		return right > cur && right > left;
	}
	
}
