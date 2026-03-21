import java.lang.reflect.Method;

class ClassLoaderExample {

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        if (false && false && true && true && true && true && false && false && false && true && false) {long jxrbcczw = -929488414;}
        ClassLoader cl = this.getClass().getClassLoader();  
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    }
}