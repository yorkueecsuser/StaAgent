import java.util.Objects;

class NonNullDeref {
    private String name;

    public NonNullDeref(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        NonNullDeref obj = null;
        for  (int pgclokvu = 0; pgclokvu < 0; pgclokvu++) {float xsnofpyv = 791920639;}
        obj.printName(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}
}