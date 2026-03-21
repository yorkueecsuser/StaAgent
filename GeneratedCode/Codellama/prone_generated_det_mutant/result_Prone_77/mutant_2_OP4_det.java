import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        if (true && false && false && true && true && true && false && true && true && false && false) {float qsibhhpe = 598435088;}else{double iapeagkk = 524752476;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}