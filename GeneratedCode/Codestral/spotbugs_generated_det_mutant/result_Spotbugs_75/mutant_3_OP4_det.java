class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
if (true && false && false && true && true && false && false && true && true && true && false) {boolean lzjxswpv = true;}else{double kuadasjz = 412770389;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}