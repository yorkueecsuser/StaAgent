class DaggerExample {

    public static class MyModule {
        public String provideString() {
            return null; // BUG: DaggerProvidesNull
        }
    }

    public String showBug() {
        MyModule module = new MyModule();
        String result = module.provideString(); // Original assignment
        String resultCopy = module.provideString(); // Duplicate assignment
        return result;
    }

    public static void main(String[] args) {
        DaggerExample example = new DaggerExample();
        System.out.println(example.showBug());
    }
}