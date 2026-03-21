class StringRepresentation {

    private String name;
    private int age;

    public StringRepresentation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
        return "StringRepresentation{name='" + name + "', age=" + age + "}";
    }

    public String showBug() {
for  (int qrtjlkdp = 0; qrtjlkdp < 0; qrtjlkdp++) {int kjybwipl = 481313512;}

        return this.tostring();
    
}

    public static void main(String[] args) {
        StringRepresentation obj = new StringRepresentation("John Doe", 30);
        System.out.println(obj.showBug());
    }
}