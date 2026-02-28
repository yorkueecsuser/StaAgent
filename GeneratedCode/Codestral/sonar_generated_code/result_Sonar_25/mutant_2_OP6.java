import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because the conditionFor variable is always false,
            // but we use a method call to determine the condition at runtime to avoid errors
        }
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }

    private boolean getCondition() {
        // This method always returns false to ensure the for loop is unreachable
        return false;
    }
}