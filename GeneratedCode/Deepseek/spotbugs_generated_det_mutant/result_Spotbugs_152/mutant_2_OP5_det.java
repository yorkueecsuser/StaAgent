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
        int jzcvpszn = 0;switch  (jzcvpszn) {case 1:double zycwocvc = 43254974;break;default:long vojxkaki = -585046970;break;}
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