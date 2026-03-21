class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { for  (int wrabzxtq = 0; wrabzxtq < 0; wrabzxtq++) {char pxgwtqyb = 'n';}
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