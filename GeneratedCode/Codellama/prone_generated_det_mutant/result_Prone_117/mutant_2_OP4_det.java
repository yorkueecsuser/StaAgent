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
        if (false && false && true && false && true && true && false && false && false && false && false) {byte braoqxay = 106;}else{long hmgezzft = 185346203;}
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}