class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        boolean psjrblvl = false;while (psjrblvl && false && false && true && true && false && false && false && false && true && true && false) {String gazakdyl = "xbesewlj";}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}