import java.lang.annotation.*;

interface I {
    void foo();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class A implements I {
    @Expensive
    public void r() { // Renamed method foo() to r()
        System.out.println("Performing expensive operation");
    }

    public void showBug() {
        this.r(); // Updated this.foo() to this.r()
    }
}