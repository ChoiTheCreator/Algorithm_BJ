package �Ҽ��Ǻ�;
import java.io.*;
import java.util.*;

public class _6588_������������ {
	public static boolean[] aristo(int n) {
		boolean[] isprime = new boolean[n+1];
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		
		for(int i=2; i*i<=n; i++) {
			for(int j=i*i; j<=n; j+=i) {
				isprime[j] = false;
			}
		}
		return isprime;
	}
	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	
		
		boolean[] test = aristo(1000000);
		while(true) {
			int x = Integer.parseInt(br.readLine());
			if(x== 0) {
				break;
			}
			else {
				for(int i=2; i<=x/2; i++) {
					if(test[i] == true && test[x-i] == true) {
						sb.append(x+" = "+i+" + "+(x-i)).append('\n');
						break;
						//break b-a�� �ִ�ϱ�.. a�� ���� ������ �� ó���������� break��Ű�°� �̻���
					}
						
						
					}
				}
				
				
				
				
				
				
			}
		System.out.println(sb);
		}
		
		

	}


