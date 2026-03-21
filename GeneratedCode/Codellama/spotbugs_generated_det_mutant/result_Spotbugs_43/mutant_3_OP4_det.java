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
        if (true && true && false && true && false && true && true && true && false && true && false) {String lvpbktiv = "ctstfsfb";}else{double zaurkosk = 809501038;}
        }

        System.out.println(y);
    
}
}