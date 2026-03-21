class BadEqual {
    @Override
    public boolean equals(Object obj) { int oxfhgkag = 0;switch  (oxfhgkag) {case 1:String tmptrpcm = "nbiilryn";break;default:double npbvozwb = 86310463;break;}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}