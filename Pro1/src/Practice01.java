import java.util.*;
/**
 * ��ϰ
 * @author ����
 *
 */
public class Practice01 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("��������������");
//		String name = scanner.nextLine();
//		System.out.println("�������������");
//		int age = scanner.nextInt();
//		System.out.println(name + age);
		String str1 = "abc";
		String str2 = "abc";
		String str3 = str1;
		
		System.out.println(str1.compareToIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
