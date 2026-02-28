class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer bar = null;
        Integer x = flag? bar : null;
        System.out.println(x.intValue());
    }
}