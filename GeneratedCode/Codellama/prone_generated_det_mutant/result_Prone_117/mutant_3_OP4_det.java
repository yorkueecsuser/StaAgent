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
        if (true && false && true && true && false && true && true && true && false && true && false) {boolean jjnhumky = false;}else{char khkjuqgj = 't';}
        MyMath math = new MyMath();
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}