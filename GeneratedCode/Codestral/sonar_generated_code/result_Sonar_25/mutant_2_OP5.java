import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    private boolean getUnreachableValue() {
        return false; // This method always returns false
    }

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            if (getUnreachableValue()) {
                // This code is unreachable because getUnreachableValue() always returns false
                switch (e) {
                    case NoSuchFieldException nse:
                        // Unreachable code
                        break;
                    case IllegalAccessException iae:
                        // Unreachable code
                        break;
                }
            }
            e.printStackTrace();
        }
        return person.name();
    }
}