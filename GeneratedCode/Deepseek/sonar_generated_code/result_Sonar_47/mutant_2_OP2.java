class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; 
        String regex = "(?:)*"; // Mutated line, duplicating the assignment
        String str = "";
        return str.matches(regex);
    }
}