package Day8;

public class Demo0ExceptionTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int ele = getIndexOfArray(arr,6);
        System.out.println(ele);
    }

    /**
     * 定义一个方法，获得一个数组中某个索引处的元素
     * 参数：
     *     int[] arr
     *     int index
     * 对使用该方法的参数进行合法性校验
     * 若不合法，就抛出对应异常，告知方法的调用者
     */

    public static int getIndexOfArray(int[] arr, int index) {
        if(arr == null){
            throw new NullPointerException("传递的数组为null");
        }
        if (index<0 || index>arr.length-1){
            throw new IndexOutOfBoundsException("索引超出范围");
        }

        int ele = arr[index];
        return ele;
    }

}
