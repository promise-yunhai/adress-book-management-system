package smis;

public class Student {
	private String no,name,sex,birth,major,grade,phone;

	public Student(String no, String name, String sex, String birth, String major, String grade, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.major = major;
		this.grade = grade;
		this.phone = phone;
	}	
	
	public Student() {
		this("","","","","","","");		
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
	
	public String toString() {
		return no+"\t"+name+"\t"+sex+"\t"+birth+"\t"+major+"\t"+grade+"\t"+phone;
	}
	
	public static String getItem() {
		return "学号\t姓名\t性别\t出生日期\t\t专业\t年级\t电话号码";
	}

}
