import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");

            // Mutant code - Unreachable switch statement
            boolean shouldRun = false;
            switch (getValue(shouldRun)) {
                case 1:
                    // This code is unreachable
                    System.out.println("This is an unreachable code block");
                    break;
                default:
                    break;
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }

    private int getValue(boolean condition) {
        return condition? 1 : 0;
    }
}