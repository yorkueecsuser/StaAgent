import java.lang.Math;

class BugDemo {
public static void main(String [] args){
    int x = 10;
    x = 10;
    double y =(double)x;
    System.out.println(Math.ceil(y));
}
}