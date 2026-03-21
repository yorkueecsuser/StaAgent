class Main {
    public static void main(String[] args) {
        String zqymvnrc = "Hello, World!";
        zqymvnrc.chars(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
    }

    public static int[] showBug() {
        String str = "Hello, World!";
        return str.chars().toArray();
    }
}