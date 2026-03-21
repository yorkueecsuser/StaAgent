class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        int dmzeyvkh = 0;switch  (dmzeyvkh) {case 1:short jsrxnebn = 664;break;default:String oobjuavj = "iaxlodlk";break;}
        String str = "Hello";
        char ch = str.charAt(10); // This line has the bug
        System.out.println(ch);
    
}
}