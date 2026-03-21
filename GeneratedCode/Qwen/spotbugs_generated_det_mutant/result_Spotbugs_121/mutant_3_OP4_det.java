class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        if (true && true && true && false && true && true && true && false && false && false && false) {long tpwaxgrh = -344679921;}else{float kehtevse = 366263247;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}