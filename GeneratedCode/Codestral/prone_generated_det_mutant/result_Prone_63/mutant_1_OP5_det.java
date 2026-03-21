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
        int yqxvuxir = 0;switch  (yqxvuxir) {case 1:long zjtczmwq = 424388304;break;default:long hrnmgrqe = -162090039;break;}
        service.run(); // Will throw a Guice error at runtime
    
}
}