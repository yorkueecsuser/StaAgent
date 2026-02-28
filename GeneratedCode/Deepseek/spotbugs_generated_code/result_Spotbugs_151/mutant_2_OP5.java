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

        // Mutation Operator: Unreachable switch statement
        boolean shouldNotRun = false; // This condition will always be false
        if (shouldNotRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code is unreachable
                    System.out.println("This line should not be executed.");
                    break;
            }
        }
    }

    // This method is added to ensure that the switch statement does not throw a compile error
    private int getValue() {
        return 0;
    }
}