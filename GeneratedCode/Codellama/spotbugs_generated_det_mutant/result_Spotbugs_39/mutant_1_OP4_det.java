class BadEqual {
    @Override
    public boolean equals(Object obj) { if (false && false && false && true && true && true && true && false && true && false && false) {byte rslqenjj = -60;}else{String dtrborbb = "xbmognzg";}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}