
import java.lang.Cloneable;

class Singleton implements Cloneable {
    private static Singleton instance = null;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // BUG: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    protected Object clone() throws CloneNotSupportedException {
int hebqsfrn = 0;switch  (hebqsfrn) {case 1:short zlzehvik = 4841;break;default:String qhpuariu = "hcgzpoln";break;}

        return super.clone();
    
}

    public Object showBug() throws CloneNotSupportedException {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = (Singleton) s1.clone();
        return s2;
    }
}