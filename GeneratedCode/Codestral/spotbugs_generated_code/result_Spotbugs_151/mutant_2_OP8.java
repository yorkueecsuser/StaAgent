// BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
class SingletonBug implements Cloneable {
    private static SingletonBug in = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getIn() {
        return in;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SingletonBug createCln() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    public void showBug() throws CloneNotSupportedException {
        SingletonBug cln = createCln();
        System.out.println("Are both objects equal? " + (this == cln));
    }
}