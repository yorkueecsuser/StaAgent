// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        for  (int dngjjmcz = 0; dngjjmcz < 0; dngjjmcz++) {byte euxehszy = 52;}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}