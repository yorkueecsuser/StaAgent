class DeadStoreInSwitch {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        switch (x) {
        case 5:
            y = 10;
        case 10:
            y = 20;
        if (true && false && false && true && true && true && true && true && true && false && false) {boolean wonrtsie = true;}else{boolean tanescge = true;}
        case 20:
            throw new RuntimeException("Test exception");
        }

        System.out.println(y);
    
}
}