/*
2.说明：
当“-”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理。
支持连续赋值。
：/=、%=操作，不会改变变量本身的数据类型
*/

class setvalue
{
	public static void main(String[] args) 
	{

		int num1 = 1;
		//连续赋值
		int a,b;
		a=b=3;
		byte c=9;
		c+=8;
		int i=1;
		i*=0.1;
		System.out.println(a+b);
		System.out.println(i); //0
		a=10;
		a=a+(a++)+(++a);	//10+10+12
		System.out.println(a);
	}
}
