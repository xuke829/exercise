/**
 * ����ϰ
 * @author ����
 *
 */
import java.util.*;
public class Student {
	int id;
	String name;
	int age;
	Computer comp;
	
	void study() {
		System.out.println("�Ұ�ѧϰ��");
	}
	Student(){	
	}
	void printMassage() {
		System.out.println("������"+ id+ name+"���䣺"+age +"����Ʒ�ƣ�"+comp.brand);
	}
	public static void main(String[] args) {
		Student stu = new Student();
		Computer c = new Computer();
		Scanner s = new Scanner(System.in);
		System.out.println("����");
		stu.id = s.nextInt();
		stu.name="xuke";
		stu.age = 18;
		c.brand = "DELL";
		c.price = 5600;
		stu.comp = c ;
		stu.study();
		stu.printMassage(); 
	}
}
class Computer{
	String brand;
	int price;
}