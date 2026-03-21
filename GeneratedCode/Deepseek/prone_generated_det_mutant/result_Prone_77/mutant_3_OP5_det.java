// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        int obveevkw = 0;switch  (obveevkw) {case 1:double lhvnvcrt = -703580990;break;default:boolean ttfsthwv = false;break;}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}