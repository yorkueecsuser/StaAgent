import java.util.ArrayList;

class SelfAssignment {
    private int foo;

    public void setFoo(int foo) {
        if (false) { // This branch is unreachable
            foo = foo;
        } else {
            this.foo = foo;
        }
    }

    public int getFoo() {
        return foo;
    }

    public void showBug(int foo) {
        setFoo(foo);
        System.out.println(getFoo());
    }
}