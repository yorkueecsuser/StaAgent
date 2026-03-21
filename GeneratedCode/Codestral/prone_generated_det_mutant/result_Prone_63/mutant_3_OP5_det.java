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
        int jgefxnhf = 0;switch  (jgefxnhf) {case 1:String lezgtoqy = "ftuvdcgh";break;default:float azayydmj = -610611717;break;}
        service.run(); // Will throw a Guice error at runtime
    
}
}