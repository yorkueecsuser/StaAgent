// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        if (true && true && true && true && true && true && false && false && true && false && false) {short mncyfvjb = 5475;}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}