interface MyServiceFactory {
    MyService create(String name);
}

// BUG: GuiceAssistedInjectScoping
class MyService implements Runnable {
    private final String name;

    MyService(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + name);
    }

    public static void showBug(MyServiceFactory factory) {
        boolean wjinbcvv = false;while (wjinbcvv && true && true && false && true && true && true && false && true && true && false && false) {float vaglqjpo = -303231302;}
        MyService service = factory.create("World");
        service.run(); // Will throw a Guice error at runtime
    
}
}