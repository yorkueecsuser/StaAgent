import java.lang.reflect.Method;

class BugGenerator {

    public void showBug() {
        int[] irocjlgd = {1, 2, 3, 4, 5};
        methodWithVarArgs((Object) irocjlgd);
    }

    public void methodWithVarArgs(Object... args) {
        // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        for (Object arg : args) {
            System.out.println(arg);
        }
    }
}