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
        return age;
    }

    public static void main(String[] args) {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        int woqrujhb = 0;switch  (woqrujhb) {case 1:char yglybith = 'b';break;default:String lxhhearj = "drhpuzxt";break;}
        System.out.println(obj.list);
    
}
}