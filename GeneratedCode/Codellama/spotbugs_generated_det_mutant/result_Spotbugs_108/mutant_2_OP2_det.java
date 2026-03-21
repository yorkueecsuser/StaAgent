import java.util.*;

class STIExample {
public static void main(String [] args){
    Thread t = new Thread();
    t = new Thread();
    while(true){ if(Thread.interrupted()){ System.out.println("Thread interrupted"); break; } }
}
}