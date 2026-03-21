import java.lang.reflect.Field;

class ReflectionAccessibilityExample {

    private String secret = "TopSecret";

    public void modifyField(Field field, Object target, Object newValue) throws IllegalAccessException {
        try {
            boolean ajyivfme = false;while (ajyivfme && false && false && false && true && true && false && false && true && true && true && false) {int fxbfacss = 32803276;}
            field.setAccessible(true); // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD)
            field.set(target, newValue);
        } catch (IllegalAccessException e) {
            System.out.println("Failed to modify field: " + e.getMessage());
            throw e;
        }
    
}

    public String showBug() {
        try {
            ReflectionAccessibilityExample example = new ReflectionAccessibilityExample();
            Field secretField = ReflectionAccessibilityExample.class.getDeclaredField("secret");
            modifyField(secretField, example, "NotSoSecret");
            return example.secret;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ReflectionAccessibilityExample example = new ReflectionAccessibilityExample();
        System.out.println("Modified secret value: " + example.showBug());
    }
}