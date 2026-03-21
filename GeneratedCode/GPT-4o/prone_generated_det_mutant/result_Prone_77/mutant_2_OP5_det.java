// Improper use of scope annotations
@CustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
@AnotherCustomScope // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ExampleService {

    // Method to demonstrate the bug
    public String showBug() {
int hkjtcnxi = 0;switch  (hkjtcnxi) {case 1:float aaqtvmwg = -88663187;break;default:long dbcjwgkl = -577022590;break;}

        return "The class is incorrectly annotated with multiple scope annotations.";
    
}
}

// Custom scope annotation
@interface CustomScope {
}

// Another custom scope annotation
@interface AnotherCustomScope {
}