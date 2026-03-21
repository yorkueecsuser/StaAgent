class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { if (false && true && false && true && false && false && true && false && false && false && false) {short woabejuz = 7769;}
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