import java.util.*;

class BuggyMath {
public static void main(String [] args){
    int a = 2 , b = 3;
    float c = a / b;
    c = a / b;
    System.out.println(c);
}
}