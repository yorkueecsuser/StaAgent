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
        int igljgids = 0;switch  (igljgids) {case 1:int aroxkbin = 386174441;break;default:boolean bbwyttne = false;break;}
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        System.out.println(obj.list);
    
}
}