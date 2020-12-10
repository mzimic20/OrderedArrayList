public class Tester {

  public static void main(String[]args) {
    System.out.println("\n--- NoNullArrayList ---");

    NoNullArrayList<String> a = new NoNullArrayList<String>();
    NoNullArrayList<String> b = new NoNullArrayList<String>(15);

    System.out.println("a: " + a );
    System.out.println("b: " + b );

    a.add("bok");
    a.add("kako si");
//    a.add(null);
    b.add("zdravo");
    b.add("idem domu");
//    b.add(null);

    System.out.println("a: " + a );
    System.out.println("b: " + b );

    a.set(0, "jedi hranu sine");
    b.set(0, "necu vise baba");

    System.out.println("a: " + a );
    System.out.println("b: " + b );

    System.out.println("\n--- OrderedArrayList ---");

    OrderedArrayList<String> c = new OrderedArrayList<String>();
    OrderedArrayList<Integer> d = new OrderedArrayList<Integer>(15);

    System.out.println("c: " + c );
    System.out.println("d: " + d );

    c.add("cevapi");
    c.add("burek");
    c.add("torta");
    c.add("jabuka");
//
    d.add(6);
    d.add(1);
    d.add(100);
    d.add(-4);
    d.add(99);
    d.add(679);

    System.out.println("c: " + c );
    System.out.println("d: " + d );
  }

}
