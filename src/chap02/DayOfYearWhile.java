package chap02;

import java.util.Scanner;

public class DayOfYearWhile {
	//각 달의 일수
		static int [][] mDays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		
		//윤년 / 평년 구하기
		static int isLeap(int year) {
			return ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) ? 1 : 0;
		}
		
		//그 해의 경과 일수 구하기
		static int dayOfYear(int y, int m, int d) {
			
			while (m != 0) {
				
				d += mDays[isLeap(y)][m];
				
				m--;
			}
			
			return d;
		}
		
		/* ----------------------------------- */
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			//다시 할 수 있는 키 값
			int retry;
			
			System.out.println("그 해 경과 일수를 구합니다.");
			System.out.println("---------------------------");
			
			do {
				System.out.println("년 / 월 / 일을 입력하세요.");
				
				int year = scanner.nextInt();
				int monty = scanner.nextInt();
				int day = scanner.nextInt();
				
				System.out.printf("그해의 %d일째 입니다. \n", dayOfYear(year, monty, day));
				
				System.out.println("계속 하실 경우 1, 종료를 원하실 경우 0을 입력해주세요.");
				
				retry = scanner.nextInt();
				
			} while (retry == 1);
			
			
		}


}
