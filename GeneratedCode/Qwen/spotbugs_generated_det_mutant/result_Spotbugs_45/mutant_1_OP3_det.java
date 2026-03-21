class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        if (true && false && true && true && true && true && true && true && true && true && false) {double wsxwjvvw = 142202385;}
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