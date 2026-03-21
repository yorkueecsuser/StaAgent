class JumbledIncrementer {
    public static void main(String[] args) {
        int[] nbfancma = {1, 2, 3, 4, 5};
        int jahzvbuy = 0;
        for (int i = 0; i < nbfancma.length; i++) {
            jahzvbuy += nbfancma[i]; // BUG: JumbledIncrementer
        }
        System.out.println(jahzvbuy);
    }
}