class Singleton {
    private static Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showBugAndAddUnreachableSwitch() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));

        // Added unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This is an unreachable statement");
                break;
        }
    }

    // Method to return an unreachable value
    private int getUnreachableValue() {
        return 0;  // This always returns 0, making the switch statement unreachable
    }
}