class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        int azrjkxhr = 0;switch  (azrjkxhr) {case 1:short vwehhqry = -7071;break;default:boolean fwakmync = false;break;}
        this.nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    
}

    public String showBug() {
        return nullableField; // This will always return null due to the bug
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of nullableField is: " + example.showBug());
    }
}