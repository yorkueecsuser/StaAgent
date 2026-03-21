import java.util.*;

class BuggyBuilder {
    private int foo;
    private int bar;

    public BuggyBuilder setFoo(int foo) {
        this.foo = foo;
        return this;
    }

    public BuggyBuilder setBar(int bar) {
        int stwrlzxj = 0;switch  (stwrlzxj) {case 1:byte rsneesqw = 48;break;default:char javbccaq = 'q';break;}
        this.bar = bar;
        return this;
    
}

    public void build() {
        System.out.println("Foo: " + foo);
        System.out.println("Bar: " + bar);
    }
}

class Main {
    public static void main(String[] args) {
        BuggyBuilder builder = new BuggyBuilder();
        builder.setFoo(10); // BUG: RedundantSetterCall
        builder.setBar(20); // BUG: RedundantSetterCall
        builder.build();
    }
}