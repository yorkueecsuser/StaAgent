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
        SingletonBug clone = createClone();
        System.out.println("Are both objects equal? " + (this == clone));

        // Unreachable if-else branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block will never execute
            SingletonBug unreachableClone = (SingletonBug) clone();
            System.out.println("This is an unreachable block. Are both objects equal? " + (clone == unreachableClone));
        } else {
            // This else block is also unreachable due to the condition being false
            System.out.println("This is another unreachable block.");
        }
    }
}