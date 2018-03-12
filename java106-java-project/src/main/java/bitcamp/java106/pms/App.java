package bitcamp.java106.pms;


import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

// ver 0.6 - team/add 명령을 구현한다.
// ver 0.5 - help 명령을 구현한다.
// ver 0.4 - quit 명령어 입력 시 반복문을 종료한다.
// ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.
// ver 0.2 - 사용자로부터 입력을 받아 출력한다.
// ver 0.1 - 명령 입력 프롬프트를 출력한다. 
public class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[1000];
        int teamIndex = 0;

        while (true) {
            System.out.print("명령> ");
            String input = keyScan.nextLine().toLowerCase();

            if (input.equals("quit")) {
                System.out.println("안녕히 가세요!");
                break;
            } else if (input.equals("help")) {
                System.out.println("[도움말]");
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                System.out.println();
                continue;
            } else if (input.equals("team/add")) {
                System.out.println("[팀 정보 입력]");
                Team team = new Team();

                System.out.print("팀명? ");
                team.name = keyScan.nextLine();

                System.out.print("설명? ");
                team.description = keyScan.nextLine();

                System.out.print("최대인원? ");
                team.maxQty = keyScan.nextInt();
                keyScan.nextLine(); 

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
                teams[teamIndex++] = team;

                //System.out.printf("%s, %s, %d, %s, %s\n", 
                //    team.name, team.description, team.maxQty, team.startDate, team.endDate);
                System.out.println();
                continue;
            }

            System.out.println(input);
        }
        /*
        // 팀 정보를 받을 메모리 준비
        Team[] teams = new Team[5];
        
        int count = 0;
        for (int i = 0; i < teams.length; i++) {
            count++;
            teams[i] = new Team();

            

            if (count == teams.length) { // if (i == teams.length - 1)
                break;
            }

            System.out.print("계속하시겠습니까?(Y/n) ");
            String str = keyScan.nextLine();
            if (str.toLowerCase().equals("n")) {
                break;
            } 
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s, %d명, %s ~ %s\n", 
                teams[i].name, teams[i].maxQty, 
                teams[i].startDate, teams[i].endDate);
        }
        */
    }
}