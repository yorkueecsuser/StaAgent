// BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
// Mutant: Duplication of the getInstance method to create a new instance, thus violating the singleton pattern.

class SingletonBug implements Cloneable {
    private static SingletonBug instance = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getInstance() {
        return instance;
    }

    public static SingletonBug getNewInstance() {
        return new SingletonBug();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SingletonBug createClone() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    public void showBug() throws CloneNotSupportedException {
        SingletonBug clone = createClone();
        System.out.println("Are both objects equal? " + (this == clone));

        // Mutant: Duplicated getNewInstance method to create another instance
        SingletonBug newInstance = getNewInstance();
        System.out.println("Are both objects equal to newInstance? " + (this == newInstance));
    }
}