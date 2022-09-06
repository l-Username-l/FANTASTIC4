// import java.sql.Connection;
// import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FANTASTIC4_Static {

    String QUERY4 = "SELECT NAME_NO, SURV_NO, ANS_NO FROM result";
    Statement stmt1;
    ResultSet rsTable;
    String name;

    public void statFunction(String usr_name) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("1. 설문자별 답변 결과 | 2. 질문별 총 답변수");
        System.out.print("원하는 번호를 입력하세요 : ");
        int selectNo = Integer.parseInt(scan.nextLine());
        name = usr_name;
    
        try {
            // 'result' table에 연동
            FANTASTIC_MySQL_Connect connect = new FANTASTIC_MySQL_Connect();
            stmt1 = connect.SQL_connect();

            // Tables 연동
            //QUERY4 = "select count(*) from result";
            //ResultSet r = stmt1.executeQuery(QUERY4);
            //while(){
                
            switch (selectNo) {
                case 1:
                    System.out.println("----- 설문자별 답변 결과 -----");
                    for (int j = 1; j < 5; j++){
                        QUERY4 = "select COUNT(ANS_NO) from result where name_no "+
                        "in (select DISTINCT name_no from name_no where NAME = " + name +" "+
                        "and surv_no = "+ j +" ";
                        ResultSet r = stmt1.executeQuery(QUERY4);
                        System.out.println("총"+j+"번 항의 갯수: "+ r);

                    }
                    
                    break;
    
                case 2:
                    for (int j = 1; j < 5; j++){
                        QUERY4 = "select COUNT(DISTINCT name_no) from result "+
                        "where 1 = 1 "+
                        "and ans_no = "+ j + " ";
                        ResultSet r = stmt1.executeQuery(QUERY4);
                        System.out.println("총"+j+"번 항을 선택한 명 수: "+ r);

                    }
                    break;
            }
        }catch(SQLException e){
                System.out.println("번호를 다시 입력하세요.");
                selectNo = Integer.parseInt(scan.nextLine());
                
            }
        //} //return selectNo;
    }
}