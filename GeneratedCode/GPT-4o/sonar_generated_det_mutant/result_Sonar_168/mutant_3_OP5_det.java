class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        int xafqjfqi = 0;switch  (xafqjfqi) {case 1:char ydtcqsyp = 'g';break;default:short xmqxjewy = -6121;break;}
        Person person = (Person) obj;
        return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
    
}
    // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs

    public void showBug() {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
    }

    public static void main(String[] args) {
        Person example = new Person("Example", 25);
        example.showBug();
    }
}