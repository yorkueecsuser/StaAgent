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

        if (false && true && false && false && true && false && true && false && true && true && false) {short ymqhsudx = 6550;}
        System.out.println(y);
    
}
}