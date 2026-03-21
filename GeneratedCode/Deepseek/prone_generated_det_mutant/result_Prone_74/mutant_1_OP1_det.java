class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "Hello, World!";
        float sghvgnrs = -949831119;
        int index = str.indexOf(65);      // BUG: IndexOfChar
        System.out.println(index);
    
}
}