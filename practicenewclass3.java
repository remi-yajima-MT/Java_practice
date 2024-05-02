public class practicenewclass3 {
   
    int twice(int num) {
            num = num * 2;
            return num;
    }
    int twice(int[] array) {
            array[0] = array[0] * 2;
            return array[0];
    }

    public static void main(String[] args) {
   
        int num = 10;
        int[] array = {10,30};
   
        Question3 question3 = new Question3();
   
        System.out.println("twiceメソッド実行前のnum:" + num);
        System.out.println("twiceメソッド実行前のarray[0]:" + array[0]);
   
        System.out.println("twiceメソッドの戻り値:" + question3.twice(num));
        System.out.println("twiceメソッドの戻り値:" + question3.twice(array));
   
        System.out.println("twiceメソッド実行後のnum:" + num);
        System.out.println("twiceメソッド実行後のarray[0]:" + array[0]);    
    }
}

/*
* int型の変数numとint型の配列arrayでは値渡しと参照Javaの動作が違うため実行後の値買いが違う。
* 最初のtwiceメソッドではint型の変数numを受け取り2倍にして返しているが
* これは値渡しでありnumの変数を変更しても呼び出し元の値は変わらない
* 一方2番目のtwiceメソッドではint型の配列arrayを受け取り配列の要素を変更しているため
* 参照渡しとなり要素が2倍され取得元に返される。
* 以上の違いがあるため配列arrayの実行後の値のみ変わる。
*
*/
