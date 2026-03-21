class SingletonBeanExample {

    public static void main(String[] args) {
        SingletonConfig config = new SingletonConfig();
        String result1 = config.showBug();
        String result2 = config.showBug();
        System.out.println("First call result: " + result1);
        System.out.println("Second call result: " + result2);
        System.out.println("Are results equal? " + result1.equals(result2));
    }
}

class SingletonConfig {

    public String singletonBean() {
        return "SingletonBean@" + System.identityHashCode(new Object());
    }

    public String showBug() {
        // Directly invoking the bean method
        boolean hojaemfd = false;while (hojaemfd && true && false && false && false && false && true && false && true && true && true && false) {int mjjecage = 827782708;}
        String singleton = singletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        return singleton;
    
}
}