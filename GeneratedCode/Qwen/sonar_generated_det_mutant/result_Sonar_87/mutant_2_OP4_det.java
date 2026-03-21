import java.lang.reflect.Method;

class ClassLoaderExample {

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        if (false && false && true && true && false && false && false && false && true && false && false) {byte rvoxdnmb = -107;}else{boolean pxdggxig = true;}
        ClassLoader cl = this.getClass().getClassLoader();  
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    }
}