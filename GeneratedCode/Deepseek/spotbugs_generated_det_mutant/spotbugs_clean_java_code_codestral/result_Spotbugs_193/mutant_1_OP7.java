import java.lang.reflect.Field;

class ReflectionBug {

    private static class SecretClass {
        private String secret = "top secret";
    }

    public static void modifyField(Field field, Object obj, String newValue) throws IllegalAccessException {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This line is unreachable.");
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