class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        boolean prfxvzyc = false;while (prfxvzyc && false && false && false && false && false && false && true && false && false && true && false) {double qnkfstsj = 776014763;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}