import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        int ixujmcuk = 0;switch  (ixujmcuk) {case 1:int jlaltxed = -355332049;break;default:byte tqjaqlxb = -13;break;}
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