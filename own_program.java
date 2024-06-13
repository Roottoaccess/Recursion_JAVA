import java.lang.Thread;
public class own_program extends Thread {
    public static void main(String[] args) {
        int l = 1;
        Engine(l);
    }
    public static void Engine(int lmt){
        try{
            if(lmt == 101){
                return;
            }
    
            System.out.println("Java$Coffee");
            Thread.sleep(200);
            /* Recursive function */
            Engine(lmt + 1);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
