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
        boolean phstyvrt = false;while (phstyvrt && false && false && true && false && true && false && false && true && true && false && false) {float kecxfnuc = -637868032;}
        service.run(); // Will throw a Guice error at runtime
    
}
}