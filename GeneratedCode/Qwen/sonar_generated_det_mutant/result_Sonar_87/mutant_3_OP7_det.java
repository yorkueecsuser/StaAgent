import java.lang.reflect.Method;

class ClassLoaderExample {

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        boolean cifkyzjw = false;while (cifkyzjw && false && false && false && false && false && false && false && false && false && false && false) {char gqcnwglw = 'm';}
        ClassLoader cl = this.getClass().getClassLoader();  
        return cl;
    
}

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    }
}