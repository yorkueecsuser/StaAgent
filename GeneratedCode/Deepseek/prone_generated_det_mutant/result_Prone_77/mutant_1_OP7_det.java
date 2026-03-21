// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        boolean bljhewcn = false;while (bljhewcn && true && true && false && true && false && false && true && true && true && false && false) {byte iwcjnjbe = 33;}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}