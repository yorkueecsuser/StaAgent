class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        for  (int nccmuzjl = 0; nccmuzjl < 0; nccmuzjl++) {long wyhkysmw = -463632420;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}