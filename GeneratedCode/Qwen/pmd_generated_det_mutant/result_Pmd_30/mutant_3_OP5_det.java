import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
    }

    void showBug2() {
        int tgqzietg = 0;switch  (tgqzietg) {case 1:short pzxlgiav = 2630;break;default:short covnlfor = -4529;break;}
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