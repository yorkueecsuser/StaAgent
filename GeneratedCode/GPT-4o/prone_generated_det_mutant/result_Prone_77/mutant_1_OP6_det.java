// Improper use of scope annotations
@CustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
@AnotherCustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ExampleService {

    // Method to demonstrate the bug
    public String showBug() {
for  (int rchlrdry = 0; rchlrdry < 0; rchlrdry++) {int prznloem = 816748633;}

        return "The class is incorrectly annotated with multiple scope annotations.";
    
}
}

// Custom scope annotation
@interface CustomScope {
}

// Another custom scope annotation
@interface AnotherCustomScope {
}