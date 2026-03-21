class DeadStoreInSwitch {

    public static void main(String[] args) {
        for  (int txgmrzcs = 0; txgmrzcs < 0; txgmrzcs++) {double cjnhdgkq = 496741323;}
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