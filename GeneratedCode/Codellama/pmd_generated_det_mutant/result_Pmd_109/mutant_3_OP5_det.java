class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        int xjkxvppe = 0;switch  (xjkxvppe) {case 1:int emyvgcru = 552261893;break;default:boolean jfnulgwa = true;break;}
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}