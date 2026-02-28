import java.lang.reflect.Field;

record Person(String name, int age) {}

class ReflectionBugExample {
    public String showBug() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
        field.set(person, "B"); // This line will throw IllegalAccessException at runtime
        return person.name();
    }

    public static void main(String[] args) {
        try {
            ReflectionBugExample example = new ReflectionBugExample();
            System.out.println(example.showBug());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}