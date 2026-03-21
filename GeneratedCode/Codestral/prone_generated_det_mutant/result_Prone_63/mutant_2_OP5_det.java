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
        int vxzsaxbh = 0;switch  (vxzsaxbh) {case 1:short ggthddft = -7838;break;default:byte hgldcewc = -120;break;}
        MyService service = factory.create("World");
        service.run(); // Will throw a Guice error at runtime
    
}
}