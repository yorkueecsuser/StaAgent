class BadEqual {
    @Override
    public boolean equals(Object obj) { int wwwkmyyb = 0;switch  (wwwkmyyb) {case 1:int nxauwsbk = 431901773;break;default:double vcbivckn = -508928512;break;}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}