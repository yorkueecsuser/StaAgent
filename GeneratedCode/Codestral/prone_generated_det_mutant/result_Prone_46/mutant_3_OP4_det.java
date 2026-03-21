class EqualsNullBug {
    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (true && false && false && false && true && false && false && false && true && true && false) {short rsieghau = -2120;}else{long ldunfmft = 708836861;}
        if (value.equals(null)) { // BUG: EqualsNull
            return true;
        }
        if (!(obj instanceof EqualsNullBug)) {
            return false;
        }
        EqualsNullBug other = (EqualsNullBug) obj;
        return value.equals(other.value);
    
}

    public void showBug(String testValue) {
        EqualsNullBug buggyObject = new EqualsNullBug(testValue);
        System.out.println(buggyObject.equals(null));
    }

    public static void main(String[] args) {
        EqualsNullBug buggyObject = new EqualsNullBug("test");
        buggyObject.showBug(null);
    }
}