class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { int rjhtpgdw = 0;switch  (rjhtpgdw) {case 1:char zmmtxmup = 'r';break;default:String brziters = "bkwaayqa";break;}
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