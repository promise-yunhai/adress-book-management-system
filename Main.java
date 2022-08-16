package smis;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Students stus = new Students();
		System.out.println("欢迎使用学生信息管理系统");		
		Scanner in;		
		int type = 0;		
		while(true) {
			System.out.println("请输入功能类别：1 输出学生   2 查询学生  3 添加学生  4 删除学生  5 退出");
			in = new Scanner(System.in);
			type = in.nextInt();
			switch(type) {
			case 1:
				System.out.println("欢迎使用输出子系统");
				stus.print();
				break;
			case 2:
				System.out.println("欢迎使用查询子系统");
				stus.find();
				break;
			case 3:
				System.out.println("欢迎使用添加子系统");
				stus.add();
				break;
			case 4:
				System.out.println("欢迎使用删除子系统");
				stus.delete();
				break;
			case 5:
				System.out.println("谢谢使用本系统，系统已经退出。");
				System.exit(0);
				break;
			default:
				System.out.println("非法输入，请重新输入功能号码。");
				System.out.println("请输入功能类别：1 输出学生   2 查询学生  3 添加学生  4 删除学生  5 退出");		
			}			
		}

	}

}
