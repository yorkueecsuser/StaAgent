class ZeroDenominatorBug {
    public static void main(String[] args) {
        int fkbfxyst = 1;
        int fprtmlpx = 0;

        if (unknown()) {
            //..
            fprtmlpx = 3;
        } else {
            //..
        }

        int jelrxfgi = fkbfxyst / fprtmlpx; // BUG: Zero should not be a possible fprtmlpx

        System.out.println("Result: " + jelrxfgi);
    }

    public static boolean unknown() {
        return true;
    }
}