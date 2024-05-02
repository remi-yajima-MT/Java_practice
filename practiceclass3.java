public class practiceclass3 {
    public static void main(String[] args) {
        // Employee2クラスのインスタンス化とメソッド呼び出し
        Employee2 employee1 = new Employee2();
        employee1.printName();
 
        Employee2 employee2 = new Employee2("Pepper");
        employee2.printName();
 
        // 社員人数を設定し、社員人数を出力するクラスメソッドを呼び出す
        Employee2.printEmployeeCount();
    }
}
class Employee2 {
    //private：不用意に外部からのアクセスを許さず、外部から決められたメソッドからのみアクセスすること
    private String name;
    private static int employeeCount = 0; // 社員の人数を格納するクラス変数
 
    // 引数無しのコンストラクタ
    //コンストラクタ：クラスのインタスタンス生成時に実行されるもの
    public Employee2() {
        this.name = "匿名希望";
        employeeCount++; // 社員の人数を1つずつ足していく
    }
 
    // 文字列を引数にもつコンストラクタ
    public Employee2(String name) {
        // 文字列が11文字以上の場合は10文字までに切り捨てる
        if (name.length() > 10) {
            this.name = new StringBuilder(name.substring(0, 10)).toString();
        } else {
            this.name = name;
        }
        employeeCount++; // 社員の人数を増加
    }
 
    // 名前を出力するメソッド
    //voidは戻り値なしを表す
    public void printName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + this.name + "です。");
    }
 
    // 社員の人数を出力するクラスメソッド
    //インスタンス化する時に使う
    public static void printEmployeeCount() {
        System.out.println("社員は全部で" + employeeCount + "人です。");
    }
}