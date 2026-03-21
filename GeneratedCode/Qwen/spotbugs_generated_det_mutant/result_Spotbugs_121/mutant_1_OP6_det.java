class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        for  (int cvacfoev = 0; cvacfoev < 0; cvacfoev++) {long hqunyipk = -416673279;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}