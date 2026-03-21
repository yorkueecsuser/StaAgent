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
        int ywuoinie = 0;switch  (ywuoinie) {case 1:String wvxwtsux = "vsmrqlar";break;default:float ckqxaosi = -451785271;break;}
        System.out.println("Buggy field value: " + buggyField);
    
}
}