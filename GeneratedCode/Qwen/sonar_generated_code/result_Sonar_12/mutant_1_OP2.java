import java.lang.Object;

class SingletonBeanConfig {

    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }

    public void showBug() {
        MySingletonBean bean1 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        MySingletonBean bean1Duplicate = bean1; // Mutant: Duplicate assignment of bean1

        MySingletonBean bean2 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        MySingletonBean bean2Duplicate = bean2; // Mutant: Duplicate assignment of bean2

        System.out.println("Bean 1: " + bean1);
        System.out.println("Bean 2: " + bean2);
    }
}

class MySingletonBean {
    // This class represents a Singleton bean
}