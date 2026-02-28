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
      return false;
    }

    @Override
    public void add(int index, E element) {
      // TODO Auto-generated method stub

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public void clear() {
      // TODO Auto-generated method stub

    }

    @Override
    public boolean contains(Object o) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public E get(int index) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public int indexOf(Object o) {
      // TODO Auto-generated method stub
      return 0;
    }

    @Override
    public boolean isEmpty() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public Iterator<E> iterator() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public int lastIndexOf(Object o) {
      // TODO Auto-generated method stub
      return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public boolean remove(Object o) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public E remove(int index) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public E set(int index, E element) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public int size() {
      // TODO Auto-generated method stub
      return 0;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public Object[] toArray() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
      // TODO Auto-generated method stub
      return null;
    }
  }

  public static void main(String arg[]) {
    falsePositive();

    List<Integer> lst = new LinkedList<Integer>();
    List<Integer> lst2 = lst;
    List<Integer> lst2Copy = lst; // Duplicate assignment

    List<ArrayList<String>> mlist = null;
    mlist.contains(new LinkedList<String>());
    List<ArrayList<String>> mlistCopy = null; // Duplicate assignment
  }

  public static void falsePositive() {
    ArrayList<Integer> aLst = new ArrayList<Integer>();
    ArrayList<Integer> aLstCopy = new ArrayList<Integer>(); // Duplicate assignment
    LinkedList<Integer> lLst = new LinkedList<Integer>();
    LinkedList<Integer> lLstCopy = new LinkedList<Integer>(); // Duplicate assignment
    MyList<Integer> mLst = new MyList<Integer>();
    MyList<Integer> mLstCopy = new MyList<Integer>(); // Duplicate assignment

    Set<ArrayList<Integer>> alSet = new HashSet<ArrayList<Integer>>();
    Set<ArrayList<Integer>> alSetCopy = new HashSet<ArrayList<Integer>>(); // Duplicate assignment
    Set<LinkedList<Integer>> llSet = new HashSet<LinkedList<Integer>>();
    Set<LinkedList<Integer>> llSetCopy = new HashSet<LinkedList<Integer>>(); // Duplicate assignment

    System.out.println(aLst.equals(lLst));
    System.out.println(aLst.equals(lLst)); // Duplicate assignment
    System.out.println(mLst.equals(lLst));
    System.out.println(mLst.equals(lLst)); // Duplicate assignment

    alSet.contains(lLst);
    alSet.contains(lLst); // Duplicate assignment
    alSet.contains(mLst);
    alSet.contains(mLst); // Duplicate assignment
    alSet.containsAll(llSet);
    alSet.containsAll(llSet); // Duplicate assignment
  }
}