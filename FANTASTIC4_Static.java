import java.util.Scanner;

public class FANTASTIC4_Static {

    public int statFunction() {
        System.out.println("통계");

        Scanner scanner = new Scanner(System.in);

        int selectNo = Integer.parseInt(scanner.nextLine());

        switch (selectNo) {
            case 1:
                System.out.println("1. 설문자별 답변 결과 | 2. 질문별 총 답변수");
                System.out.print("원하는 번호를 입력하세요 : ");
                if (selectNo == 1) {
                    System.out.println("\t질문(1)\t질문(2)\t질문(3)\t질문(4)");
                    System.out.println("신우진\t3 \t2 \t4 \t1");
                    System.out.println("정명훈\t1 \t2 \t4 \t3");
                    System.out.println("윤소정\t2 \t1 \t4 \t3");
                    System.out.println("이애연\t4 \t3 \t1 \t2");
                } else {
                    System.out.println("1 : 전혀 아니다, 2번 : 아니다, 3번 : 그렇다, 4번 : 매우 그렇다");
                    System.out.println("\t답(1)\t답(2)\t답(3)\t답(4)");
                    System.out.println("질문(1)\t5\t10\t2\t3");
                    System.out.println("질문(2)\t8\t7\t3\t2");
                    System.out.println("질문(3)\t4\t7\t4\t5");
                    System.out.println("질문(4)\t6\t3\t5\t6");

                }
                return 2;
        }
        return selectNo;
    }
}