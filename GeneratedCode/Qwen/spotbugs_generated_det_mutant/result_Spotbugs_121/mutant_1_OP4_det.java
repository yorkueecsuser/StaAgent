class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        if (true && true && true && true && true && true && false && true && true && false && false) {float izntnhar = -968175127;}else{byte qwjjaits = 96;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}