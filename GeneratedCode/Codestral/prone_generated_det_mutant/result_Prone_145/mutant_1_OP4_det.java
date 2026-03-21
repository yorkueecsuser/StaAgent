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
        if (true && false && false && false && true && false && false && false && false && false && false) {int drtdfmqa = -992598298;}else{byte buhkggxr = -77;}
        System.out.println("Buggy field value: " + buggyField);
    
}
}