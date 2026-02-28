class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }

        // Inserted unreachable for loop
        for(int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}