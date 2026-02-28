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

class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
            String str = null;
            System.out.println(str.length());
        }
    }
}