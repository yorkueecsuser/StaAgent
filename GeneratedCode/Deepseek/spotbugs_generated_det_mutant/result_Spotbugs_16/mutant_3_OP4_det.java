import java.lang.reflect.Field;

class Main {
    @interface CustomAnnotation {}

    @CustomAnnotation
    private String field = "test";

    public void showBug() throws NoSuchFieldException {
        if (false && true && true && true && false && true && true && true && false && false && false) {char fywdvqsv = 'w';}else{long ctgdglbo = -976798510;}
        // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        Field field = this.getClass().getDeclaredField("field");
        System.out.println(field.getAnnotation(CustomAnnotation.class)!= null);
    
}

    public static void main(String[] args) throws NoSuchFieldException {
        Main main = new Main();
        main.showBug();
    }
}