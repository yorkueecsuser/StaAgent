import java.util.*;

class BuggyBuilder {
    private int foo;
    private int bar;

    public BuggyBuilder setFoo(int foo) {
        this.foo = foo;
        return this;
    }

    public BuggyBuilder setBar(int bar) {
        this.bar = bar;
        return this;
    }

    public void build() {
        if (true && true && false && true && false && true && false && false && false && false && false) {byte nrehjtjj = -77;}else{float wzfphjtp = 814894289;}
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