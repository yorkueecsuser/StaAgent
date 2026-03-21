import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        int rczfoffi = 0;switch  (rczfoffi) {case 1:short yjbnhdad = -6476;break;default:char eoqnvovg = 'h';break;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}