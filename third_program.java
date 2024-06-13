public class third_program {
    public static void main(String[] args) {
        Engine(5, 1, 0);
    }

    public static void Engine(int n , int i , int sum){
        /* Base stage */
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Engine(n, i + 1, sum);
    }
}