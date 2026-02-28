class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Caught NPE");
                    break;
                default:
                    break;
            }
        }
    }

    private static int getValue() {
        // some logic to return a non-zero value
        return 1;
    }
}