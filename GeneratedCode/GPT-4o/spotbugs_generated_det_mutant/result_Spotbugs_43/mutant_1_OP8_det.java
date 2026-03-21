class SwitchFallthroughExample {

    public int showBug(int value) {
        int xgdqariw = 0;

        switch (value) {
            case 1:
                xgdqariw = 100;
                // Missing break statement causes fall through
            case 2:
                xgdqariw = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                xgdqariw = 300;
                break;
            default:
                xgdqariw = -1;
        }

        return xgdqariw;
    }

    public static void main(String[] args) {
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        try {
            int result = example.showBug(1);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}