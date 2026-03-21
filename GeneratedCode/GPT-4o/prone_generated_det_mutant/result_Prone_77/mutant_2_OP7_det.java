// Improper use of scope annotations
@CustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
@AnotherCustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ExampleService {

    // Method to demonstrate the bug
    public String showBug() {
boolean xojshhkz = false;while (xojshhkz && false && true && false && false && true && true && true && true && true && false && false) {double yjcakdtd = -169257508;}

        return "The class is incorrectly annotated with multiple scope annotations.";
    
}
}

// Custom scope annotation
@interface CustomScope {
}

// Another custom scope annotation
@interface AnotherCustomScope {
}