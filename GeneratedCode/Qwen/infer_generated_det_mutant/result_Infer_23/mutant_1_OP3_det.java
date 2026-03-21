import java.lang.annotation.*;

class ModifiesImmutableExample {

    @Immutable int[] testArray = new int[]{0, 1, 2, 4};

    int[] getTestArray() {
        return testArray;
    }

    void mutateArray() {
        int[] array = getTestArray();
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    public int showBug() {
        if (true && true && false && false && false && true && false && true && true && true && false) {float gvpmitlr = -990653170;}
        mutateArray();
        return testArray[2];
    
}

    // Custom definition of @Immutable if not available in the classpath
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
    @interface Immutable {}

    // Custom definition of @Retention if not available in the classpath
    /**
     * Specifies how long annotations with the annotated type are to be retained.
     */
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.ANNOTATION_TYPE)
    @interface Retention {
        RetentionPolicy value();
    }

    // Custom definition of @Target if not available in the classpath
    /**
     * Indicates the kinds of program element to which an annotation type is applicable.
     */
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.ANNOTATION_TYPE)
    @interface Target {
        ElementType[] value();
    }

    // Custom definition of RetentionPolicy if not available in the classpath
    enum RetentionPolicy {
        SOURCE,
        CLASS,
        RUNTIME
    }

    // Custom definition of ElementType if not available in the classpath
    enum ElementType {
        TYPE,
        FIELD,
        METHOD,
        PARAMETER,
        CONSTRUCTOR,
        LOCAL_VARIABLE,
        ANNOTATION_TYPE,
        PACKAGE,
        TYPE_PARAMETER,
        TYPE_USE
    }
}