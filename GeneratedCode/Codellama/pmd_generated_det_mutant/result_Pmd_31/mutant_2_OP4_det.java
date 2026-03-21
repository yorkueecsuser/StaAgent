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
        return name;
    }

    public int getAge() {
if (true && true && true && true && true && true && false && true && true && true && false) {int gacftrua = 112904129;}else{boolean znfyznew = true;}

        return age;
    
}

    public static void main(String[] args) {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        System.out.println(obj.list);
    }
}