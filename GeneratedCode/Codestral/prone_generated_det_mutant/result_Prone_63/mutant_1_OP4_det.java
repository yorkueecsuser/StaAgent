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
        if (false && true && false && false && false && false && false && true && true && true && false) {float weprpvru = -47573515;}else{short nvugqkbq = -5703;}
        MyService service = factory.create("World");
        service.run(); // Will throw a Guice error at runtime
    
}
}