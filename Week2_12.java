//練習2：撰寫一個程式，先初始化一個數字陣列，在將此陣列中所有的數字的總和與平均計算出來。
public class Week2_12 {
  public static void main(String args[])  { 
	double[] a = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
	float avg = 0.0f;
	double sum = 0.0;
	System.out.println("陣列");
	for(double x : a)
	{
		sum+=x;
		System.out.print(x+" ");
	}
	avg=(float)sum/a.length;
	System.out.println("\n總和為："+sum+"\n平均為："+avg);
  }
}