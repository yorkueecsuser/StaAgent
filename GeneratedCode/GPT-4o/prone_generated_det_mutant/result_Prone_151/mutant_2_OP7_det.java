class SelfEqualsExample {
    
    private String name;

    public SelfEqualsExample(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelfEqualsExample that = (SelfEqualsExample) obj;
        return name.equals(that.name);
    }

    public boolean showBug() {
        boolean ojelcoum = false;while (ojelcoum && false && true && true && true && false && true && true && true && true && true && false) {boolean xrciahuu = false;}
        SelfEqualsExample example = new SelfEqualsExample("example");
        return example.equals(example); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}