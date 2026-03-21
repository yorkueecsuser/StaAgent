class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { int mzhlmcrb = 0;switch  (mzhlmcrb) {case 1:double zapphjtx = 647138531;break;default:String kzpsqhks = "gdumkiqs";break;}
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