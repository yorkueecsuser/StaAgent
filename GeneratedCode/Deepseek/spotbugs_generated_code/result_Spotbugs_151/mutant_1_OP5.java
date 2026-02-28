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
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be reached.");
                break;
        }
        return (SingletonBug) clone();
    }

    public void showBug() throws CloneNotSupportedException {
        SingletonBug clone = createClone();
        System.out.println("Are both objects equal? " + (this == clone));
    }

    private int getUnreachableValue() {
        return -1;  // This value will never be 1, making the switch case unreachable.
    }
}