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
        if (false && false && true && false && true && true && false && true && true && false && false) {float vjhykptk = -516686477;}
        }

        System.out.println(y);
    
}
}