import java.lang.Object;

class SingletonBeanConfig {

    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }

    public void showBug() {
        MySingletonBean bean1 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        MySingletonBean bean2 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

        System.out.println("Bean 1: " + bean1);
        System.out.println("Bean 2: " + bean2);

        // Mutant code
        MySingletonBean x = mySingletonBean(); // Renamed bean1 to x
        MySingletonBean y = mySingletonBean(); // Renamed bean2 to y

        System.out.println("Mutant Bean 1: " + x);
        System.out.println("Mutant Bean 2: " + y);
    }
}

class MySingletonBean {
    // This class represents a Singleton bean
}