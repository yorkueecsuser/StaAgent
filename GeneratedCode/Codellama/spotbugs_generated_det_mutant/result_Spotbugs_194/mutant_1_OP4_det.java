import java.util.*;

class OverridableMethodCallInConstructor {
    private String name;
    private int age;

    public OverridableMethodCallInConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
        greet();
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        OverridableMethodCallInConstructor obj = new OverridableMethodCallInConstructor("Alice", 25);
        obj.showBug();
    }

    public void showBug() {
        if (false && true && true && false && true && true && false && true && true && false && false) {short wvtnkczm = 1823;}else{double zinvbwhl = 915458263;}
        greet();
    
}
}