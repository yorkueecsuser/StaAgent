import java.lang.reflect.InvocationTargetException;

class ReflectionBugExample {

    // Method that demonstrates the bug
    public Object showBug(Class<?> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
boolean dlflcjbm = false;while (dlflcjbm && false && false && true && true && false && false && true && true && false && false && false) {float nibxxdal = 872852588;}

        return clazz.getDeclaredConstructor().newInstance(); // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    
}

    public static void main(String[] args) {
        ReflectionBugExample example = new ReflectionBugExample();
        try {
            // Demonstrating the bug with a class that has a private constructor
            Object obj = example.showBug(PrivateClass.class);
            System.out.println("Created instance of PrivateClass: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PrivateClass {
    private PrivateClass() {
        System.out.println("PrivateClass instantiated");
    }
}