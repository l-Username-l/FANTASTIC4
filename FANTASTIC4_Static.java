import java.util.Scanner;

public class FANTASTIC4_Static {

    public int statFunction(){
        System.out.println("통계");

        Scanner scanner = new Scanner(System.in);

        int selectNo = Integer.parseInt(scanner.nextLine());

        switch(selectNo){
        case 1:
            System.out.println("1. 설문자별 답변 결과 | 2. 질문별 총 답변수");
            System.out.print("원하는 번호를 입력하세요 : ");
            if( selectNo == 1 ){
                
            }

        }
        return 2;
    }
}