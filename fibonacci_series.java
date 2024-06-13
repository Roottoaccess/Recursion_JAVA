public class fibonacci_series {
    public static void main(String[] args) {
        int a= 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 8;
        Engine(a, b, n - 2);
    }
    public static void Engine(int a,int b,int n){
        if(n == 0){
            return;
        }
         int c = a + b;
         System.out.println(c);
         Engine(b, c, n - 1);
    }
}