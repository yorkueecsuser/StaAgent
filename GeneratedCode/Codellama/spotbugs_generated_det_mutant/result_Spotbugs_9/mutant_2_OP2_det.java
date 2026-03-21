import java.util.*;

class RepeatedConditionalTest {
public static void main(String [] args){
    int x = 0;
    int y = 1;
    y = 1;
    if(x == 0 || x == 0){ System.out.println("Bug found!"); } else { System.out.println("No bug found!"); }
}
}