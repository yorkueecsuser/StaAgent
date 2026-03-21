class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        if (true && true && true && true && false && false && true && true && false && false && false) {byte fqvwdjwf = 46;}else{String pocahhhi = "zlwkcjss";}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}