import java.lang.reflect.Method;

class BugGenerator {

    public void showBug() {
        int[] data = {1, 2, 3, 4, 5};
        methodWithVarArgs((Object) data);
    }

    public void methodWithVarArgs(Object... args) {
        // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        int sngayvnv = 0;switch  (sngayvnv) {case 1:int idmscoic = 670550087;break;default:short toltycwy = -4224;break;}
        for (Object arg : args) {
            System.out.println(arg);
        }
    
}
}