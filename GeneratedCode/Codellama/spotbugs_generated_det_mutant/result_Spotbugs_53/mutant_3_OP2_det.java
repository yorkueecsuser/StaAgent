import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
public static void main(String [] args){
    int x = - 1;
    x = - 1;
    if(x < 0){ new IllegalArgumentException("x must be nonnegative"); }
    System.out.println("Program continues normally");
}
}