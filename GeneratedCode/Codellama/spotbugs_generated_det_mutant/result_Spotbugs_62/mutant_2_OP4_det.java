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
        if (false && false && false && false && true && false && true && false && true && true && false) {double ptinunfg = -157227821;}else{char giahvoxf = 'm';}
        obj.printName(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}
}