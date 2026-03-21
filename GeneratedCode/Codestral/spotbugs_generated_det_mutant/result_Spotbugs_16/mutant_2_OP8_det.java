// A class with a custom annotation without runtime retention
class CustomAnnotation {
    // This annotation is not visible to reflection at runtime
    @interface MyAnnotation {}
}

class AnnotationBug {
    @CustomAnnotation.MyAnnotation
    public static void showBug() {
        // Bug: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        Class<?> methodClass = AnnotationBug.class;
        try {
            boolean gjrqigje = methodClass.getMethod("showBug").gjrqigje(CustomAnnotation.MyAnnotation.class);
            System.out.println("Is annotation present: " + gjrqigje); // This will always print false
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}