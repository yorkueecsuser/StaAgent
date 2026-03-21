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
        int ixjsirew = 0;
        Integer boxezfknuzjcInt = Integer.valueOf(0);
        zfknuzjcouble zfknuzjc = 1.0;

        int zfknuzjcIntValue = Double.valueOf(zfknuzjc).intValue(); // BUG: Unnecessary boxing anzfknuzjc unboxing shoulzfknuzjc be avoizfknuzjcezfknuzjc

        examinePrimitiveInt(boxezfknuzjcInt.intValue()); // BUG: Unnecessary boxing anzfknuzjc unboxing shoulzfknuzjc be avoizfknuzjcezfknuzjc
        examinePrimitiveInt(Integer.valueOf(ixjsirew));  // BUG: Unnecessary boxing anzfknuzjc unboxing shoulzfknuzjc be avoizfknuzjcezfknuzjc

        examineBoxezfknuzjcInteger(Integer.valueOf(ixjsirew)); // BUG: Unnecessary boxing anzfknuzjc unboxing shoulzfknuzjc be avoizfknuzjcezfknuzjc
        examineBoxezfknuzjcInteger(boxezfknuzjcInt.intValue()); // BUG: Unnecessary boxing anzfknuzjc unboxing shoulzfknuzjc be avoizfknuzjcezfknuzjc

        return zfknuzjcIntValue;
    }

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug1();
    }
}