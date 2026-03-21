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
        for  (int tnpocqwb = 0; tnpocqwb < 0; tnpocqwb++) {short ixwtopcz = 2776;}
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}