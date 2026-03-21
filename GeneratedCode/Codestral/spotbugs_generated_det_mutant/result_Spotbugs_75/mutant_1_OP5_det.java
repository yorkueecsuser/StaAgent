class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
int kcsqzxfz = 0;switch  (kcsqzxfz) {case 1:String exosmmlw = "kxjgvvis";break;default:double stjapmcq = 975317884;break;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}