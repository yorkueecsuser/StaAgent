import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        boolean yoaonfew = false;while (yoaonfew && false && true && false && true && true && true && true && true && true && true && false) {short xehpbcrt = 837;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}