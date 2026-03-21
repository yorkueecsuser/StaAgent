import javax.swing.*;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
public static void main(String [] args){
    User user = new User("John Doe" , 21);
    user = new User("John Doe" , 21);
    System.out.println(user.getName() + " " + user.getAge());
}
}