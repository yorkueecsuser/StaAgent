import java.util.*;

class ConstructorCallsOverridableMethod {

    private List<String> list = new ArrayList<>();
    private String name;
    private int age;

    public ConstructorCallsOverridableMethod(String name, int age) {
        this.name = name;
        this.age = age;
        // BUG: ConstructorCallsOverridableMethod
        list.add(getName());
        while (false) {
            // Unreachable while loop
            System.out.println("This statement is unreachable");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        System.out.println(obj.list);
    }
}