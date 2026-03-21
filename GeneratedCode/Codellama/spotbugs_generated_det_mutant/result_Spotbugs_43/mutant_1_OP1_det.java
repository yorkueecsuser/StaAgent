class DeadStoreInSwitch {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        switch (x) {
        case 5:
            y = 10;
        case 10:
            boolean quhtregk = true;
            y = 20;
        case 20:
            throw new RuntimeException("Test exception");
        }

        System.out.println(y);
    
}
}