/*
自动类型提升
规则:当容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型。
说明:此时的容量小或大，并非指占用的内存空间的大小，而是指表示数据的范围的大小。
long(8字节)、 float(4宁节)
byte、short、char---int ---> long--->float ---> double
特别的：Byte、Short、char类型的变量之间做运算，结果为Int类型：
*/

class  typeC
{
	public static void main(String[] args) 
	{
		int i1=10;
		int i2=i1;
		long l1=i1;
		float f1=l1;
		byte b1= 12;
		int i3=b1+i1;
		short s1 =10;
		char c1 = 'a';
		//报错
		//byte b2=b1+i1;
		int i4 = b1 + s1;
		int i5 = b1 + c1;
		System.out.println("Hello World!");
		long l2 = 123l;
		long l3 = 231;	//自动类型提升
		long l4 = 1233141423424l;
		//long l4 = 1233141423424 //超出int范围
		int i6 = b1+1;//整型常量，规定为是Int类型
		double d1 = b1+3.14 //浮点型常量，规定为double
		//练习4：说明为什么不允许变量名是数字开头的。为了“自治"
		/*int 123L=12；long 16=123L；*/
	}
}
