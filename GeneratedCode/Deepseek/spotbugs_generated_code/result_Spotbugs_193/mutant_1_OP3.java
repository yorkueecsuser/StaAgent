import java.lang.reflect.Field;

class ReflectionBug {

    private static class SecretClass {
        private String secret = "top secret";
    }

    // Original bug is still present
    public static void modifyField(Field field, Object obj, String newValue) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, newValue);

        // Adding the unreachable if statement mutant
        boolean alwaysFalse = falseCondition();
        if (alwaysFalse) {
            throw new RuntimeException("Unreachable code executed");
        }
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

    private static boolean falseCondition() {
        return false;
    }
}