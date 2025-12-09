package Practice;
	class Student {
	    String name;          
	    static String college; 
	}
	    public class StaticInstance {
	    public static void main(String[] args) {

	        Student.college = "AMC College";  

	        Student student1 = new Student();
	        student1.name = "Kalyan";

	        Student student2 = new Student();
	        student2.name = "Manas";

	        System.out.println(student1.name + " - " + Student.college);
	        System.out.println(student2.name + " - " + Student.college);
	    }

}
