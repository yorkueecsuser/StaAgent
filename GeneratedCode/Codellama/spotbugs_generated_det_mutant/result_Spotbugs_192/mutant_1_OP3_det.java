// BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
import java.lang.Class;
import java.lang.reflect.InvocationTargetException;

class ReflectionAccessibility {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.example.ExampleClass");
            Object o = c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void showBug(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        if (true && true && false && false && true && false && true && false && true && true && false) {int mdhmkfxd = -692521402;}
        Class<?> c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);
    
}
}

class ExampleClass {
    public String name;
}