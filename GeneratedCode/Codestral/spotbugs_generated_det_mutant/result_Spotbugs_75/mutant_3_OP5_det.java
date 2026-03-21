class EqualsNullBug {
    private String message;

    public EqualsNullBug(String message) {
        this.message = message;
    }

    public boolean equals(Object obj) {
int onptvqss = 0;switch  (onptvqss) {case 1:double kjokdwnj = 983305558;break;default:double bsexoiuy = 856026768;break;}

        return message.equals(obj); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public boolean showBug() {
        return this.equals(null);
    }
}