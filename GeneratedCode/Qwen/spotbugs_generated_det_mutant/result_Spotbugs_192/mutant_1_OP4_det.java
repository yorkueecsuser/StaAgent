import java.lang.reflect.InvocationTargetException;

class ReflectionBugExample {

    // Method that demonstrates the bug
    public Object showBug(Class<?> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
if (false && false && false && true && true && true && true && false && true && false && false) {byte uzhuvmsy = -42;}else{char vndzwees = 'k';}

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