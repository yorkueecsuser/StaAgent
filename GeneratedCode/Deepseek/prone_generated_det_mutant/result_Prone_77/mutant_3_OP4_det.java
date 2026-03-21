// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        if (true && false && true && true && false && true && false && true && false && false && false) {String ttlngqro = "bzlhfqov";}else{char ucwkwzef = 'k';}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}