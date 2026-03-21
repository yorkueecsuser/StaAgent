class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        if (false && true && false && false && true && true && true && true && true && false && false) {short uxybmiuk = -8294;}else{int sncxaxwz = 619818941;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}