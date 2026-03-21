class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        int rlixgnhz = 0;switch  (rlixgnhz) {case 1:String iiyfasbs = "aqwvavcr";break;default:short zxsicupc = 3938;break;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}