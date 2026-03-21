import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        for  (int euswmhcp = 0; euswmhcp < 0; euswmhcp++) {int yzafajlu = 328966000;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}