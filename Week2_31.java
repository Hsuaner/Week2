import java.io.*; 
import java.util.*;

//練習：請擴充Circle類別，在其中加入一個成員函式Arc與Pie，兩個函式都接受一個參數代表角度，並分別回傳該角度所對應的弧長與面積。另外，請撰寫主函式要求使用者連續輸入半徑以產生不同的圓形，接著使用者可以輸入編號與角度，程式便會回傳該圓形對應該角度的弧長與面積。
public class Week2_31 {
	
	public static void main (String[] args) throws IOException {
		int option = 0, n = 0;
		Scanner a = new Scanner(System.in);
		double r[][] = new double[1][1];
		while(true) {
			System.out.print("1)新增 2)查詢 3)結束 ");
			option = a.nextInt();
			switch(option) {
				case 1 :
					System.out.print("請輸入數量： ");
					n = a.nextInt();
					r = new double[n][2];  // 動態配置長度 
					/*for(int i = 0; i < n; i++) {
						r[i] = new double[2];
					}*/					
					System.out.println("請輸入編號與半徑： ");
					for(int j = 0; j < n; j++) {
						for(int i = 0; i < 2; i++) {
							r[j][i] = a.nextDouble();
						}
					}
						break;
				case 2 :
					int i = 0;
					double id = 0.0, ang = 0.0;
					Circle c = new Circle();
					System.out.println("請輸入編號與角度： ");
					id = a.nextDouble();
					ang = a.nextDouble();
					for(i=0; i<n; i++) { //找到並印出
						if(id == r[i][0]) {
							c.radius = r[i][1];
							c.angle = ang;
							System.out.println("\n編號\t半徑\t弧長\t面積 ");
							System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+c.Arc()+"\t"+c.Pie()+"\n");
							break;
						}
					}
					if(i == n)
						System.out.println("找不到資料!!");
					break;
				case 3 :
					return;
			}
		}
		
	}

}

class Circle {
	double radius = 0.0, angle = 0.0;

	double Arc() { //弧長
		return 2 * 3.14 * radius * angle/360;
	}
	double Pie() { //面積
		return 3.14 * radius * radius;
	}
}