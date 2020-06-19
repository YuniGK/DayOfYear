package chap02;

import java.util.Scanner;

public class DayOfYearWhile {
	//�� ���� �ϼ�
		static int [][] mDays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		
		//���� / ��� ���ϱ�
		static int isLeap(int year) {
			return ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) ? 1 : 0;
		}
		
		//�� ���� ��� �ϼ� ���ϱ�
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
			
			//�ٽ� �� �� �ִ� Ű ��
			int retry;
			
			System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
			System.out.println("---------------------------");
			
			do {
				System.out.println("�� / �� / ���� �Է��ϼ���.");
				
				int year = scanner.nextInt();
				int monty = scanner.nextInt();
				int day = scanner.nextInt();
				
				System.out.printf("������ %d��° �Դϴ�. \n", dayOfYear(year, monty, day));
				
				System.out.println("��� �Ͻ� ��� 1, ���Ḧ ���Ͻ� ��� 0�� �Է����ּ���.");
				
				retry = scanner.nextInt();
				
			} while (retry == 1);
			
			
		}


}
