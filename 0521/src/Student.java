
public class Student {	
	private String name ;
	private int grade ;
	static int count = 0; //Ŭ���� ����
	
	public Student() {
		count++;
		}
	public Student (String name) {
		this.name = name;
		count++;
	}
	public Student (String name,int grade) {
		this(name);
		this.grade = grade;
	}
	
	public void setName( String name ) {
	    this.name = name ; }
	  public String getName( ) { 
	    return this.name ; }
	  public void setGrade( int grade ) {
	    this.grade = grade ; }
	  public int getGrade( ) {
	    return this.grade ; }

	public void print() {
		 System.out.println("�л��� �̸��� " +   // �� ���
					name + "�̰�, " + grade + "�г��Դϴ�.") ;
	}
	
	public static int getCount(){
		return count;
	}
}