class BadEqual {
    @Override
    public boolean equals(Object obj) { for  (int uupkuzky = 0; uupkuzky < 0; uupkuzky++) {boolean ecokegjx = true;}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}