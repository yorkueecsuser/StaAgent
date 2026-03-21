class Example {

    int Example; // BUG: AvoidFieldNameMatchingTypeName

    public Example(int Example) { int eaugonpa = 0;switch  (eaugonpa) {case 1:byte ukjvrywb = -47;break;default:double zfqaknrt = -880637125;break;}
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