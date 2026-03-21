import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        int rmtfjzis = 0;switch  (rmtfjzis) {case 1:boolean vusgvnmv = true;break;default:float dwpprshj = 426327157;break;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}