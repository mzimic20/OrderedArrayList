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
    for(T t : n) {
      if ( t.compareTo(n) > 0 ) return n;
    }
    return -1;
  }

  public boolean add(T t) {
    int index = getIndex(t);
    if (index == -1) return super.add(t);
    else return super.add(index, t);
  }

  public void add(int index, T t) {
    if index = getIndex(t);
    if (index == -1) super.add(t);
    else super.add(t);
  }

}
