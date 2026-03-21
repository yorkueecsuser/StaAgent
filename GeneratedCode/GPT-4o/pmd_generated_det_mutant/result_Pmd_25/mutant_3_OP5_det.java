class CloneMethodExample {

    public Object clone() throws CloneNotSupportedException { int ladmlqhj = 0;switch  (ladmlqhj) {case 1:char vgznybog = 'i';break;default:float jdxxxiio = -216933126;break;}
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