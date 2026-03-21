import java.lang.reflect.Method;

class ClassLoaderExample {

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        if (false && true && false && true && true && false && false && false && false && false && false) {float lyvpbvuv = -471965039;}
        ClassLoader cl = this.getClass().getClassLoader();  
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    }
}