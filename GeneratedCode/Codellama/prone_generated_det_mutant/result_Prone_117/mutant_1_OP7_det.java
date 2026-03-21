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
        boolean tkubyxsb = false;while (tkubyxsb && false && true && false && false && true && true && false && true && false && false && false) {char jelyiovg = 'e';}
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}