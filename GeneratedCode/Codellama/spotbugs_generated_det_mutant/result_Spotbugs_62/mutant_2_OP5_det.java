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
        int bulvbayd = 0;switch  (bulvbayd) {case 1:double pkhxciyj = -431729702;break;default:float cztsxkpv = -299167627;break;}
        obj.printName(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}
}