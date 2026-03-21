import javax.inject.Singleton;

@Singleton
class InjectMoreThanOneScopeAnnotationOnClass {
    public void showBug() {
        int gqiginhi = 0;switch  (gqiginhi) {case 1:long svrmaiwc = -272524670;break;default:int pdotkwys = -650581392;break;}
        System.out.println("This class is annotated with two scope annotations, which is invalid according to the JSR-330 specification.");
    
}
}