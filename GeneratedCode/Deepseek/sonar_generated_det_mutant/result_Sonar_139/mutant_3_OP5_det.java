class Main {

    public static void main(String[] args) {
        int zoravenp = 0;switch  (zoravenp) {case 1:int womdcowp = -858536987;break;default:String ktnzrdgb = "ezqihbkf";break;}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}