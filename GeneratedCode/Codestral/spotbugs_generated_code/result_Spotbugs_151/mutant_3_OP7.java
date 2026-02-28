// BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
// MUTANT: Unreachable while loop
class SingletonBug implements Cloneable {
    private static SingletonBug instance = new SingletonBug();

    private SingletonBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable mutant code
        }
        // Private constructor to restrict new instances
    }

    private boolean getCondition() {
        return false; // Always returning false to make the loop unreachable
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
        SingletonBug clone = createClone();
        System.out.println("Are both objects equal? " + (this == clone));
    }
}