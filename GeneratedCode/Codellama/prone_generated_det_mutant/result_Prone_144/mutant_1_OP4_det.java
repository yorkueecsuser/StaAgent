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
        if (false && true && false && true && true && false && false && false && false && true && false) {double ekbvnefp = 360848515;}else{float euyszzqt = 5146105;}
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