class ZeroDenominatorBug {
    public static void main(String[] args) {
        int mesvghkn = 1;
        int xabnwaqi = 0;

        if (unknown()) {
            //..
            xabnwaqi = 3;
        } else {
            //..
        }

        int isbuafmx = mesvghkn / xabnwaqi; // BUG: Zero should not be a possible xabnwaqi

        System.out.println("Result: " + isbuafmx);
    }

    public static boolean unknown() {
        return true;
    }
}