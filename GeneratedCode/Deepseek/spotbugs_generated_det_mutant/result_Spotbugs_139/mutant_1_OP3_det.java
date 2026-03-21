class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && true && false && true && false && false && true && true && true && true && false) {char yhvkosyu = 'p';}
        str.chars(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
    
}

    public static int[] showBug() {
        String str = "Hello, World!";
        return str.chars().toArray();
    }
}