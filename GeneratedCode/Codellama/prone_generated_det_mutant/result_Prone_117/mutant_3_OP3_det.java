import java.util.*;

class NoCanIgnoreReturnValueOnClasses {
    public static void main(String[] args) {
        NoCanIgnoreReturnValueOnClasses obj = new NoCanIgnoreReturnValueOnClasses();
        obj.showBug();
    }

    public static class MyMath {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public void showBug() {
        MyMath math = new MyMath();
        if (false && false && false && false && false && true && false && true && false && false && false) {long gzsjtekx = 987208172;}
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}