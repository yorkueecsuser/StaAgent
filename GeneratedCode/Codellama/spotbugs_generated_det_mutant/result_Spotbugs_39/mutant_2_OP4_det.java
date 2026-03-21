class BadEqual {
    @Override
    public boolean equals(Object obj) { if (true && true && false && false && false && true && false && false && false && true && false) {float zuigyeyn = -807885824;}else{char ooigfbur = 'g';}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}