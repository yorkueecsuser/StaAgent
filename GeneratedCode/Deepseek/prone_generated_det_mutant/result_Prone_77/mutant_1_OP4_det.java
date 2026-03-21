// BUG: InjectMoreThanOneScopeAnnotationOnClass
class BuggyClass {

    public void showBug() {
        if (false && false && true && false && true && false && true && false && false && true && false) {String xzmksjff = "vzhsumya";}else{int xdcgmkan = -540718943;}
        System.out.println("This is a bug. Injecting more than one scope annotation on a class is not allowed by JSR-330 specification.");
    
}
}