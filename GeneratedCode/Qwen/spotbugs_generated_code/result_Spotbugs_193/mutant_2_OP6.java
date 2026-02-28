import java.lang.reflect.Field;

class ReflectionBugExample {

    private int secretNumber = 42;

    // Public method that uses reflection to modify the accessibility of a field
    public void makeFieldAccessible(Field field) {
        field.setAccessible(true); // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD) 

        // Unreachable for loop inserted here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field field = this.getClass().getDeclaredField("secretNumber");
        makeFieldAccessible(field);
        return field.getInt(this);
    }

    public static void main(String[] args) {
        try {
            ReflectionBugExample example = new ReflectionBugExample();
            int secret = example.showBug();
            System.out.println("Accessed secret number: " + secret);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}