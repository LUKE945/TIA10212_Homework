package hw1;

public class hw1 {

	public static void main(String[] args) {

// 請設計一隻Java程式，計算12，6這兩個數值的和與積

		int num1 = 12, num2 = 6;

		System.out.println("數值和 = " + (num1 + num2));
		System.out.println("數值積 = " + (num1 * num2));
		System.out.println("==========================");

		int eggs = 200, dozen = 12;
		int e1 = eggs / dozen, e2 = eggs % dozen;
		System.out.println("200顆共有" + e1 + "打" + e2 + "顆");
		System.out.println("==========================");

//算出256559秒為多少天、多少小時、多少分與多少秒

		int ttlsecs = 256559, hrs = 24, mins = 60, secs = 60;
		int daysec = hrs * mins * secs, hrssec = mins * secs; // 一天幾秒鐘 , 一小時幾秒鐘
		int hrsleft = ttlsecs % daysec, minleft = hrsleft % hrssec, secleft = minleft % secs;// 剩餘多少小時秒, 剩餘多少分鐘秒, 剩餘多少秒
		System.out.println("256559秒為" + (ttlsecs / daysec) + "天" + (hrsleft / hrssec) + "小時" + (minleft / secs) + "分"
				+ secleft + "秒");
		System.out.println("=====================");

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		// 圓面積公式為圓周率×半徑×半徑, 圓周長公式為直徑x圓周率

		final double a = 3.1415;
		int r = 5;

		System.out.println("圓面積 = " + r * r * a);
		System.out.println("圓周長 = " + r * 2 * a);
		System.out.println("=====================");

		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行, 請用程式計算10年後,本金加利息共有多少錢
		// 期末 = 期初*(1+利率)的n次方 ---------複利公式
		int y, money = 1_500_000;
		double rate = 0.02;
		double saving = money * (1 + rate);
		for (y = 1; y <= 10; y++) {
			saving *= (1 + rate);
		}
		System.out.println("複利10年本金加利息共有" + (int) saving + "元");// double轉int整數
		System.out.println("=====================");
	
		System.out.println(5 + 5);
		// 此為預設整數型別int數值5+型別int數值5，所得為十進位之和int數值10
		System.out.println(5 + '5');
		// 此為預設整數型別int數值5+型別char5，依Unicode編碼char5代表十六進位值為0x35，換算十進位數值為型別int數值53，所得十進位之和int數值58
		System.out.println(5 + "5");
		// 此為預設整數型別int數值5+型別String字串5，整數與字串相加為串接相連，所得為String字串55
		System.out.println("=====================");

	}
}