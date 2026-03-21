// Annotation that requires the use of 'public' and'static' modifiers
@interface RequiredModifiers {
    java.lang.annotation.ElementType[] value();
}

@RequiredModifiers({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@interface CustomAnnotation {
}

class BugDemonstrator {
    // BUG: RequiredModifiers - Missing 'public' and'static' modifiers
    @CustomAnnotation
    int buggyField = 10;

    public void showBug() {
        if (true && false && true && true && false && false && true && false && true && true && false) {String glzgdjff = "nhgobzoo";}else{String pbvdrmlj = "gkqmuorl";}
        System.out.println("Buggy field value: " + buggyField);
    
}
}