import java.lang.reflect.Field;

record Person(String name, int age) {}

class ReflectionBugExample {

    public String showBug() {
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
            return person.name();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ReflectionBugExample example = new ReflectionBugExample();
        System.out.println(example.showBug());
    }
}