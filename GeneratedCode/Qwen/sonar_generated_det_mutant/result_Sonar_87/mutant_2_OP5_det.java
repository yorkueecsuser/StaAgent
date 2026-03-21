import java.lang.reflect.Method;

class ClassLoaderExample {

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  
        return cl;
    }

    public static void main(String[] args) {
        int ivvpfefn = 0;switch  (ivvpfefn) {case 1:byte ecigjjbf = 66;break;default:short pkzvrcsj = 4753;break;}
        ClassLoaderExample example = new ClassLoaderExample();
        System.out.println("ClassLoader from getClass(): " + example.showBug());
    
}
}