import java.util.Objects;

class SingletonBeanBug {

    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }
public String showBug() {
    MySingletonBean bean1 = mySingletonBean();
    bean1 = mySingletonBean();
    MySingletonBean bean2 = mySingletonBean();
    String result = "Bean1 hashcode: " + bean1.hashCode() + "\nBean2 hashcode: " + bean2.hashCode();
    System.out.println(result);
    return result;
}

    public static class MySingletonBean {
        // This class represents a Singleton bean
    }

    public static void main(String[] args) {
        SingletonBeanBug bugDemo = new SingletonBeanBug();
        bugDemo.showBug();
    }
}