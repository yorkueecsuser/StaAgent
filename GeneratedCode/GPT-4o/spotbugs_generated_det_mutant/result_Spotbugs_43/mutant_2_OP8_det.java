class SwitchFallthroughExample {

    public int showBug(int value) {
        int mcpylcjc = 0;

        switch (value) {
            case 1:
                mcpylcjc = 100;
                // Missing break statement causes fall through
            case 2:
                mcpylcjc = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                mcpylcjc = 300;
                break;
            default:
                mcpylcjc = -1;
        }

        return mcpylcjc;
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