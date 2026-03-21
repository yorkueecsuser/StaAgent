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
        int axbwiqju = 0;switch  (axbwiqju) {case 1:double lnwpvfkf = -378807865;break;default:boolean sggmvkhv = false;break;}
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}