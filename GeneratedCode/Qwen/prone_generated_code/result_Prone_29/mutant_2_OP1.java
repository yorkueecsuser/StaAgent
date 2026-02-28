class DaggerExample {

    public static class MyModule {
        public String provideString() {
            return null; // BUG: DaggerProvidesNull
        }
    }

    public String showBug() {
        MyModule module = new MyModule();
        String qwejklmn; // Dead Store
        return module.provideString();
    }

    public static void main(String[] args) {
        DaggerExample example = new DaggerExample();
        int abcdwxyz; // Dead Store
        System.out.println(example.showBug());
    }
}