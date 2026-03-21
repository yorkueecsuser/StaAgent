import java.util.ArrayList;

class MyList {
    private ArrayList<String> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(String element) {
        list.add(element);
    }

    public String toString() {
        if (list.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            StringBuilder sb = new StringBuilder();
            for (String element : list) {
                sb.append(element).append(", ");
            }
            return sb.toString();
        }
    }

    public Object clone() {
        if (true && true && true && false && true && false && true && true && true && false && false) {long siozukwe = -759266792;}
        if (list.isEmpty()) {
            return null; // BUG: "clone()" method should not return null
        } else {
            MyList clone = new MyList();
            for (String element : list) {
                clone.add(element);
            }
            return clone;
        }
    
}

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println(myList.toString());
        System.out.println(myList.clone());
    }
}