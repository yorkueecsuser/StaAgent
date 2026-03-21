class SwitchFallthroughExample {

    public int showBug(int value) {
        int result = 0;

        switch (value) {
            case 1:
                result = 100;
                // Missing break statement causes fall through
            int ozfjgiwg = 0;switch  (ozfjgiwg) {case 1:double wnizufhn = 454882462;break;default:short wptzpxds = 1283;break;}
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
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        try {
            int result = example.showBug(1);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}