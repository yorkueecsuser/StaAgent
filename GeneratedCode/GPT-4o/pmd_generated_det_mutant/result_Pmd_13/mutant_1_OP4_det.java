class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { if (false && false && false && true && false && true && true && true && false && false && false) {short qkhpauqm = -4677;}else{double zfonmmrr = -924925604;}
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