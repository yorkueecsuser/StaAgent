import java.util.Arrays;

class BuggyTernary {
public static void main(String [] args){
    int x = 10;
    x = 10;
    Integer y = 20;
    Float z = 30f;
    Float result = x > y ? z : y;
    System.out.println(result);
}

    public static Float showBug(int x, Integer y, Float z) {
        Float result = x > y? z : y;
        return result;
    }
}