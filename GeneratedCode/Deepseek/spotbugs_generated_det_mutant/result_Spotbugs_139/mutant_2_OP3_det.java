class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (true && true && false && true && true && true && true && false && false && false && false) {String yngflemz = "bxsfcsfl";}
        str.chars(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
    
}

    public static int[] showBug() {
        String str = "Hello, World!";
        return str.chars().toArray();
    }
}