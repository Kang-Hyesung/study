import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;			// 입력받을 숫자
		n = Integer.parseInt(br.readLine());
		int sum = 0;		// 누적합
		
		for(int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println(sum);
		}
	}

