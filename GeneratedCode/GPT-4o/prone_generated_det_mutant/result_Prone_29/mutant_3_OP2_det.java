class DaggerProvidesNullExample {

    public static class SomeService {
        public String provideString() {
            // Simulating a case where null might be returned
            if (Math.random() > 0.5) {
                return "Hello, World!";
            }
            return null; // BUG: DaggerProvidesNull
        }
    }

    public static class Injector {
        private SomeService someServiceProvider;

        public Injector() {
            someServiceProvider = new SomeService();
        }

        public SomeService getSomeService() {
            return someServiceProvider;
        }
    }
public String showBug() {
    Injector injector = new Injector();
    SomeService service = injector.getSomeService();
    service = injector.getSomeService();
    return service.provideString();
}

    public static void main(String[] args) {
        DaggerProvidesNullExample example = new DaggerProvidesNullExample();
        System.out.println(example.showBug());
    }
}