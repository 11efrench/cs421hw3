// miniJava test program (For CS421P, PSU)
//
// Param and local var declarations
// 
class Test {
  public int foo(int i, int j) {
    return i + j;
  }
  public static void main(String[] ignore) {
    Test x = new Test();
    boolean b;
    int i;
    int j;
    b = true;
    i = x.foo(1, 2);
    j = 2 * 3;
    System.out.println(b);
    System.out.println(i);
    System.out.println(j);
  }
}
