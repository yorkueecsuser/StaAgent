class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        int cqbqnsgw = 0;switch  (cqbqnsgw) {case 1:float sizhacji = 784438989;break;default:long acvbvltt = 654362098;break;}
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