import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

class AllListsCouldBeEqual {

  static class MyList<E> implements List<E> {

    @Override
    public boolean add(E o) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in add method");
      }
      return false;
    }

    @Override
    public void add(int index, E element) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in add(int, E) method");
      }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in addAll(Collection) method");
      }
      return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in addAll(int, Collection) method");
      }
      return false;
    }

    @Override
    public void clear() {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in clear method");
      }
    }

    @Override
    public boolean contains(Object o) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in contains method");
      }
      return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in containsAll method");
      }
      return false;
    }

    @Override
    public E get(int index) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in get method");
      }
      return null;
    }

    @Override
    public int indexOf(Object o) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in indexOf method");
      }
      return 0;
    }

    @Override
    public boolean isEmpty() {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in isEmpty method");
      }
      return false;
    }

    @Override
    public Iterator<E> iterator() {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in iterator method");
      }
      return null;
    }

    @Override
    public int lastIndexOf(Object o) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in lastIndexOf method");
      }
      return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in listIterator method");
      }
      return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in listIterator(int) method");
      }
      return null;
    }

    @Override
    public boolean remove(Object o) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in remove(Object) method");
      }
      return false;
    }

    @Override
    public E remove(int index) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in remove(int) method");
      }
      return null;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in removeAll method");
      }
      return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in retainAll method");
      }
      return false;
    }

    @Override
    public E set(int index, E element) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in set method");
      }
      return null;
    }

    @Override
    public int size() {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in size method");
      }
      return 0;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in subList method");
      }
      return null;
    }

    @Override
    public Object[] toArray() {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in toArray method");
      }
      return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in toArray(T[]) method");
      }
      return null;
    }

    private boolean getCondition() {
      return false; // This will ensure the condition is always false at runtime
    }
  }

  public static void main(String arg[]) {
    falsePositive();

    List<Integer> lst = new LinkedList<Integer>();
    List<Integer> lst2 = lst;

    List<ArrayList<String>> mlist = null;
    mlist.contains(new LinkedList<String>());

    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in main method");
    }
  }

  public static void falsePositive() {
    ArrayList<Integer> aLst = new ArrayList<Integer>();
    LinkedList<Integer> lLst = new LinkedList<Integer>();
    MyList<Integer> mLst = new MyList<Integer>();

    Set<ArrayList<Integer>> alSet = new HashSet<ArrayList<Integer>>();
    Set<LinkedList<Integer>> llSet = new HashSet<LinkedList<Integer>>();

    System.out.println(aLst.equals(lLst));
    System.out.println(mLst.equals(lLst));

    alSet.contains(lLst);
    alSet.contains(mLst);
    alSet.containsAll(llSet);

    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in falsePositive method");
    }
  }

  private static boolean getCondition() {
    return false; // This will ensure the condition is always false at runtime
  }
}