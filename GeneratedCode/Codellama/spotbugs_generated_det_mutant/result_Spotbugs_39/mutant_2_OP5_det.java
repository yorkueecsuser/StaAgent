class BadEqual {
    @Override
    public boolean equals(Object obj) { int wqkrrwuz = 0;switch  (wqkrrwuz) {case 1:float eozuxazy = 982689589;break;default:float hfssxdgp = 797828281;break;}
 // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    
}

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}