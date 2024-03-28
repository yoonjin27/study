package day1;

public class Day1 {
	//Static = 객체를 생성하지 않고 사용할 수 있는 메솓 
	/*public static int sum(int n, int m) {  //sum 메소드 
		return (n+m);
	}
	
	public static void main(String args[]) { //메인 메소드
		
		/*
		int a = 0;
		double b =0.5;
		float f= 0.3;
		boolean b = true;
		char c= 'c';
		string S = "abcd";
		
		
		var v = 0;
		var V = 'c';
		*/
		
		/*int a = 5;
		int b = 3;
		
		int s;
		s = sum(a,b);	
		
		//System.out.print(s);   // 단일 출력
		//System.out.println(s); // 개행 포함 출력
	
		char c = 'c';  //->문자
		char d = 'd'; //숫자
		
		System.out.print("문자" + c + d);  //c에서는 출력 x
		*/
	
		
	


	
	
	
	public static double MtoK(int mile) {
    	return mile * 1.6;
	 }
	
	public static double KtoM(int kilo) {
		return kilo / 1.6;
	}
	
	public static double CtoF(int C) {
		return (C * 1.8) + 32;
	}
	
	public static double FtoC(int F) {
		return (F- 32)/1.8;
	}
	
	
	public static void main(String args[]) {
		int mile = 30;
		int kilo = 60;
		int C = 30;
		
		System.out.println("M-> K : " + MtoK(mile));
		System.out.println("K-> M : " + KtoM(kilo));
		System.out.println("C-> F : " + FtoC(C));
		System.out.println("F-> C : " + CtoF(C));
	}
	
	
	
	
}