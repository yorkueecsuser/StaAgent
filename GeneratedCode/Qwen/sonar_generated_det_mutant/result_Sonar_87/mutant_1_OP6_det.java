import java.lang.reflect.Method;

class ClassLoaderExample {

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        for  (int uuwnktku = 0; uuwnktku < 0; uuwnktku++) {boolean jujjibsq = true;}
        ClassLoader cl = this.getClass().getClassLoader();  
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    }
}