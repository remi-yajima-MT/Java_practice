public class Practiceprpcess3 {
    public class Question3 {
            public static void main(String[] args) {
               
                String s1 = "SeattleConsulting";
                String s2 = "SeattleConsulting";
                String s3 = "Seattle";                      
                String s4 = new String("SeattleConsulting");
                s3 = s3 + "Consulting";
               
                if(s1 == s2) {
                    System.out.println("s1とs2は等しいです。(==比較)");
                }
                if(s1 == s3) {
                    System.out.println("s1とs3は等しいです。(==比較)");
                }
                if(s1 == s4) {
                    System.out.println("s1とs4は等しいです。(==比較)");
                }
                if(s1.equals(s2)) {
                    System.out.println("s1とs2は等しいです。(.equals比較)");
                }
                if(s1.equals(s3)) {
                    System.out.println("s1とs3は等しいです。(.equals比較)");
                }
                if(s1.equals(s4)) {
                    System.out.println("s1とs4は等しいです。(.equals比較)");
                }
            }
        }
}
 
/**
 //回答
* 1、同じ文字列、オブジェクトを参照しているため。
* 同じ文字列が書かれた場合、同じインスタンスを共有する
* それにより、両方のオブジェクトは等しく、演算子＝＝ではTRUEとなる。
* equal()では文字列の内容を比較しておりTRUEとなる。
 
* 2、equal()では文字列の内容を比較していることからTRUEとなる。
* だが、s3は文字列の結合のため、参照しているオブジェクトが異なる。
* それにより演算子＝＝ではFALSEとなる。
 
* 3、equal()では文字列の内容を比較していることからTRUEである。
* しかし、s4はnew String()で新しいオブジェクトを作っている。
* 結果、s1とs4は異なるオブジェクトを参照しているため、演算子＝＝ではFALSEとなる。
 
*/