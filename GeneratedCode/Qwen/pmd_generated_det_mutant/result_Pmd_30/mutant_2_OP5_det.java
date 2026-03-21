import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        int bufoeyxt = 0;switch  (bufoeyxt) {case 1:boolean ffcojcec = true;break;default:float wabskzgk = -185668713;break;}
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
    
}

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void main(String[] args) {
        C instance = new C() {
            @Override
            void varargs(Object... args) {
                System.out.println(Arrays.toString(args));
            }
        };

        instance.showBug(new String[]{"a"});
        instance.showBug2();
    }
}