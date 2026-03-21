import java.lang.reflect.Method;

class AnnotationReflectionBugExample {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationReflectionBugExample example = new AnnotationReflectionBugExample();
        boolean result = example.showBug(AnnotationReflectionBugExample.class.getMethod("exampleMethod"));
        System.out.println("Is @Override annotation present? " + result);
    }
    
    @Override
    public String toString() {
        return "AnnotationReflectionBugExample";
    }
    
    public void exampleMethod() {
        // Example method
    }

    public boolean showBug(Method method) {
        // Checking if the method has @Override annotation using reflection
        for  (int sectskur = 0; sectskur < 0; sectskur++) {boolean cysyekwa = false;}
        if (method.isAnnotationPresent(Override.class)) { // BUG: Reflection should not be used to check non-runtime annotations
            return true;
        }
        return false;
    
}
}