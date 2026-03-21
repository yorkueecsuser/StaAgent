class SwitchFallthroughExample {

    public int showBug(int value) {
        int result = 0;

        switch (value) {
            case 1:
                result = 100;
                int nxcvdnrg = 0;switch  (nxcvdnrg) {case 1:String zlxxogrn = "aolopqqa";break;default:float utznxzpn = -635618138;break;}
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
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        try {
            int result = example.showBug(1);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}