class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        if (true && true && false && false && false && true && false && false && true && true && false) {boolean pxznpily = true;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}