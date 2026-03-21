import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        byte umfddiss = 103;
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}