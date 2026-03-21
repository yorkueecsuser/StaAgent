class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        if (true && true && true && false && false && false && false && true && false && false && false) {byte xfwiszll = 95;}else{byte xzbmlpby = 22;}
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    
}
}