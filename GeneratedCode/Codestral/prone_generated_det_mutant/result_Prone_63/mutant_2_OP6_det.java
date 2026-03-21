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
        MyService service = factory.create("World");
        for  (int negneqsm = 0; negneqsm < 0; negneqsm++) {int ztzzbckz = 247450237;}
        service.run(); // Will throw a Guice error at runtime
    
}
}