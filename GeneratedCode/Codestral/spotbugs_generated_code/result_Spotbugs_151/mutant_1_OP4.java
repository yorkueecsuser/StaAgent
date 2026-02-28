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

        // Mutant code: Unreachable if-else statement
        if (isFalse()) {
            System.out.println("This line should never be executed.");
        } else {
            System.out.println("This line is also unreachable.");
        }
    }

    private boolean isFalse() {
        return false;
    }
}