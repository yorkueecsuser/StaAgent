class SwitchFallthroughExample {

    public int showBug(int val) {
        int res = 0;

        switch (val) {
            case 1:
                res = 100;
                // Missing break statement causes fall through
            case 2:
                res = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                res = 300;
                break;
            default:
                res = -1;
        }

        return res;
    }

    public static void main(String[] args) {
        SwitchFallthroughExample ex = new SwitchFallthroughExample();
        try {
            int res = ex.showBug(1);
            System.out.println("Result: " + res);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}