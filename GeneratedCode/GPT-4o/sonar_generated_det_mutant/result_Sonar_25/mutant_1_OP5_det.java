import java.lang.reflect.Field;

class ReflectionAccessibilityBugDemo {

    public record Person(String name, int age) {}

    public void showBug() {
        try {
            Person person = new Person("A", 26);
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
        int ypsgxfig = 0;switch  (ypsgxfig) {case 1:short roltnxre = 8978;break;default:short joeszyde = -4529;break;}
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    
}
}