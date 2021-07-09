
public class StudentExam {

	public static void main(String[] args) {
		Student kim = new Student( ) ; 	// kim 按眉 积己
		Student jo = new Student("炼版犁");
		Student lee = new Student("己霖捞",2);
	   
	    kim.print();
	    jo.print();
	    lee.print();
	    
	    System.out.println("积己等 切积 按眉 荐绰 "+Student.getCount());

	}

}
