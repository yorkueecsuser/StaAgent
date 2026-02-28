class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean condition = false; 
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        if (condition) {
            System.out.println(s); 
        } else {
            System.out.println("This branch should never be reached.");
        }
    }
}