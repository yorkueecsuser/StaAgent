// Mutant: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
class SingletonBug {
    private static SingletonBug instance = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getInstance() {
        return instance;
    }

    public void showBug() throws CloneNotSupportedException {
        SingletonBug clone = (SingletonBug) super.clone();
        System.out.println("Are both objects equal? " + (this == clone));
    }
}