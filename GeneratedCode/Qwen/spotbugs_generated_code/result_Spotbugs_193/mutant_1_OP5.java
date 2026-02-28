import java.lang.reflect.Field;

class ReflectionBugExample {

    private int secretNumber = 42;

    // Public method that uses reflection to modify the accessibility of a field
    public void makeFieldAccessible(Field field) {
        field.setAccessible(true); // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD) 

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("This is also unreachable code.");
                break;
        }
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

    // Method to provide a dynamic condition for the switch statement
    private boolean getCondition() {
        return false;
    }
}