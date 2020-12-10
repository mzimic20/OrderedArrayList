public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    data = new String[10];
    size = 0;
  }

  public NoNullArrayList(int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
  }

  public void add(T t) {
      if (t == null) throw new IllegalArgumentException("IllegalArgumentException: " + t + " cannot be null");
      else add(t);
  }

  public void add(int index, T t) {
    if (t == null) throw new IllegalArgumentException("IllegalArgumentException: " + t + " cannot be null");
    else add(index, t);
  }

  public void set(int index, T t) {
    if (t == null) throw new IllegalArgumentException("IllegalArgumentException: " + t + " cannot be null");
    else set(index, t);
  }

}
