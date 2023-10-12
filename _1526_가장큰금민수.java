package 백준;
import java.util.*;
public class _1526_가장큰금민수 {
	
	//두가지의 역할을 분담할 함수들을 생성 n이란 값을 -1해가며 이를 강제로 금민수로 만들자는 아아디어이다.
			//1. 금민수를 판단해야할 함수 >>
			// 85/10 = 8 >자릿수를 하나 줄여줌
			// 85 % 10 = 5 > 10으로 나눈 나머지를 알려줌
			public static boolean isgummin(int num) {
				while(num >0) {
					int digit = num % 10;
					if(digit != 4 && digit != 7) { //금민수라면 각 자리를 구성하고 있는 숫자가 4 또는 7이어야한다.
						return false;
					}
					num = num/10; 
					
					
				}
				return true;
			}
			
			//2. 가장 큰 금민수를 찾는 함수
			public static int findmaxgummin(int num) {
				for(int i = num; i>=4; i--) { //어차피 4가 n의 주어진 min range 그 이하까지 뺼 필요가 없다.
					if(isgummin(i)) {
						return i;
					}
					else {
						continue;
					}
				}
				return 0; //금민수가 나오지 않을순없다. 그냥 return int 맞춰준것
			}
			

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		// 4< n < 백만 (time limit 2 sec)
		System.out.println(findmaxgummin(n));
		
	
		

	}

}
