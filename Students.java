package smis;
import java.util.Vector;
import java.util.Scanner;
public class Students {
	private Vector<Student> stus;
	public Students() {
		stus = new Vector<Student>();
		init();
	}
	
	private void init() {
		Student stu;
		stu = new Student("1001","张三丰","男","1999-5-5","计算机","2019","13999999999");
		stus.add(stu);	
		stu = new Student("1002","李冬梅","女","2000-8-5","软件工程","2019","13988888888");
		stus.add(stu);	
	}
	
	public void print() {
		System.out.println(Student.getItem());
		for(int i=0;i<stus.size();i++) {
			System.out.println(stus.get(i).toString());						
		}		
	}
	
	public void find() {
		Student stu=null;
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("请输入查询关键字：1 学号   2 姓名   3 性别   4 出生日期   5 专业   6 年级   7 电话号码");
		int key=0;
		key = in.nextInt();
		switch(key) {
		case 1:
			stu = findByNo();
			if(stu==null)
				System.out.println("所查询的学生不存在");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}			
			break;
		case 2:
			stu = findByName();
			if(stu==null)
				System.out.println("所查询的学生不存在");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			
			break;
		case 3:
			stu = findBySex();
			if(stu==null)
				System.out.println("所查询的学生不存在");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 4: 
			stu = findByBirth();
			if(stu==null)
				System.out.println("所查询的学生不存在");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 5:
			stu = findByMajor();
			if(stu==null)
				System.out.println("所查询的学生不存在");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 6:
			stu = findByGrade();
			if(stu==null)
				System.out.println("所查询的学生不存在");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 7:
			stu = findByPhone();
			if(stu==null)
				System.out.println("所查询的学生不存在");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		default:
			System.out.println("查询的关键字不对，请重新输入。");
		}
		
	}
	
	private Student findByNo(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("请输入查询学号：");
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getNo().equals(value))
				stu = stus.get(i);
		}
		return stu;
	}
	
	private Student findByName(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("请输入查询姓名：");
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getName().equals(value))
				stu = stus.get(i);
		}
		return stu;
	}
	
	private Student findBySex(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("请输入查询性别：");
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getSex().equals(value))
				stu = stus.get(i);
		}
		return stu;
	}
	
	private Student findByBirth(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("请输入查询出生日期：");
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getBirth().equals(value))
				stu = stus.get(i);
		}
		return stu;
	}
	
	private Student findByMajor(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("请输入查询专业：");
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getSex().equals(value))
				stu = stus.get(i);
		}
		return stu;
	}
	
	private Student findByGrade(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("请输入查询年级：");
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getGrade().equals(value))
				stu = stus.get(i);
		}
		return stu;
	}
	
	private Student findByPhone(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("请输入查询电话号码：");
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getPhone().equals(value))
				stu = stus.get(i);
		}
		return stu;
	}
	
	public void add() {
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("请按顺序输入学生基本信息：学号  姓名  性别  出生日期  专业  年级  电话号码");
		String no,name,sex,birth,major,grade,phone;
		no = in.next();
		name = in.next();
		sex = in.next();
		birth = in.next();
		major = in.next();
		grade = in.next();
		phone = in.next();
		Student stu = new Student(no,name,sex,birth,major,grade,phone);
		stus.add(stu);	
		System.out.println("学生输入已经添加到系统中");
	}
	
	public void delete() {
		boolean state = false;
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("请输入删除学生的学号：");
		String value="";
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getNo().equals(value)) {
				stus.remove(i);
				state = true;
			}				
		}
		if(state)
			System.out.println("学号为"+value+"的学生删除成功。");
		else
			System.out.println("学号为"+value+"的学生不存在。");		
		
	}

}
