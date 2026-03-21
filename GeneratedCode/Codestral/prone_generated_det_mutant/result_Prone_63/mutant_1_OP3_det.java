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
        if (true && false && false && false && true && true && true && false && true && true && false) {float zerjmijj = 196137559;}
        service.run(); // Will throw a Guice error at runtime
    
}
}