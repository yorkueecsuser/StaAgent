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
        int jfycpeow = 0;switch  (jfycpeow) {case 1:char awpeoodc = 'y';break;default:byte mfivgsgw = -107;break;}
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