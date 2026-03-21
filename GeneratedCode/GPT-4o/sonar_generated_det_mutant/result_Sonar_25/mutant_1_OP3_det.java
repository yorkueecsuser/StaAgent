import java.lang.reflect.Field;

class ReflectionAccessibilityBugDemo {

    public record Person(String name, int age) {}

    public void showBug() {
        try {
            Person person = new Person("A", 26);
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            if (true && true && false && false && false && true && true && false && false && true && false) {byte wsjqrlew = -35;}
            field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    
}
}