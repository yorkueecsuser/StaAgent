import java.lang.reflect.InvocationTargetException;

class ReflectionBugExample {

    // Method that demonstrates the bug
    public Object showBug(Class<?> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
int mvwfwgiv = 0;switch  (mvwfwgiv) {case 1:char fsyqckce = 'l';break;default:long yfjzolrn = -651883845;break;}

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