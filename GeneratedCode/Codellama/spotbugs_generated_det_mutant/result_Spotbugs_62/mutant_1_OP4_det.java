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
        if (false && false && true && false && true && true && true && false && false && false && false) {short fkutfbqf = 6754;}else{long apwpsnhe = 850763568;}
        obj.printName(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}
}