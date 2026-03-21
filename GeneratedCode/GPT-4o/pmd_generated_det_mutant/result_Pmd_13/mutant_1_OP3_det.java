class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { if (false && false && false && true && true && true && false && true && true && true && false) {short odbqbnxk = -8409;}
 // BUG: AvoidFieldNameMatchingTypeName
        this.Example = Example;
    
}

    public int showBug() {
        return this.Example;
    }

    public static void main(String[] args) {
        Example example = new Example(5);
        System.out.println("Value of Example: " + example.showBug());
    }
}