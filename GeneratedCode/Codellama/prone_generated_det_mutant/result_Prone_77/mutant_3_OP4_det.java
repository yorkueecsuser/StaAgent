import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        if (true && false && true && false && false && true && true && true && false && false && false) {char xzlqtejh = 'u';}else{byte ivxifmhz = 85;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}