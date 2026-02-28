class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }
}

// Dead Store mutation operator
class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            int i = 0;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }
}