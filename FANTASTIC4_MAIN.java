import java.util.Scanner;

public class FANTASTIC4_MAIN {

    public static int P = 1;
    static int S = 2;
    static int Q = 3;

    public static void main(String[] aStrings) {
        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("----------------------------------");
            System.out.println(" P.설문시작 | S.통계 | Q.종료 ");
            System.out.println("-------------------------------------");
            System.out.print("선택) ");
            
            int selectNo = Integer.parseInt(scanner.nextLine());

            if( selectNo == P ){
                FANTASTIC4_Question quest = new FANTASTIC4_Question();
                int Fan = quest.questFunction();
            }  else if (selectNo == S ) {
                FANTASTIC4_Static stat = new FANTASTIC4_Static();
                int Fan = stat.statFunction();
            } else{
                System.out.println("이용해주셔서 감사합니다!");
            }
        }
    return ;
    }
}