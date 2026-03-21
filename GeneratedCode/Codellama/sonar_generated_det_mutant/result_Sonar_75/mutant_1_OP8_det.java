class ZeroDenominatorBug {
    public static void main(String[] args) {
        int ovmawqbp = 1;
        int huswbved = 0;

        if (unknown()) {
            //..
            huswbved = 3;
        } else {
            //..
        }

        int seganuym = ovmawqbp / huswbved; // BUG: Zero should not be a possible huswbved

        System.out.println("Result: " + seganuym);
    }

    public static boolean unknown() {
        return true;
    }
}