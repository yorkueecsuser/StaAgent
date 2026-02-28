import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");

            // Mutant: Unreachable switch statement
            boolean shouldRun = false;
            switch (getValue(shouldRun)) {
                case 1:
                    // This code is unreachable
                    System.out.println("This is an unreachable code block.");
                    break;
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }

    private int getValue(boolean condition) {
        // This method is used to dynamically determine the switch expression
        // In this case, it always returns 0, making the switch statement unreachable
        return condition? 1 : 0;
    }
}