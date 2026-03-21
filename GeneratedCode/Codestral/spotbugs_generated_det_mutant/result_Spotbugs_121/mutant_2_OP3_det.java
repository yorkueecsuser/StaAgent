class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        if (true && false && false && false && true && false && true && false && false && true && false) {byte baesubue = -55;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}