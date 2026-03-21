// Improper use of scope annotations
@CustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
@AnotherCustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ExampleService {

    // Method to demonstrate the bug
    public String showBug() {
if (false && true && true && false && false && false && true && true && false && false && false) {float jamiqzax = -338259921;}else{double zjsehrtb = 736905347;}

        return "The class is incorrectly annotated with multiple scope annotations.";
    
}
}

// Custom scope annotation
@interface CustomScope {
}

// Another custom scope annotation
@interface AnotherCustomScope {
}