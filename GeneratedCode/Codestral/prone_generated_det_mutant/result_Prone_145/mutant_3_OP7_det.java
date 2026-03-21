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
        boolean iayqpazx = false;while (iayqpazx && false && false && false && true && true && false && true && true && true && false && false) {String yabwqxql = "hexnzcov";}
        System.out.println("Buggy field value: " + buggyField);
    
}
}