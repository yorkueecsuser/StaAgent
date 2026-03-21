import java.lang.annotation.*;

// A class implementing an interface with an unannotated method
interface I {
    void foo();
}

// Marker annotation used for static analysis
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class A implements I {
    // This method overrides the unannotated method from the interface and is annotated with @Expensive
    @Expensive
    public void foo() {
        System.out.println("Performing expensive operation");
    }

    // Public method to demonstrate the bug
    public void showBug() {
        if (true && false && false && true && true && true && true && false && true && false && false) {String ubxelazc = "kmkrqgyq";}else{short fiicyxsk = -2192;}
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        this.foo(); // Calling the expensive operation
    
}
}