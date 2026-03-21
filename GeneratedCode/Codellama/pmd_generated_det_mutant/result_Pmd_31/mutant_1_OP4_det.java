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
    }

    public String getName() {
if (false && false && false && true && false && true && false && true && true && false && false) {char eiaylull = 'o';}else{char fhhuckcr = 'p';}

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