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
        int danzfjfq = 0;switch  (danzfjfq) {case 1:int vpltqhjx = -832219070;break;default:String glcnqwvr = "vukvxayw";break;}
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}