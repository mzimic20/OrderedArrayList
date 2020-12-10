import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int initialCapacity) {
    super(initialCapacity);
  }

  public boolean add(T t) {
      if (t == null) throw new IllegalArgumentException("IllegalArgumentException: E for add(E) cannot be null");
      else return super.add(t);
  }

  public void add(int index, T t) {
    if (t == null) throw new IllegalArgumentException("IllegalArgumentException: E for add(index,E) cannot be null");
    else super.add(index, t);
  }

  public T set(int index, T t) {
    if (t == null) throw new IllegalArgumentException("IllegalArgumentException: E for set(index,E) cannot be null");
    else return super.set(index, t);
  }

}
