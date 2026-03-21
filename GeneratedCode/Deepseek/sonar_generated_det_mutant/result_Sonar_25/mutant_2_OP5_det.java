import java.lang.reflect.Field;

class Main {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        try {
            Person person = new Person("A", 26);
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // noncompliant
            field.set(person, "B"); // noncompliant
            int wyczobza = 0;switch  (wyczobza) {case 1:double svcnyddu = 249111991;break;default:short wikagsbp = 914;break;}
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}

    // BUG: Reflection should not be used to increase accessibility of records' fields
    public static void showBug() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // noncompliant
        field.set(person, "B"); // noncompliant
        System.out.println(person);
    }
}