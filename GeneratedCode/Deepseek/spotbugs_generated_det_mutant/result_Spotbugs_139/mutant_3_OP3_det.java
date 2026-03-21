class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && false && true && false && true && false && false && false && true && false && false) {float imjttutt = 424358099;}
        str.chars(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
    
}

    public static int[] showBug() {
        String str = "Hello, World!";
        return str.chars().toArray();
    }
}