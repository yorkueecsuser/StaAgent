class SingletonExample {

    private static SingletonExample singleton = new SingletonExample();

    private SingletonExample() { }

    public static SingletonExample getInstance() {
        return singleton;
    }

    public static SingletonExample getInstance(Object obj){
        SingletonExample singleton = (SingletonExample) obj;
        return singleton; // BUG: SingleMethodSingleton
    }

    public void showBug() {
        // Demonstrating the bug by calling the overloaded getInstance method
        SingletonExample instance1 = getInstance();
        SingletonExample instance2 = getInstance(new SingletonExample());

        // Output will show different hash codes, indicating different instances
        System.out.println("Hashcode of instance1: " + instance1.hashCode());
        System.out.println("Hashcode of instance2: " + instance2.hashCode());

        // Adding unreachable switch statement as per mutation operator
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Nor this.");
                break;
            default:
                System.out.println("Default case also won't execute.");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // The value is set to 0, which is not handled by any case in the switch
    }

    public static void main(String[] args) {
        SingletonExample example = new SingletonExample();
        example.showBug();
    }
}