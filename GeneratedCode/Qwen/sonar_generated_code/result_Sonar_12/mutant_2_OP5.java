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

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is an unreachable case.");
                break;
            default:
                System.out.println("This is also unreachable.");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}

class MySingletonBean {
    // This class represents a Singleton bean
}