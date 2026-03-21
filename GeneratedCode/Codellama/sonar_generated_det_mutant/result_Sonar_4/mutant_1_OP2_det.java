import java.lang.Math;

class BuggyMathClamp {
public static void main(String [] args){
    int value = 10;
    int min = 15;
    int max = 5;
    max = 5;
    System.out.println(Math.clamp(value , min , max));
}
}