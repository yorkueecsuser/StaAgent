class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        if (false && true && false && false && false && false && true && true && true && true && false) {short dtbaarlo = -4418;}else{float vzeillcr = -352050376;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}