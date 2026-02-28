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

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is an unreachable switch case.");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime but always returns false
    }
}

class MySingletonBean {
    // This class represents a Singleton bean
}