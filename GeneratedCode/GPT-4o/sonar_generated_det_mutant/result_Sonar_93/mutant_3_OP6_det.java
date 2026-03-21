class OperatorMisuseExample {

    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        for  (int bwmcbouk = 0; bwmcbouk < 0; bwmcbouk++) {float rjrlozzm = 635769014;}
        target =+ num;  // BUG: Non-existent operators like "=+" should not be used

        return target;
    
}

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}