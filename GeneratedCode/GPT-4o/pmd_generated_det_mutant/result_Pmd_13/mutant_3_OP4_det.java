class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { if (false && false && false && true && true && false && false && false && true && false && false) {char jaikysoh = 'r';}else{boolean apivdbvt = true;}
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