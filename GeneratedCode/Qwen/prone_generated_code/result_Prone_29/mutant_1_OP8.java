class DaggerExample {

    public static class MyModule {
        public String provideString() {
            return null; // BUG: DaggerProvidesNull
        }
    }

    public String showBug() {
        MyModule module = new MyModule();
        return module.provideString();
    }

    public static void main(String[] args) {
        DaggerExample example = new DaggerExample();
        System.out.println(example.showBug());
    }

    // Mutated code
    public String showBugMutant() {
        MyModule x = new MyModule();
        return x.provideString();
    }

    public static void mainMutant(String[] b) {
        DaggerExample c = new DaggerExample();
        System.out.println(c.showBugMutant());
    }
}