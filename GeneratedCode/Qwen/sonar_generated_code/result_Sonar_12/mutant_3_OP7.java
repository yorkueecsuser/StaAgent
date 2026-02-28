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

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
        }
    }

    private boolean getCondition() {
        return false;
    }
}

class MySingletonBean {
    // This class represents a Singleton bean
}