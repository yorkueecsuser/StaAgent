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
        for  (int iqektadk = 0; iqektadk < 0; iqektadk++) {char deevnncl = 'x';}
        MyService service = factory.create("World");
        service.run(); // Will throw a Guice error at runtime
    
}
}