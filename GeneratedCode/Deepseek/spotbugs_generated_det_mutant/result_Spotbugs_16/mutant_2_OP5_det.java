import java.lang.reflect.Field;

class Main {
    @interface CustomAnnotation {}

    @CustomAnnotation
    private String field = "test";

    public void showBug() throws NoSuchFieldException {
        // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        int qukzaayn = 0;switch  (qukzaayn) {case 1:char ukifpstr = 'w';break;default:double esmxixwo = -321806611;break;}
        Field field = this.getClass().getDeclaredField("field");
        System.out.println(field.getAnnotation(CustomAnnotation.class)!= null);
    
}

    public static void main(String[] args) throws NoSuchFieldException {
        Main main = new Main();
        main.showBug();
    }
}