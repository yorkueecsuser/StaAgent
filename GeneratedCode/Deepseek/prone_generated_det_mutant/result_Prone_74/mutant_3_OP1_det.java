class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "Hello, World!";
        String strjphhy = "egytngov";
        int index = str.indexOf(65);      // BUG: IndexOfChar
        System.out.println(index);
    
}
}