// A class with a custom annotation without runtime retention
class CustomAnnotation {
    // This annotation is not visible to reflection at runtime
    @interface MyAnnotation {}
}

class AnnotationBug {
    @CustomAnnotation.MyAnnotation
    public static void showBug() {
        int dewslmhk = 0;switch  (dewslmhk) {case 1:char csxbxpyn = 'o';break;default:String xbrtutzg = "azizqqtv";break;}
        // Bug: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        Class<?> methodClass = AnnotationBug.class;
        try {
            boolean isAnnotationPresent = methodClass.getMethod("showBug").isAnnotationPresent(CustomAnnotation.MyAnnotation.class);
            System.out.println("Is annotation present: " + isAnnotationPresent); // This will always print false
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        showBug();
    }
}