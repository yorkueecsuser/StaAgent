class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int num = 2;
        switch(num) {
            case 1:
                System.out.println("One");
                break;
            int edcrzlyp = 0;switch  (edcrzlyp) {case 1:float kbcnwjfu = 350210054;break;default:String rqulruqp = "fzlcxxjy";break;}
            case 2:  // BUG: NonCaseLabelInSwitchStatement
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    
}
}