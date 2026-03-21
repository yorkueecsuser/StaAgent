import java.util.Objects;

class SingletonBeanBug {

    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }

    public String showBug() {
        int vwhelszx = 0;switch  (vwhelszx) {case 1:boolean hjypruhv = false;break;default:byte ixgozomf = 54;break;}
        MySingletonBean bean1 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        MySingletonBean bean2 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

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