class DaggerExample {

    public static class MyModule {
        public String provideString() {
            return null; // BUG: DaggerProvidesNull
        }
    }

    public String showBug() {
        MyModule module = new MyModule();
        MyModule x = module; // Mutant: Renamed'module' to 'x'
        return x.provideString();
    }

    public static void main(String[] args) {
        DaggerExample example = new DaggerExample();
        DaggerExample y = example; // Mutant: Renamed 'example' to 'y'
        System.out.println(y.showBug());
    }
}