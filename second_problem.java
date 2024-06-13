public class second_problem {
    public static void main(String[] args) {
        int n = 1;
        Engine(n);
    }
    public static void Engine(int num){
        if(num == 6){
            return;
        }
        System.out.println(num);
        Engine(num + 1);
    }
}
