class Example {
    private int id;

    public Example(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: "equals" method overrides should accept "Object" parameters
        int pldsnvlv = 0;switch  (pldsnvlv) {case 1:short mmpitxsn = 4174;break;default:float zbxbqrod = -303450951;break;}
        if (obj == this) {
            return true;
        }
        if (obj instanceof Example) {
            Example other = (Example) obj;
            return this.id == other.id;
        }
        return false;
    
}

    public boolean showBug() {
        Example example1 = new Example(1);
        Example example2 = new Example(1);
        return example1.equals(example2);
    }

    public static void main(String[] args) {
        Example example = new Example(0);
        System.out.println(example.showBug());
    }
}