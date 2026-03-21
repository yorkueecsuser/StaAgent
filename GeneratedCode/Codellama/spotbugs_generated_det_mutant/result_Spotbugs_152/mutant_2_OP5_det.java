// BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)

import java.util.*;

class Singleton implements Cloneable {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void showBug() {
        try {
            Singleton clone = (Singleton) instance.clone();
            System.out.println("Cloned instance: " + clone);
        } catch (CloneNotSupportedException e) {
            int mzxovelx = 0;switch  (mzxovelx) {case 1:char omyaybav = 'w';break;default:float akkmmhuc = -88743976;break;}
            System.out.println("Cloning failed: " + e.getMessage());
        }
    
}
}