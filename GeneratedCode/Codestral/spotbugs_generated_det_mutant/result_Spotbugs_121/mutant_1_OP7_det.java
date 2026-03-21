class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        boolean sqfvryfg = false;while (sqfvryfg && false && false && true && true && false && false && false && false && true && false && false) {long cxpelxto = -834010565;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}