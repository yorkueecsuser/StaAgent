class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        if (true && true && false && false && false && false && true && false && true && true && false) {float jatzcmnk = -199661181;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}