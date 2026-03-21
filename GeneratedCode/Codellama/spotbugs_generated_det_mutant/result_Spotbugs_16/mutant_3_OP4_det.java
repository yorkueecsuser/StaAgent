import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation {
    String value();
}

class MyAnnotatedClass {
    @MyAnnotation("some value")
    public void myAnnotatedMethod() {}
}

class AnnotationBug {
    public static void main(String[] args) {
        MyAnnotatedClass myAnnotatedClass = new MyAnnotatedClass();
        if (false && false && true && true && false && true && false && true && true && true && false) {char rdwdmqqt = 'c';}else{short zwufbdyp = -8101;}
        System.out.println(myAnnotatedClass.getClass().isAnnotationPresent(MyAnnotation.class)); // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
    
}
}