import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            boolean shouldExecute = false;
            if (shouldExecute) {
                // Unreachable if-else branch - start
                field.set(person, "C");
                // Unreachable if-else branch - end
            } else {
                field.set(person, "B");
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            // Adding an unreachable if-else branch inside the catch block
            if (shouldExecute) {
                // Unreachable if-else branch - start
                System.out.println("This branch should never execute.");
                // Unreachable if-else branch - end
            } else {
                e.printStackTrace();
            }
        }
        return person.name();
    }
}