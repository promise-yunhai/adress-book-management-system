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
		stu = new Student("1001","������","��","1999-5-5","�����","2019","13999999999");
		stus.add(stu);	
		stu = new Student("1002","�÷","Ů","2000-8-5","�������","2019","13988888888");
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
		System.out.println("�������ѯ�ؼ��֣�1 ѧ��   2 ����   3 �Ա�   4 ��������   5 רҵ   6 �꼶   7 �绰����");
		int key=0;
		key = in.nextInt();
		switch(key) {
		case 1:
			stu = findByNo();
			if(stu==null)
				System.out.println("����ѯ��ѧ��������");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}			
			break;
		case 2:
			stu = findByName();
			if(stu==null)
				System.out.println("����ѯ��ѧ��������");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			
			break;
		case 3:
			stu = findBySex();
			if(stu==null)
				System.out.println("����ѯ��ѧ��������");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 4: 
			stu = findByBirth();
			if(stu==null)
				System.out.println("����ѯ��ѧ��������");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 5:
			stu = findByMajor();
			if(stu==null)
				System.out.println("����ѯ��ѧ��������");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 6:
			stu = findByGrade();
			if(stu==null)
				System.out.println("����ѯ��ѧ��������");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		case 7:
			stu = findByPhone();
			if(stu==null)
				System.out.println("����ѯ��ѧ��������");
			else {
				System.out.println(Student.getItem());
				System.out.println(stu.toString());
			}
			break;
		default:
			System.out.println("��ѯ�Ĺؼ��ֲ��ԣ����������롣");
		}
		
	}
	
	private Student findByNo(){
		Student stu = null;
		Scanner in;
		in = new Scanner(System.in);
		String value;
		System.out.println("�������ѯѧ�ţ�");
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
		System.out.println("�������ѯ������");
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
		System.out.println("�������ѯ�Ա�");
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
		System.out.println("�������ѯ�������ڣ�");
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
		System.out.println("�������ѯרҵ��");
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
		System.out.println("�������ѯ�꼶��");
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
		System.out.println("�������ѯ�绰���룺");
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
		System.out.println("�밴˳������ѧ��������Ϣ��ѧ��  ����  �Ա�  ��������  רҵ  �꼶  �绰����");
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
		System.out.println("ѧ�������Ѿ���ӵ�ϵͳ��");
	}
	
	public void delete() {
		boolean state = false;
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("������ɾ��ѧ����ѧ�ţ�");
		String value="";
		value = in.next();
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getNo().equals(value)) {
				stus.remove(i);
				state = true;
			}				
		}
		if(state)
			System.out.println("ѧ��Ϊ"+value+"��ѧ��ɾ���ɹ���");
		else
			System.out.println("ѧ��Ϊ"+value+"��ѧ�������ڡ�");		
		
	}

}
