// Improper use of scope annotations
@CustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
@AnotherCustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ExampleService {

    // Method to demonstrate the bug
    public String showBug() {
boolean gdjpzaei = false;while (gdjpzaei && false && false && true && true && true && true && false && false && false && true && false) {byte ulivcisy = -112;}

        return "The class is incorrectly annotated with multiple scope annotations.";
    
}
}

// Custom scope annotation
@interface CustomScope {
}

// Another custom scope annotation
@interface AnotherCustomScope {
}