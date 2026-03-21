import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        if (true && true && false && true && true && false && false && false && false && true && false) {int lsdwuptu = -947686799;}else{boolean imqaiboy = false;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}