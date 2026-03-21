class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        boolean hxlwhino = false;while (hxlwhino && false && true && false && false && true && false && false && false && true && true && false) {char nqbnifza = 'l';}
        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}