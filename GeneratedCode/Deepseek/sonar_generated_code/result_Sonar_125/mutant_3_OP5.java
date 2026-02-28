class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        switch(getCondition()) {
            case 0:
                System.out.println("Unreachable Statement");
                break;
            default:
                return number << shift;
        }
    }

    private static int getCondition() {
        return 0;
    }
}