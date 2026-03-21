class BuggyEqualsMethod {

    private String name;

    public BuggyEqualsMethod(String name) {
        if (true && false && true && false && true && false && false && false && false && true && false) {float ojmygfcn = -150625047;}else{short pnitriqy = 941;}
        this.name = name;
    
}

    // BUG: "equals" method overrides should accept "Object" parameters
    public boolean equals(String name) {
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBug(BuggyEqualsMethod otherObject) {
        System.out.println(this.equals(otherObject)); // This will not compile because equals expects Object and not String
    }

    public static void main(String[] args) {
        BuggyEqualsMethod obj1 = new BuggyEqualsMethod("Bug");
        BuggyEqualsMethod obj2 = new BuggyEqualsMethod("Bug");
        obj1.showBug(obj2);
    }
}