import java.io.*; 
import java.util.*;
import java.text.*;

//練習1：請撰寫一個類別名為Oval以代表橢圓，此類別繼承於Circle。再仿照指定作業3的練習1，撰寫主函式的功能。
public class Week2_41 {

	public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(System.in);
			int option = 0, n = 0;
			double r[][] = new double[1][1]; //存放所有橢圓
			while(true) {
				System.out.print("1)新增 2)查詢 3)結束 ");
				option = in.nextInt();
				switch(option) {
					case 1 :
						System.out.print("請輸入數量： ");
						n = in.nextInt();
						r = new double[n][3];  // 動態配置長度 
						/*for(int i = 0; i < n; i++) {
							r[i] = new double[2];
						}*/					
						System.out.println("請輸入編號、長軸與短軸： ");
						for(int j = 0; j < n; j++) {
							for(int i = 0; i < 3; i++) {
								r[j][i] = in.nextDouble();
							}
						}
						break;
					case 2 :
						int i = 0;
						double id = 0.0, ang = 0.0;
						Oval c = new Oval();
						System.out.println("請輸入編號： ");
						id = in.nextDouble();
						for(i=0; i<n; i++) { //找到並印出
							if(id == r[i][0]) {
								c.radius = r[i][1];
								c.b = r[i][2];
								System.out.println("\n編號\t長軸\t短軸\t面積 ");
								System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]+"\t"+c.Pie()+"\n");
								break;
							}
						}
						if(i == n)
							System.out.println("找不到資料!!");
						break;
					case 3 : //結束
						return;
				}
			}
	}

}
class Circle {
	double radius = 0.0, angle = 0.0;
	double Arc() { //弧長
		return 2 * 3.14 * radius * angle / 360;
	}
	double Pie() { //面積
		return 3.14 * radius * radius;
	}
}
class Oval extends Circle{
	double b = 0.0;
	double Pie() { //面積
		return 3.14 * super.radius * b;
	}
}