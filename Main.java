import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int GCD(int a, int b){
    while( b!= 0 ){
      int r = a%b;
      a=b;
      b=r;
    }
    return a;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int location_subin = Integer.parseInt(st.nextToken());
    int[] abs_location = new int[n];

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    // 1 7 11
    for(int i=0; i<n; i++){
      int stud_location = Integer.parseInt(st2.nextToken());
      abs_location[i] = Math.abs(location_subin-stud_location);

    }
    int first =abs_location[0];

    for(int i=0; i<n; i++){
      first = GCD(first,abs_location[i]);
    }

    System.out.println(first);







  }
}
