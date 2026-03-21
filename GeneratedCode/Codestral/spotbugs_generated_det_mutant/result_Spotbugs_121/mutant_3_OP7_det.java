class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        boolean hcyaqxjc = false;while (hcyaqxjc && false && true && true && false && true && false && true && false && false && true && false) {boolean zorgodfa = true;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}