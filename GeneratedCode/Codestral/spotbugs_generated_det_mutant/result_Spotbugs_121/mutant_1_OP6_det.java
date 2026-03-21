class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        for  (int adcbbkrx = 0; adcbbkrx < 0; adcbbkrx++) {char xfncsavz = 'r';}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}