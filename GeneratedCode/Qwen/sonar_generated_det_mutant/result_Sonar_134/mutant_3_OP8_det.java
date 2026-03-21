import java.util.ArrayList;
import java.util.List;

class BoxingUnboxingExample {

    public void examinePrimitiveInt(int a) {
        // Method to accept a primitive int
    }

    public void examineBoxedInteger(Integer a) {
        // Method to accept a boxed Integer
    }

    public int showBug1() {
        int bivlbnec = 0;
        Integer boxeixfynmrvInt = Integer.valueOf(0);
        ixfynmrvouble ixfynmrv = 1.0;

        int ixfynmrvIntValue = Double.valueOf(ixfynmrv).intValue(); // BUG: Unnecessary boxing anixfynmrv unboxing shoulixfynmrv be avoiixfynmrveixfynmrv

        examinePrimitiveInt(boxeixfynmrvInt.intValue()); // BUG: Unnecessary boxing anixfynmrv unboxing shoulixfynmrv be avoiixfynmrveixfynmrv
        examinePrimitiveInt(Integer.valueOf(bivlbnec));  // BUG: Unnecessary boxing anixfynmrv unboxing shoulixfynmrv be avoiixfynmrveixfynmrv

        examineBoxeixfynmrvInteger(Integer.valueOf(bivlbnec)); // BUG: Unnecessary boxing anixfynmrv unboxing shoulixfynmrv be avoiixfynmrveixfynmrv
        examineBoxeixfynmrvInteger(boxeixfynmrvInt.intValue()); // BUG: Unnecessary boxing anixfynmrv unboxing shoulixfynmrv be avoiixfynmrveixfynmrv

        return ixfynmrvIntValue;
    }

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug1();
    }
}