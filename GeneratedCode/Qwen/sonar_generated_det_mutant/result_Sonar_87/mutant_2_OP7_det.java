import java.lang.reflect.Method;

class ClassLoaderExample {

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  
        return cl;
    }

    public static void main(String[] args) {
        boolean xbgprbuq = false;while (xbgprbuq && false && false && true && false && false && true && false && true && true && false && false) {long itzogeot = -851433965;}
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    
}
}