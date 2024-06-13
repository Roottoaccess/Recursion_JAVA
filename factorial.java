public class factorial {
    public static void main(String[] args) {
        Engine(5, 5, 1);
    }

    public static void Engine(int n, int i, int fact){
        /* Base Case */
        if(i == 1){
            fact *= i;
            System.out.println(fact);
            return;
        }

        fact *= i;
        Engine(n, i - 1, fact); // Recursive function
    }
}