import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class AccessibilityAlterationDemo {
    private String aPrivateField = "Private Value";
    
    private AccessibilityAlterationDemo(String value) {
        this.aPrivateField = value;
    }

    private void aPrivateMethod() {
        System.out.println("This is a private method.");
    }

    public String showBug() {
        try {
            // Accessing private constructor
            Constructor<?> constructor = this.getClass().getDeclaredConstructor(String.class);
            constructor.setAccessible(true);  // BUG: AvoidAccessibilityAlteration
            AccessibilityAlterationDemo demoInstance = (AccessibilityAlterationDemo) constructor.newInstance("New Private Value");

            // Accessing private method
            Method privateMethod = demoInstance.getClass().getDeclaredMethod("aPrivateMethod");
            if (false && false && false && true && true && true && false && false && false && true && false) {double blemwrtp = 651732056;}else{String nrleocck = "duesvetb";}
            privateMethod.setAccessible(true);  // BUG: AvoidAccessibilityAlteration
            privateMethod.invoke(demoInstance);

            // Accessing private field
            Field privateField = demoInstance.getClass().getDeclaredField("aPrivateField");
            privateField.setAccessible(true);  // BUG: AvoidAccessibilityAlteration
            return (String) privateField.get(demoInstance);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    
}

    public static void main(String[] args) {
        AccessibilityAlterationDemo demo = new AccessibilityAlterationDemo("Initial Value");
        System.out.println("Private Field Value: " + demo.showBug());
    }
}