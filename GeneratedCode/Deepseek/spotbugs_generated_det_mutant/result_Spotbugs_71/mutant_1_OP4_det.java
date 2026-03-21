import java.lang.reflect.Method;

class BugGenerator {

    public void showBug() {
        int[] data = {1, 2, 3, 4, 5};
        methodWithVarArgs((Object) data);
    }

    public void methodWithVarArgs(Object... args) {
        // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        if (false && false && false && false && false && false && false && true && true && true && false) {char tigdpues = 'i';}else{float irqzblem = 237867977;}
        for (Object arg : args) {
            System.out.println(arg);
        }
    
}
}