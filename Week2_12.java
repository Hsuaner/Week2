//絤策2级糶祘Α﹍て计皚盢皚い┮Τ计羆㎝籔キА璸衡ㄓ
public class Week2_12 {
  public static void main(String args[])  { 
	double[] a = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
	float avg = 0.0f;
	double sum = 0.0;
	System.out.println("皚");
	for(double x : a)
	{
		sum+=x;
		System.out.print(x+" ");
	}
	avg=(float)sum/a.length;
	System.out.println("\n羆㎝"+sum+"\nキА"+avg);
  }
}