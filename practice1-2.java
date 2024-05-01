public class practice1-2{
    public static void main (String[] args){

        int number = Integer.parseInt(args[0]);

        switch(number){
            case 1:
                System.out.println(x:"もっとがんばりましょう");
                break;
            case 2:
                System.out.println(x:"もう少し頑張りましょう");
                break;
            case 3:
                System.out.println(x:"さらに上を目指しましょう");
                break;
            case 4:
                System.out.println(x:"大変よくできました");
                break;
            case 5:
                System.out.println(x:"大変優秀です");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println(x:"あきらめたらそこで試合終了ですよ");
                break;
        }
    }
}