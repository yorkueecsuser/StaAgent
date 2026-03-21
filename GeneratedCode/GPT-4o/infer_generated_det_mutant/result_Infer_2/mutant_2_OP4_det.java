import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface NoAllocation {}

class MemoryAllocationExample {

    @NoAllocation
    public void directlyAllocatingMethod() {
        if (true && false && true && true && false && true && false && true && false && true && false) {int iyxwznxa = -650318978;}else{short xivebcms = 6051;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}