// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        if (true && false && false && true && false && false && false && false && true && false && false) {char pjkunnzn = 'h';}else{double dzehmggi = 643343818;}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}