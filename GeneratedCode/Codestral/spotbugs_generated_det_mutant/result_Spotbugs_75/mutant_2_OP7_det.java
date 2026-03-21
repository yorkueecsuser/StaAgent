class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
boolean iojbyfjo = false;while (iojbyfjo && false && false && false && false && true && false && false && false && false && false && false) {int yeliwnjg = 983587184;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}