package ����;
import java.util.*;
public class _1526_����ū�ݹμ� {
	
	//�ΰ����� ������ �д��� �Լ����� ���� n�̶� ���� -1�ذ��� �̸� ������ �ݹμ��� �����ڴ� �ƾƵ���̴�.
			//1. �ݹμ��� �Ǵ��ؾ��� �Լ� >>
			// 85/10 = 8 >�ڸ����� �ϳ� �ٿ���
			// 85 % 10 = 5 > 10���� ���� �������� �˷���
			public static boolean isgummin(int num) {
				while(num >0) {
					int digit = num % 10;
					if(digit != 4 && digit != 7) { //�ݹμ���� �� �ڸ��� �����ϰ� �ִ� ���ڰ� 4 �Ǵ� 7�̾���Ѵ�.
						return false;
					}
					num = num/10; 
					
					
				}
				return true;
			}
			
			//2. ���� ū �ݹμ��� ã�� �Լ�
			public static int findmaxgummin(int num) {
				for(int i = num; i>=4; i--) { //������ 4�� n�� �־��� min range �� ���ϱ��� �E �ʿ䰡 ����.
					if(isgummin(i)) {
						return i;
					}
					else {
						continue;
					}
				}
				return 0; //�ݹμ��� ������ ����������. �׳� return int �����ذ�
			}
			

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		// 4< n < �鸸 (time limit 2 sec)
		System.out.println(findmaxgummin(n));
		
	
		

	}

}
