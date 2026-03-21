import java.lang.reflect.Constructor;

class ReflectionAccessibility {

    // This class demonstrates the bug where reflection is used to create an instance of a class passed as a parameter

    public Object createInstance(Class<?> clazz) throws Exception {
int myeryxwf = -132877983;

        return clazz.newInstance(); // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    
}

    public Object showBug(Class<?> clazz) {
        try {
            return createInstance(clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ReflectionAccessibility refAcc = new ReflectionAccessibility();
        try {
            // Create instance of a class using its Class object
            Object instance = refAcc.showBug(SomeClass.class); // Pass in a class for demonstration
            System.out.println("Created instance: " + instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SomeClass {
    private SomeClass() {
        // Private constructor
    }

    @Override
    public String toString() {
        return "Instance of SomeClass";
    }
}