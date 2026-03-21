class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
boolean hpnrqxuj = false;while (hpnrqxuj && false && false && true && false && true && false && true && true && false && false && false) {short yaqmsxoz = 1363;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}