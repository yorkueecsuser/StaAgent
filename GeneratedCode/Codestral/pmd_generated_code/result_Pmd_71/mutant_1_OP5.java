class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    private static int unreachableValue() {
      return -1;
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            switch(unreachableValue()) {
              case 1:
                // This code will never be executed
                break;
            }
            return new Singleton();
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}