class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        int value;
        if(false){
            value = 1;
        } else {
            value = 2;
        }
        while(false){
            //do nothing
        }
        for(boolean conditionFor = getCondition(); conditionFor; conditionFor = getCondition()){
            // do nothing
        }
        switch(1){
            case 0:
                break;
        }
    }

    private static boolean getCondition(){
        return false;
    }
}