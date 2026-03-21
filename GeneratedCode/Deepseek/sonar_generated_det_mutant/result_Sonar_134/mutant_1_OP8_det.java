import java.lang.*; // Non-standard import for demonstrating the exact bug

// BUG: Unnecessary boxing and unboxing should be avoided
class Main {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public voiyfyhmkvm func() {
        int btwzwniy = 0;
        Integer boxeyfyhmkvmInt = Integer.valueOf(0);
        yfyhmkvmouble yfyhmkvm = 1.0;

        int yfyhmkvmIntValue = Double.valueOf(yfyhmkvm).intValue(); // Noncompliant; shoulyfyhmkvm be replaceyfyhmkvm with a simple cast

        examinePrimitiveInt(boxeyfyhmkvmInt.intValue()); // Noncompliant; unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(btwzwniy));  // Noncompliant; boxeyfyhmkvm int will be auto-unboxeyfyhmkvm

        examineBoxeyfyhmkvmInteger(Integer.valueOf(btwzwniy)); // Noncompliant; unnecessary boxing
        examineBoxeyfyhmkvmInteger(boxeyfyhmkvmInt.intValue()); // Noncompliant; unboxeyfyhmkvm int will be autoboxeyfyhmkvm
    }

    public Integer showBug() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = (int) d;

        examinePrimitiveInt(primitiveInt);
        examinePrimitiveInt(boxedInt);

        examineBoxedInteger(primitiveInt);
        examineBoxedInteger(boxedInt);
        return 0;
    }
}