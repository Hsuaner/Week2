import java.io.*; 
import java.util.*;
import java.text.*;

//練習2：請設計一個有關日期的類別，可以年月日作初始化；此類別提供函式可以判斷日期格式是否正確並印出日期的內容。另外，請撰寫主函式用來測試這個類別是否正確。
public class Week2_32 {

	public static void main(String[] args) {
		//Date dNOW = new Date();
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd E");
		//System.out.println("現在日期: "+formatter.format(dNOW));
		String date;
		TestDate test = new TestDate();
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入日期： ");
		date = in.next();
		test.Test(date);
	}

}
class TestDate {
	int[] len = new int[]{0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int i = 0, d = 0;
	void Test(String s) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
             dateFormat.parse(s);
         }
        catch (Exception e) {
        	System.out.println("格式不正確！(yyyy/MM/dd)");
        	return;
        }
		String[] ymd = s.split("/");
		int year = Integer.valueOf(ymd[0]);
		int month = Integer.valueOf(ymd[1]);
		int day = Integer.valueOf(ymd[2]);
		if(year > 0 && month > 0 && month <= 12) //判斷年和月
		{
			if(month==2) { //判斷閏年
				if(year%400==0 || (year%4==0 && year%100!=0))
				{
					System.out.println("今年為閏年！(2月29日)");
					d=30;
				}
				else {
					System.out.println("今年為平年！(2月28日)");
					d=29;
				}
				if(day < d && day > 0)
					print(s);
				else
					System.out.println("日期不在合理範圍！");
				return;
					
			}else if(len[month] > day && day > 0) { //判斷日
				print(s);
			}else
				System.out.println("日期不在合理範圍！");
				
		}
		else
			System.out.println("日期不在合理範圍！");
		return;
	}
	void print(String s) {
		System.out.print("日期在合理範圍！\n您輸入的日期為： "+s);
	}
}
