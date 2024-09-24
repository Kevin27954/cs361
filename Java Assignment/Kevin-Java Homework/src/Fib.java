public class Fib {
    
    public static void main(String[] args) {
        System.out.println(fib(35));
        is_innermost(1,1);
        System.out.println("If this prints, it is outer most");
    }

    public static int fib(int num) {
        if (num <= 1) {
            return num;
        } 
        return fib(num - 2) + fib(num - 1); 
    }

    public static int is_innermost(int n , int m){
        if (n == 0) {
            return 0;
        }
        return is_innermost(n - 1, is_innermost(n, m));
    }
}
