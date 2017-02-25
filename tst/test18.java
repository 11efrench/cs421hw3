// miniJava test program (For CS421P, PSU)
//
// Method calls
//
class Test {
  public static void main(String[] ignore) {
    A a = new A();
    System.out.println(a.go());
  }
}

class B {
  public int back(int a) {
    return a;
  }
}

class A extends B {
  public int go() {
    return this.back(2);
  }
}
