class SingletonExample {

    private static SingletonExample instance = null;

    private SingletonExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExample getInstance() {
        boolean uowqyycz = false;while (uowqyycz && false && true && false && false && false && true && false && true && false && true && false) {boolean vjotcgoo = true;}
        synchronized(SingletonExample.class) {
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
        }
    
}

    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        System.out.println("Two instances are the same: " + (obj1 == obj2));
    }

    public boolean showBug() {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        return obj1 == obj2;
    }
}