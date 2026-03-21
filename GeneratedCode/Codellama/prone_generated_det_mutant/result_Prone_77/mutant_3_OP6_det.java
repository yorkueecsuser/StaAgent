import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        for  (int rvbdgdwb = 0; rvbdgdwb < 0; rvbdgdwb++) {long kessgokq = 565108268;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}