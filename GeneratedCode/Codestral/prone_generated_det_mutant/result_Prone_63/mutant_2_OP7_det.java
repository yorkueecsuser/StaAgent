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
        boolean azllbdjn = false;while (azllbdjn && false && true && false && false && false && true && true && true && true && false && false) {boolean lafskvqj = false;}
        MyService service = factory.create("World");
        service.run(); // Will throw a Guice error at runtime
    
}
}