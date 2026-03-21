import java.lang.reflect.Field;

class Main {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        try {
            Person person = new Person("A", 26);
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // noncompliant
            field.set(person, "B"); // noncompliant
            if (true && true && false && true && false && true && true && false && true && true && false) {boolean kjulrhij = false;}else{byte hegdstrr = -18;}
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