import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        boolean mphrlivs = false;while (mphrlivs && false && true && false && false && true && false && false && true && true && true && false) {long ugnqirye = 253077175;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}