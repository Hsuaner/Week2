import java.io.*; 
import java.util.*;

//練習4：請撰寫一個程式，連續要求使用者輸入資料，包括學生姓名與其成績，輸入完後使用者可以進一步輸入編號來找出對應的學生資料；如果使用者在輸入成績時輸入不是合法的數字字串，則程式必須可以印出錯誤訊息加以警告(提示：NumberFormatException)。
public class Week2_24 {
  public static void main(String args[]) throws IOException { 	
	int option = 0, count = 0;
	String[][] Stu = new String[10][3]; //10列3行
	String[] temp = new String[3];
	String id = "0";
	Scanner a = new Scanner(System.in);
	while(true)
	{
		System.out.println("1)新增 2)查詢 3)結束");
		option=a.nextInt();
		switch(option)
		{
			case 1 :
				System.out.println("請輸入學生編號、姓名與成績： (結束請輸入0 0 0");
				while(true)
				{
					for(int i = 0; i < 3; i++){
						temp[i] = a.next();
					}
					if(temp[0].equals("0")==true && temp[1].equals("0")==true && temp[2].equals("0")==true)
						break;
					else
					{
						for(int i = 0; i < 3; i++){
							Stu[count][i]=temp[i];
						}
						count++;
					}
				}
				break;
			case 2 :
				int i=0;
				System.out.println("請輸入學生編號：");
				id = a.next();
				for(i=0; i<count; i++)
				{
					if(Stu[i][0].equals(id)==true)
					{
						System.out.println("\n編號\t姓名\t成績");
						System.out.println(Stu[i][0]+"\t"+Stu[i][1]+"\t"+Stu[i][2]+"\n");
						break;
					}
				}
				if(i == count)
					System.out.println("找不到資料!!");
				break;
			case 3 :
				return;
			default :
				continue;
		}
	}
	
  }
}