import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        for  (int hyuzgcrw = 0; hyuzgcrw < 0; hyuzgcrw++) {int bsktmqox = -817399735;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}