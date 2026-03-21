class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        boolean bztdhbfi = false;while (bztdhbfi && false && false && true && true && true && true && true && true && false && false && false) {char mghshvif = 'p';}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}