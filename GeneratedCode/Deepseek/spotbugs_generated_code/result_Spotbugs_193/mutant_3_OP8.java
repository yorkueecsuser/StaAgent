import java.lang.reflect.Field;

class ReflectionBug {

    private static class SecretClass {
        private String secret = "top secret";
    }

    // No changes made to this method as it demonstrates the bug rule
    public static void modifyField(Field field, Object obj, String newValue) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, newValue);
    }

    public static String showBug() throws NoSuchFieldException, IllegalAccessException {
        SecretClass scObject = new SecretClass(); // Renamed sc to scObject
        Field secretField = SecretClass.class.getDeclaredField("secret");
        modifyField(secretField, scObject, "not so secret anymore");
        return scObject.secret; // Changed sc to scObject
    }

    public static void main(String[] args) throws Exception {
        System.out.println(showBug());
    }
}