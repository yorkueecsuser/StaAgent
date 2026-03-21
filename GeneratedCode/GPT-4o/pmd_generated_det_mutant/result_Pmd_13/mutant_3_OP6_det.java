class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { for  (int evdgbrzb = 0; evdgbrzb < 0; evdgbrzb++) {short msjmpgyy = -8647;}
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