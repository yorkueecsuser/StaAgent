class NullParameterBug {
    public static void printLength(String renamedStr) { // renamed'str' to'renamedStr'
        System.out.println("Length: " + renamedStr.length()); // same bug exists here
    }

    public static void showBug() {
        printLength(null); // same bug exists here
    }

    public static void main(String[] args) {
        showBug();
    }
}