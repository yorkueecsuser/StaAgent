import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        boolean conditionFor = getConditionFor(); // Added dynamic condition
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("Unreachable loop iteration: " + i);
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

    private boolean getConditionFor() { // Method to dynamically determine the condition
        return false; // Always return false to make the loop unreachable
    }
}