/**
 * 类练习
 * @author 许轲
 *
 */
import java.util.*;
public class Student {
	int id;
	String name;
	int age;
	Computer comp;
	
	void study() {
		System.out.println("我爱学习！");
	}
	Student(){	
	}
	void printMassage() {
		System.out.println("姓名："+ id+ name+"年龄："+age +"电脑品牌："+comp.brand);
	}
	public static void main(String[] args) {
		Student stu = new Student();
		Computer c = new Computer();
		Scanner s = new Scanner(System.in);
		System.out.println("输入");
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