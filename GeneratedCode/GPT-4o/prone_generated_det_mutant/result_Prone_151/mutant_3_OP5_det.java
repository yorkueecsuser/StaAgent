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
        int fpxpftgn = 0;switch  (fpxpftgn) {case 1:char rlvykoys = 'b';break;default:short raujylhc = 3058;break;}
        SelfEqualsExample example = new SelfEqualsExample("example");
        return example.equals(example); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}