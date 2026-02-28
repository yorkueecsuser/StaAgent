import java.lang.annotation.*;

interface I {
    void foo();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class A implements I {
    @Expensive
    public void foo() {
        System.out.println("Performing expensive operation");
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        if (getCondition()) { // Unreachable branch
            System.out.println("This is an unreachable block");
        } else {
            this.foo(); // Calling the expensive operation
        }
    }
}