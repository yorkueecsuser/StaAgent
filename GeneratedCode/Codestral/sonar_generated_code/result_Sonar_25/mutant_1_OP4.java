import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");

            // Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never execute because getCondition() always returns false
            } else {
                // Unreachable block
                int x = 10;
                x = x / 0; // This line will cause an ArithmeticException if the unreachable block is executed
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }
}