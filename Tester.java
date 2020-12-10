public class Tester {

  public static void main(String[]args) {
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    NoNullArrayList<String> b = new NoNullArrayList<String>(15);

    System.out.println("a: " + a );
    System.out.println("b: " + b );

    a.add("bok");
    a.add("kako si");
//    a.add(null);
    a.set(0, "jedi hranu sine");
    b.add("zdravo");
    b.add("idem domu");
//    b.add(null);
    b.set(0, "necu vise baba");

    System.out.println("a: " + a );
    System.out.println("b: " + b );
  }

}
