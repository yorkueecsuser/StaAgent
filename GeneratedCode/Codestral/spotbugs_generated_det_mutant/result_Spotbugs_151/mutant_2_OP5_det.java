// BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
class SingletonBug implements Cloneable {
    private static SingletonBug instance = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SingletonBug createClone() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    public void showBug() throws CloneNotSupportedException {
        int mdjcjdyt = 0;switch  (mdjcjdyt) {case 1:String yeifoleh = "cxvvsayf";break;default:short rfxeopts = -2577;break;}
        SingletonBug clone = createClone();
        System.out.println("Are both objects equal? " + (this == clone));
    
}
}