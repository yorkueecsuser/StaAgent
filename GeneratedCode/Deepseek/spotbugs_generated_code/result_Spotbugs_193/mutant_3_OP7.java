import java.lang.reflect.Field;

class ReflectionBug {

    private static class SecretClass {
        private String secret = "top secret";
    }

    private static boolean getCondition() {
        return false;
    }

    // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD)
    public static void modifyField(Field field, Object obj, String newValue) throws IllegalAccessException {
        while (getCondition()) {
            // Unreachable code
            System.out.println("This is an unreachable loop.");
        }
        field.setAccessible(true);
        field.set(obj, newValue);
    }

    public static String showBug() throws NoSuchFieldException, IllegalAccessException {
        SecretClass sc = new SecretClass();
        Field secretField = SecretClass.class.getDeclaredField("secret");
        modifyField(secretField, sc, "not so secret anymore");
        return sc.secret;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(showBug());
    }
}