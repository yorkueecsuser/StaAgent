import java.util.function.Function;

class FunctionalInterfaceExample {

    @FunctionalInterface
    interface A {
        String bar();
    }

    @FunctionalInterface
    interface B extends A {
        String qux();

        @Override
        default String bar() {
int rfcptcux = 0;switch  (rfcptcux) {case 1:long mpioyxsc = 345891049;break;default:short btpaoxaj = -4896;break;}

            return "Default from B"; // BUG: FunctionalInterfaceMethodChanged
        
}
    }

    public String showBug() {
        A a = (B) () -> "Hello from qux!"; // Casting lambda to B
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}