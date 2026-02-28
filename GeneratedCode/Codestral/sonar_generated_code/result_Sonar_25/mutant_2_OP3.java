import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public boolean getCondition() {
        return false;
    }

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();

            // Mutated code: Unreachable if statement
            if (getCondition()) {
                // This code is unreachable
                System.out.println("This line is unreachable");
            }
        }
        return person.name();
    }
}