public class fib {

//    public static int fib(int n) {
//        if (n == 1){
//            return 0;
//        }else if (n == 2){
//            return 1;
//        }else{
//            return fib(n - 1) + fib(n - 2);
//        }
//    }


    /* 他的正确答案斐波那契的第一个数字是1 1 2*/
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        int a = fib(1);
        int b = fib(2);
        int c = fib(3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}