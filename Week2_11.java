//練習1：撰寫一個程式將4點23分45秒到13點54分23秒之間的總秒數輸出。
public class Week2_11 {
  public static void main(String args[])  { 
	int[] a = {4,23,45};
	int[] b = {13,54,23};
	int[] c = {0,0,0};
	int sum = 0;
	for(int i=a.length-1; i>=0; i--)
	{
		if(b[i] < a[i] && i-1>=0)
		{
			b[i-1]-=1;
			c[i]=60-a[i]+b[i];
		}
		else
		{
			c[i]=b[i]-a[i];
		}
	}
	sum=c[2]+c[1]*60+c[0]*3600;
	System.out.println("4點23分45秒到13點54分23秒 \n經過了"+c[0]+"時"+c[1]+"分"+c[2]+"秒");
  	System.out.println("之間的總秒數為："+sum);
	
  }
}