class  Char
{
	public static void main(String[] args) 
	{
		char c1='a';
		char c2='中';
		char c3='1';
		char c4='%';
		char c5='\u0043';	//表示形式2：直接使用unicode值来表示字符型常量：‘\u0013 ’
		System.out.println(c5);
		//表示形式3：使用转义字符
		char c6='\n';
		char c7='\t';
		System.out.println("hello"+c6+"world");
		//表示形式4：使用具体字符对应的数值(比如ASCII码)
		char c8=97;
		System.out.println(c8);

		boolean bo1 = true;
		boolean bo2 = false;
		
		if (bo2)
		{
			System.out.println(1);
		}
		else{
			System.out.println(2);
		}
		//不通过
		//bolean a = 0;
	}
}
