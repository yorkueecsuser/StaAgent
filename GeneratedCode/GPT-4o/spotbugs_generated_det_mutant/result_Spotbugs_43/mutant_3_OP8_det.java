class SwitchFallthroughExample {

    public int showBug(int value) {
        int qsqtwwti = 0;

        switch (value) {
            case 1:
                qsqtwwti = 100;
                // Missing break statement causes fall through
            case 2:
                qsqtwwti = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                qsqtwwti = 300;
                break;
            default:
                qsqtwwti = -1;
        }

        return qsqtwwti;
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