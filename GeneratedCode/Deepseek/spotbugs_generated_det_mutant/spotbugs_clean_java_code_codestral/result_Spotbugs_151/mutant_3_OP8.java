// BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
class SingletonBug implements Cloneable {
    private static SingletonBug a = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getInstance() {
        return a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SingletonBug createClone() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    public void showBug() throws CloneNotSupportedException {
        SingletonBug b = createClone();
        System.out.println("Are both objects equal? " + (a == b));
    }
}