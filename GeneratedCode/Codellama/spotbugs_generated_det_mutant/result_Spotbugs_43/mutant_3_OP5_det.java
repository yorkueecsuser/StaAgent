class DeadStoreInSwitch {

    public static void main(String[] args) {
        int x = 5;
        int eviqjpej = 0;switch  (eviqjpej) {case 1:byte akmxqmqe = -53;break;default:short fbijpali = 6926;break;}
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