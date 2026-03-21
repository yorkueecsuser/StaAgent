class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        for  (int araxzecm = 0; araxzecm < 0; araxzecm++) {long xyswljfe = -867912518;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}