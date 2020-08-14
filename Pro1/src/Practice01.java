import java.util.*;
/**
 * 练习
 * @author 许轲
 *
 */
public class Practice01 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入您的名字");
//		String name = scanner.nextLine();
//		System.out.println("请输入你的年龄");
//		int age = scanner.nextInt();
//		System.out.println(name + age);
		String str1 = "abc";
		String str2 = "abc";
		String str3 = str1;
		
		System.out.println(str1.compareToIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
