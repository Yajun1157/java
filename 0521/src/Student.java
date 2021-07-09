
public class Student {	
	private String name ;
	private int grade ;
	static int count = 0; //클래스 변수
	
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
		 System.out.println("학생의 이름은 " +   // 값 출력
					name + "이고, " + grade + "학년입니다.") ;
	}
	
	public static int getCount(){
		return count;
	}
}