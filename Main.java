package smis;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Students stus = new Students();
		System.out.println("��ӭʹ��ѧ����Ϣ����ϵͳ");		
		Scanner in;		
		int type = 0;		
		while(true) {
			System.out.println("�����빦�����1 ���ѧ��   2 ��ѯѧ��  3 ���ѧ��  4 ɾ��ѧ��  5 �˳�");
			in = new Scanner(System.in);
			type = in.nextInt();
			switch(type) {
			case 1:
				System.out.println("��ӭʹ�������ϵͳ");
				stus.print();
				break;
			case 2:
				System.out.println("��ӭʹ�ò�ѯ��ϵͳ");
				stus.find();
				break;
			case 3:
				System.out.println("��ӭʹ�������ϵͳ");
				stus.add();
				break;
			case 4:
				System.out.println("��ӭʹ��ɾ����ϵͳ");
				stus.delete();
				break;
			case 5:
				System.out.println("ллʹ�ñ�ϵͳ��ϵͳ�Ѿ��˳���");
				System.exit(0);
				break;
			default:
				System.out.println("�Ƿ����룬���������빦�ܺ��롣");
				System.out.println("�����빦�����1 ���ѧ��   2 ��ѯѧ��  3 ���ѧ��  4 ɾ��ѧ��  5 �˳�");		
			}			
		}

	}

}
