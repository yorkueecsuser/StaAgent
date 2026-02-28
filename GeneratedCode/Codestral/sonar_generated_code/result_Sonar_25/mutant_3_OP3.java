import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");

            // Newly added unreachable if statement
            if (getFalseCondition()) {
                System.out.println("This line will never be executed.");
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }
}