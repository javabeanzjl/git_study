/**
 * @author 程序员阿乐
 * @description
 * @createDate 2025/3/6 09:47
 */
public class Main {


    // 功能B：新增变量
    private int count = 0;
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // 功能A：新增方法
    public void featureA() { System.out.println("Feature A"); }

    // 调试代码（未完成）
    public void debugMethod() { /* TODO */ }

    // 功能C：新增方法
    public static void getCurrentTime() {
        System.out.println("Current time: " + System.currentTimeMillis());
    }
    // 功能D：获取随机数
    public static void getRandom() {
        System.out.println("Random number: " + Math.random());
    }
    // 功能E：计算阶乘
    public static int factorial(int n) {
        int sum = n;
        while (n > 1) {
            sum = sum * (n - 1);
            n--;
        }
        return sum;
    }

    // 功能F：获取str
    public static void getStr(Object obj) {
        System.out.println(obj.toString());
    }
    // 功能H：获取最大值
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }


}

