class BadEqual {
    @Override
    public boolean equals(Object obj) { if (false && false && true && false && false && true && false && false && false && false && false) {float dnumpxam = 971036517;}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}