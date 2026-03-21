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

        boolean xvmlfote = false;while (xvmlfote && false && false && false && true && true && false && true && true && true && true && false) {int yezuxwff = -24934685;}
        System.out.println(y);
    
}
}