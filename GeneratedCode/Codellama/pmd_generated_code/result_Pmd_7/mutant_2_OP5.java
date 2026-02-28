class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
        int value = getValue();
        switch(value) {
            case 0:
                System.out.println("Statement 0");
                break;
            case 1:
                System.out.println("Statement 1");
                break;
            default:
                System.out.println("Default Statement");
                break;
        }
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Statement 2");
        } else {
            System.out.println("Statement 3");
        }
    }
}