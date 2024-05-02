/* 
//CapsulationPracticeクラスを作成
class CapsulationPractice{
    privete int privateData変数を定義
private int privateData = 100;
}
 
// 同じファイル内にメインメソッドを持つクラスを作成
public class Main {
    // メインメソッド
    public static void main(String[] args) {
        // CapsulationPracticeクラスのインスタンスを生成
        CapsulationPractice obj = new CapsulationPractice();
        // privateDataを標準出力に出力
        System.out.println(obj.privateData);
    }
}
 
★コンパイルエラー発生を確認
 privateメソッドはクラス内のみで使用可能なため、mainメソッドからアクセスすることはできない。
*/




//CapsulationPracticeクラスを作成
class CapsulationPractice {
    //privateData変数を定義
    private int privateData = 100;
 
    // privateDataを返すゲッターメソッド
    public int getPrivateData() {
        return privateData;
    }
 
    // privateDataに値をセットするセッターメソッド
    public void setPrivateData(int newData) {
        privateData = newData;
    }
}
 
public class practiceclass4 {
    public static void main(String[] args) {
        CapsulationPractice obj = new CapsulationPractice();
        // privateDataに200をセット
        obj.setPrivateData(200);
        // privateDataを標準出力に出力
        System.out.println("CapsulationData:" + obj.getPrivateData());
    }
}