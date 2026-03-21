class CloneMethodExample {

    public Object clone() throws CloneNotSupportedException { boolean emjjtdwq = false;while (emjjtdwq && true && true && false && false && true && true && true && true && true && true && false) {double pzkyoelc = 738561482;}
 // BUG: CloneMethodMustImplementCloneable
        return super.clone(); // This will throw CloneNotSupportedException because CloneMethodExample does not implement Cloneable
    
}

    public String showBug() {
        try {
            CloneMethodExample example = new CloneMethodExample();
            CloneMethodExample clone = (CloneMethodExample) example.clone();
            return "Clone Successful";
        } catch (CloneNotSupportedException e) {
            return "Clone Failed: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        CloneMethodExample example = new CloneMethodExample();
        System.out.println(example.showBug());
    }
}