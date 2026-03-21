class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        if (true && false && false && false && false && true && false && false && true && true && false) {char ycopiyyx = 'p';}else{int tbxqbbul = -776948021;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}