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

        // Mutant: Unreachable switch statement
        int value = 1;
        boolean condition = getCondition();
        if (condition) {
            switch (value) {
                case 2:
                    System.out.println("This line is unreachable.");
                    break;
                default:
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the switch statement unreachable
    }
}