class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        for  (int ukkoruwc = 0; ukkoruwc < 0; ukkoruwc++) {String dxqxoufg = "khrshglo";}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}