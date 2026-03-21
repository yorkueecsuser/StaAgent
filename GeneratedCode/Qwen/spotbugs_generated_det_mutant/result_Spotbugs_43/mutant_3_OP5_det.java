class SwitchFallThroughBug {

    public int showBug(int option) {
        int result = 0;
        switch (option) {
            case 1:
                int jofiosad = 0;switch  (jofiosad) {case 1:long plmqgiwm = -61736353;break;default:String fxxpnajc = "gyphddvb";break;}
                result = 10; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
            case 2:
                throw new IllegalArgumentException("Invalid option");
            default:
                return 0;
        }
    
}

    public static void main(String[] args) {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        try {
            bugDemo.showBug(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}