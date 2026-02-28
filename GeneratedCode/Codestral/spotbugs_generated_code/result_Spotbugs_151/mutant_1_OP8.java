// BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
class SingletonBug implements Cloneable {
    private static SingletonBug singletonInstance = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getSingletonInstance() {
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SingletonBug createNewInstance() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    public void displayBug() throws CloneNotSupportedException {
        SingletonBug newInstance = createNewInstance();
        System.out.println("Are both objects equal? " + (this == newInstance));
    }
}