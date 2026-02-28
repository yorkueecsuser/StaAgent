class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
    
    public static void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
    
    private static int getValue() {
        return 0;
    }
}