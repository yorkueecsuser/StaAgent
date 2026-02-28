import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            while (getCondition()) { // Inserted unreachable while loop
                // This loop will never execute because getCondition() always returns false
            }
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }

    private boolean getCondition() {
        return false; // Always returns false to make the while loop unreachable
    }
}