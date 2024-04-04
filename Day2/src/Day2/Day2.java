package Day2;
import java.util.Scanner;

public class Day2 {
	public static void Even_Subject(String Name, String ID) {
		Scanner scanner = new Scanner(System.in);
		int K;
		int E;
		int S;
		
		int Total = 0;
		
		System.out.print("나형 응시자 입니다. 한국어 성적을 입력하세요 : ");
		K = scanner.nextInt();
		Total += K;
		
		System.out.print("영어 성적을 입력하세요 : ");
		E = scanner.nextInt();
		Total += E;

		System.out.print("세법 성적을 입력하세요 : ");
		S = scanner.nextInt();
		Total += S;
		
		int Avg = Total/3;
		
		System.out.print("한국어 성적 : " + K + " 점입니다. " + "영어 성적 : " + E + "점입니다. " + "세법 점수 : " + S + "점입니다. ");
		
		if(Avg <=80) {
			System.out.println("평균 점수는 " + Avg + "점으로 실격입니다.");
		}
		else {
			System.out.println("평균 점수는 " +Avg + "점으로 합격입니다!");
		}
		

		
		
		
		
	}
	public static void Odd_Subject(String Name, String ID) {
		Scanner scanner = new Scanner(System.in);
		int CS;   //컴퓨터구조 (정수)
		int DB;   //DB  (정수)
		int SE;   //소프트웨어공학  (숫자, 정수형)
		
		int Total = 0;
		
		System.out.print("가형 응시자 입니다. 컴퓨터 구조 성적을 입력하세요 : ");  //출력
		CS = scanner.nextInt();  //입력받고
		Total += CS; //더해주고
		
		System.out.print("DB 성적을 입력하세요 : ");
		DB = scanner.nextInt();
		Total += DB;
		
		System.out.print("소프트웨어공학 성적을 입력하세요 : ");
		SE = scanner.nextInt();
		Total += SE;
		
		int Avg = Total/3;
		
		System.out.print("컴퓨터 구조 성적 : " + CS + "점입니다. " + "DB 성적 : " + DB + "점입니다. " + "소프트웨어공학 성적 : " + SE + "점입니다. ");
		
		if(Avg <=80) {
			System.out.println("평균 점수는 " + Avg + "점으로 실격입니다.");
		}
		else {
			System.out.println("평균 점수는 " +Avg + "점으로 합격입니다!");
		}
		
		
		
	}
	
	public static void main (String args[]) {
//		int box;
//		box = 1;
//		
//		System.out.println(box+1);
		
		Scanner scanner = new Scanner(System.in);
	
		String Name;  //이름
		String ID;  //응시번호
		
		
		System.out.println("이름, 응시번호, 성적을 차례로 입력하세요. ");
		System.out.print("이름 : ");
		Name = scanner.next();
		System.out.print("응시번호 : ");
		ID = scanner.next();
		
		int ID_num = Integer.valueOf(ID.charAt(ID.length()-1));
		
		
		if(ID_num%2 != 0) {  // 조건문에서 == 좌항과 우항이 같다. / != 같지 않다.
			Odd_Subject(Name, ID);
		}
		else {
			Even_Subject(Name, ID);
		}
	}
}
