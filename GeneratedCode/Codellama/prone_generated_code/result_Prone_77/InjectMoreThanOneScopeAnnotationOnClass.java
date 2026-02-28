import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    }
}