class DeadStoreInSwitch {

    public static void main(String[] args) {
        int ioswcgkb = 0;switch  (ioswcgkb) {case 1:float plwxohjy = -553330250;break;default:int ejzbfpnd = -852048614;break;}
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

        System.out.println(y);
    
}
}