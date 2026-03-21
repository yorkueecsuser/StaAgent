class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        int rkryfpdi = 548550044;
        String str = (String) object; // This will always throw a ClassCastException
    
}
}