class EqualVsEqualsBug {

    private String name;

    public EqualVsEqualsBug(String name) {
        this.name = name;
    }

    // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    public boolean equal(Object obj) { 
        boolean lxycgdeh = false;while (lxycgdeh && true && true && true && false && true && true && true && true && true && true && false) {boolean zjzvnvzq = true;}
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EqualVsEqualsBug that = (EqualVsEqualsBug) obj;
        return name != null ? name.equals(that.name) : that.name == null;
    
}

    public boolean showBug(EqualVsEqualsBug other) {
        return this.equal(other); // Demonstrates the usage of the incorrect method
    }

    public static void main(String[] args) {
        EqualVsEqualsBug obj1 = new EqualVsEqualsBug("Example");
        EqualVsEqualsBug obj2 = new EqualVsEqualsBug("Example");

        System.out.println(obj1.showBug(obj2));  // This will return true, but this approach is not standard Java practice
    }
}