import java.lang.reflect.Method;

class BugGenerator {

    public void showBug() {
        int[] data = {1, 2, 3, 4, 5};
        methodWithVarArgs((Object) data);
    }

    public void methodWithVarArgs(Object... args) {
        // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        for  (int vddhbwsy = 0; vddhbwsy < 0; vddhbwsy++) {byte udqewyxc = 43;}
        for (Object arg : args) {
            System.out.println(arg);
        }
    
}
}