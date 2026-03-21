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
        int rgwwyvvj = 0;switch  (rgwwyvvj) {case 1:String dysclakc = "gdeqhjnu";break;default:double bgfuqcly = -506284157;break;}
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses
    
}
}