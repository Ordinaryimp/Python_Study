/*
小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
它需要一个程序将华氏温度(80度)转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度
C=(℉-32)/1.8
*/
class temperature
{
	public static void main(String[] args) 
	{
		double hua=80.0;
		double she=(hua-32)/1.8;
		System.out.println("当前华氏温度为："+hua+"℉");
		System.out.println("当前摄氏温度为："+she+"℃");
	}
}
