class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { boolean airpzuno = false;while (airpzuno && true && true && true && false && true && true && true && true && true && false && false) {char qmvttwic = 'a';}
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