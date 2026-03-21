class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { if (false && false && true && false && true && false && true && false && false && false && false) {short ozapompg = 2098;}else{short derphovb = -1547;}
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