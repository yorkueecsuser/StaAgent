class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        int tyryahok = 0;switch  (tyryahok) {case 1:char tttqxayv = 'x';break;default:String egcuvnwo = "kvkplhyq";break;}
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    
}

    public String getValue() {
        return value;
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
    }
}