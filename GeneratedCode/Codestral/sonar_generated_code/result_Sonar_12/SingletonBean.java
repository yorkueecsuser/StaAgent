// Java Code with Bug

import java.util.ArrayList;
import java.util.List;

class SingletonBean {
    private static SingletonBean instance = null;
    private List<String> data = new ArrayList<>();

    private SingletonBean() {}

    public static SingletonBean getInstance() {
        if (instance == null) {
            instance = new SingletonBean();
        }
        return instance;
    }

    public void addData(String data) {
        this.data.add(data);
    }

    public List<String> getData() {
        return data;
    }
}

class MyConfiguration {
    public SingletonBean singletonBean() {
        return SingletonBean.getInstance();
    }

    public List<String> showBug() {
        SingletonBean bean1 = singletonBean();
        SingletonBean bean2 = singletonBean();

        bean1.addData("Data 1");
        bean2.addData("Data 2");

        return bean1.getData(); // BUG: SingletonBean should not be created multiple times in this context
    }
}