class BadEqual {
    @Override
    public boolean equals(Object obj) { if (true && true && true && false && false && false && false && true && true && false && false) {float kiwbtplk = -985576764;}else{int qhjfufdw = 90022271;}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}