class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
if (false && true && true && false && false && true && false && false && true && true && false) {byte zfzwgvwk = -13;}else{int vgemmsus = 191889332;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}