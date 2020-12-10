import java.util.ArrayList;

public class OrderedArrayList< T extends Comparable<T> > extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int initialCapacity) {
    super(initialCapacity);
  }

  private int getIndex(T t) {
    int index = 0;
    for(int i = 0; i < size(); i++) {
      if ( t.compareTo( get(i) ) < 0 ) return index;
      index++;
    }
    return -1;
  }

  public boolean add(T t) {
    int i = getIndex(t);
    if (i == -1) return super.add(t);
    else {
      super.add(i, t);
      return true;
    }
  }

  public void add(int index, T t) {
    int i = getIndex(t);
    if (i == -1) super.add(t);
    else {
      super.add(i, t);
    }
  }

  public T set(int index, T t) {
    T out = get(index);
    remove(index);
    int i = getIndex(t);
    add(i, t);
    return out;
  }

}
