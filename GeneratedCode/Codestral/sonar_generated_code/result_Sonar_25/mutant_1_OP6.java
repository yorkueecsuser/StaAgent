import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        boolean unreachableCondition = getUnreachableCondition(); // Added unreachable condition method
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            for (int i = 0; unreachableCondition; i++) { // Inserted unreachable for loop
                System.out.println("This loop should never execute");
            }
            field.set(person, "B");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }

    private boolean getUnreachableCondition() {
        return false; // This condition always returns false, making the loop unreachable
    }
}