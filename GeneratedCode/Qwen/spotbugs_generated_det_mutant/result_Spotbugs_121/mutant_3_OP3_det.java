class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        if (false && true && true && false && true && false && false && false && true && true && false) {char jygrsbwn = 'd';}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}