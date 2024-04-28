package hw2;

public class hw2 {

//	public static void main(String[] args) {
//
//		System.out.println("一：使用for迴圈 + while迴圈" + "\n");
//		for(int i=1;i<=9;i++) {
//			int j=1;
//			while(j<=9) {
//			System.out.print(i+"*"+j+" ="+i*j+"\t");
//			j++; }
//			System.out.println();
//			}
//		System.out.println("–––––––––––––––––––––––––––––––––––––––––––-");
//		System.out.println("二：使用for迴圈 + do while迴圈" + "\n");
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + " =" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//		}
//		System.out.println("–––––––––––––––––––––––––––––––––––––––––––-");
//		System.out.println("三：使用while迴圈 + do while迴圈" + "\n");
//		int i = 1;
//		while (i <= 9) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + " =" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//			i++;
//		}
//	}
	public static void main(String[] args) {
		System.out.println("請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)");

		int i, sum1=0;
		for (i = 2; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1～1000的偶數和=" + sum1);
		System.out.println("=====================");

		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)");

		int m,sum2=1;
		for (m = 1; m <= 10; m++) {
			sum2*= m;
		}
		System.out.println("1～10的連乘積=" + sum2);
		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)");
		int n= 1;
		int sum3=1;
		while(sum3<=10) {
			n*=sum3;
			sum3++;
		}
			System.out.println("1～10的連乘積=" + n);
			System.out.println("=====================");
			System.out.println("請設計一隻Java程式，輸出結果為以下1 4 9 16 25 36 49 64 81 100");
//			zzzzzz
	}
}