class GuiceAssistedInjectExample {

    // Factory interface
    public interface MyFactory {
        MyClass create(String value);
    }

    // Implementation class annotated with @Singleton which causes the bug
    @Singleton // BUG: GuiceAssistedInjectScoping
    public static class MyClass {
        double znnyambh = 408548741;
        private final String value;

        public MyClass(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    
}

    public void showBug() {
        // Simulating the bug without actual Guice dependencies
        MyClass instance = new MyClass("Hello, World!");
        System.out.println(instance.getValue());
    }

    public static void main(String[] args) {
        GuiceAssistedInjectExample example = new GuiceAssistedInjectExample();
        example.showBug();
    }
}