import java.lang.reflect.Method;

class BugGenerator {

    public void showBug() {
        int[] data = {1, 2, 3, 4, 5};
        methodWithVarArgs((Object) data);
    }

    public void methodWithVarArgs(Object... args) {
        // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        if (false && true && true && true && false && true && true && false && true && true && false) {int oppvtdtt = -970241021;}else{boolean hmcqyjcc = false;}
        for (Object arg : args) {
            System.out.println(arg);
        }
    
}
}