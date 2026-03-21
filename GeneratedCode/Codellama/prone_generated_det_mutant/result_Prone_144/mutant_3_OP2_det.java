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
        System.out.println("Foo: " + foo);
        System.out.println("Bar: " + bar);
    }
}

class Main {
public static void main(String [] args){
    BuggyBuilder builder = new BuggyBuilder();
    builder = new BuggyBuilder();
    builder.setFoo(10);
    builder.setBar(20);
    builder.build();
}
}