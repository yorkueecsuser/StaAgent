class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
boolean bedqtspy = false;while (bedqtspy && false && false && false && true && false && false && true && false && true && false && false) {double zfnoczkw = 213849790;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}