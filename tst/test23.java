// miniJava test program (For CS421P, PSU)
//
// Parameter passing
// 
class Test {
  public static void main(String[] ignore) {
    B b = new B();
    System.out.println(b.go(1, 2, 3));
  }
}

class B {
  public int go(int i, int j, int k) {
    return i + j + k;
  }
}
