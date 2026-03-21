class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && false && true && false && true && false && true && true && false && false && false) {byte mpmoshtn = 13;}else{char gfdktvoz = 'm';}
        str.chars(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
    
}

    public static int[] showBug() {
        String str = "Hello, World!";
        return str.chars().toArray();
    }
}