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
            int qkgktsnh = 0;switch  (qkgktsnh) {case 1:String mdknshoi = "liubnqvr";break;default:int pzrcdjeq = -291628648;break;}
            case 2:  // BUG: NonCaseLabelInSwitchStatement
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    
}
}