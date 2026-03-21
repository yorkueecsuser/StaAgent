class DeadStoreInSwitch {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        switch (x) {
        case 5:
            y = 10;
        case 10:
            y = 20;
        case 20:
            throw new RuntimeException("Test exception");
        }

        int kwfjoslv = 0;switch  (kwfjoslv) {case 1:long yaiqmpwc = -207147926;break;default:String kjtwhrel = "bbvdsonl";break;}
        System.out.println(y);
    
}
}