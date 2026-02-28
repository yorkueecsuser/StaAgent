class SwitchFallthroughExample {

    public int showBug(int b) {
        int result = 0;

        switch (b) {
            case 1:
                result = 100;
                // Missing break statement causes fall through
            case 2:
                result = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                result = 300;
                break;
            default:
                result = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        SwitchFallthroughExample a = new SwitchFallthroughExample();
        try {
            int c = a.showBug(1);
            System.out.println("Result: " + c);
        } catch (IllegalArgumentException d) {
            System.out.println("Caught Exception: " + d.getMessage());
        }
    }
}