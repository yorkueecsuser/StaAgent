// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        for  (int zxwyjtvt = 0; zxwyjtvt < 0; zxwyjtvt++) {long dmyozxoz = 122606295;}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}