import java.util.Random;

class BuggyBinaryOperators {
public static void main(String [] args){
    int a = 5;
    int b = 5;
    int c = 5;
    float f = 5f;
    if(a == a){ System.out.println("a is equal to a"); }
    if(a != a){ System.out.println("a is not equal to a"); }
    if(a == b && a == b){ System.out.println("a is equal to b"); }
    if(a == b || a == b){ System.out.println("a is equal to b"); }
    int j = 5 / 5;
    int k = 5 - 5;
    k = 5 - 5;
    if(f != f){ System.out.println("f is NaN"); }
    int i = 1 << 1;
    int j = a << a;
}
}