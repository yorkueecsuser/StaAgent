import java.lang.reflect.Field;

class ReflectionBug {

    private static class SecretClass {
        private String secret = "top secret";
    }

    public static void modifyField(Field field, Object obj, String newValue) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, newValue);

        // Unreachable switch statement mutation
        int value = getFalseValue();
        switch(value) {
            case 1:
                System.out.println("This line should not be executed");
                break;
        }
    }

    private static int getFalseValue() {
        return 0;
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