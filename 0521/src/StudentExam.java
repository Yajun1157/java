
public class StudentExam {

	public static void main(String[] args) {
		Student kim = new Student( ) ; 	// kim ��ü ����
		Student jo = new Student("������");
		Student lee = new Student("������",2);
	   
	    kim.print();
	    jo.print();
	    lee.print();
	    
	    System.out.println("������ �л� ��ü ���� "+Student.getCount());

	}

}
