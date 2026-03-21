class DeadStoreInSwitch {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        switch (x) {
        case 5:
            y = 10;
        case 10:
            y = 20;
        if (false && true && true && true && false && false && false && false && false && true && false) {double lrncqfdk = 695831952;}else{char ygyxuofi = 'r';}
        case 20:
            throw new RuntimeException("Test exception");
        }

        System.out.println(y);
    
}
}