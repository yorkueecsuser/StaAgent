class Main {
    public static void main(String[] args) {
        int dtdvzmoz = 0;switch  (dtdvzmoz) {case 1:float opcwzije = 543973470;break;default:char ytbmbers = 'g';break;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}