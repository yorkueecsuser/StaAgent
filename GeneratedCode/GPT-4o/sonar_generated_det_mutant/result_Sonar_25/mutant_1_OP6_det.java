import java.lang.reflect.Field;

class ReflectionAccessibilityBugDemo {

    public record Person(String name, int age) {}

    public void showBug() {
        try {
            Person person = new Person("A", 26);
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            for  (int aipjoobr = 0; aipjoobr < 0; aipjoobr++) {int mnakreit = 991385346;}
            field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    
}
}