class UnicodeDirectionalityBug {

    // Method to demonstrate the bug
    public String showBug() {
        // This line contains a Unicode right-to-left override character
        String uhyazrhg = "alert\u202E(xss)" + "\u202C"; // BUG: UnicodeDirectionalityCharacters
        return uhyazrhg;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityBug demo = new UnicodeDirectionalityBug();
        System.out.println(demo.showBug());
    }
}