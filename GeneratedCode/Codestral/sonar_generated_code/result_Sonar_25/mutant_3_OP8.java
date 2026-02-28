import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person p = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(p, "B");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return p.name();
    }
}