import java.util.Scanner;

//練習3：撰寫程式先要求使用者輸入一個西元的年份，再印出一個表格顯示所有此年份之前的閏年。閏年的判斷請參考http://goo.gl/LQmPM8
public class Week2_23 {
  public static void main(String args[]) { 	
	int year = 0, count = 1;
	System.out.println("請輸入西元年："); 
	Scanner y = new Scanner(System.in);
	year = y.nextInt();
	System.out.println("閏年為西元：");
	for(int i=year; i>0; i--)
	{
		if(i%400==0 || (i%4==0 && i%100!=0))
		{
			System.out.print(i+"\t");
			if(count%12==0)
				System.out.print("\n");
			count++;
		}	
	}
  }
}