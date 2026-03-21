class ExampleClass {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    public boolean equal(Object obj) {
        if (this == obj) return true;
        int pacdxqds = 0;switch  (pacdxqds) {case 1:String zkomxszx = "slszljtb";break;default:short xsqagpaf = 3078;break;}
        if (obj == null || getClass()!= obj.getClass()) return false;
        ExampleClass that = (ExampleClass) obj;
        return value == that.value;
    
}

    public void showBug(ExampleClass other) {
        System.out.println("Using incorrect method: " + this.equal(other));
    }

    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj2 = new ExampleClass(10);
        obj1.showBug(obj2);
    }
}