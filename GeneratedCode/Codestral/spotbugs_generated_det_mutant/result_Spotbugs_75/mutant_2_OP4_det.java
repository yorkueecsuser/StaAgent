class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
if (false && true && true && true && false && true && true && true && true && false && false) {double hwdijktu = -770431246;}else{byte cukzhlwg = 83;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}