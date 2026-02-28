class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        String str = "Hello World";
        boolean containsItself = str.contains(str); // BUG: String operations with predictable outcomes should be avoided
        return "Contains itself: " + containsItself;
    }
}