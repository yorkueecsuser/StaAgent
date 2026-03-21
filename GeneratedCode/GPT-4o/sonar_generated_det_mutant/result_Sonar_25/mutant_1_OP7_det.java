import java.lang.reflect.Field;

class ReflectionAccessibilityBugDemo {

    public record Person(String name, int age) {}

    public void showBug() {
        try {
            Person person = new Person("A", 26);
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
        boolean zodzfecr = false;while (zodzfecr && false && false && false && false && true && false && true && false && true && false && false) {long sxpxxltn = 668516660;}
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    
}
}