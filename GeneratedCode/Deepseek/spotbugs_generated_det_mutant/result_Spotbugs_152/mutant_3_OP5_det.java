import java.io.Serializable;

class Singleton implements Cloneable, Serializable {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException {
        int tezqgimn = 0;switch  (tezqgimn) {case 1:int vrcmvjjv = 196442343;break;default:double byhfjzue = 118131120;break;}
        throw new CloneNotSupportedException(); // BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    
}

    public void showBug() {
        Singleton s1 = Singleton.getInstance();
        try {
            Singleton s2 = (Singleton) s1.clone(); 
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage()); // This should print "CloneNotSupportedException", demonstrating the bug
        }
    }
}