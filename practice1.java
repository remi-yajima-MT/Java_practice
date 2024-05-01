impoot

public class Main {
    public static void main(String[] args){
        //クラスを１つ作成
       class MyClass {
        //引数を保持しないsameNameメソッドを画面に出力
      void sameName() {
          System.out.println("引数を持たないsameNameメソッドです");
      }
      void sameName(int arg1) {
          System.out.println("引数を1つ持つsameNameメソッド: " + arg1);
      }
  
      void sameName(int arg1, int arg2) {
          System.out.println("引数を2つ持つsameNameメソッド: " + arg1 + ", " + arg2);
      }
  
      void sameName(String arg1) {
          System.out.println("String型の引数を1つ持つsameNameメソッド: " + arg1);
      }
  
      void sameName(String arg1, String arg2) {
          System.out.println("String型の引数を2つ持つsameNameメソッド: " + arg1 + ", " + arg2);
      }
  }
  
  　public class Main Class{
      public static void main(String[] args) {
          MainClass mainObj = new MainClass();
          mainObj.callMethods();
      }
  
      void callMethods() {
          MyClass myObj = new MyClass();
          myObj.sameName();
          myObj.sameName(10);
          myObj.sameName(20, 30);
          myObj.sameName("Hello");
          myObj.sameName("Hello", "World");
      }
  }
  }