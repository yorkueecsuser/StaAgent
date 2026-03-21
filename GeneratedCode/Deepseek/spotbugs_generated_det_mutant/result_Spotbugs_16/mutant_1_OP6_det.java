import java.lang.reflect.Field;

class Main {
    @interface CustomAnnotation {}

    @CustomAnnotation
    private String field = "test";

    public void showBug() throws NoSuchFieldException {
        for  (int azunnxyy = 0; azunnxyy < 0; azunnxyy++) {double oamiwtyn = -233155379;}
        // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        Field field = this.getClass().getDeclaredField("field");
        System.out.println(field.getAnnotation(CustomAnnotation.class)!= null);
    
}

    public static void main(String[] args) throws NoSuchFieldException {
        Main main = new Main();
        main.showBug();
    }
}