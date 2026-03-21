class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        boolean eyjrcyhx = false;
        String str = (String) object; // This will always throw a ClassCastException
    
}
}