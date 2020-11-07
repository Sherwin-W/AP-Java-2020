package sherwinw;

public class StudentTest 
{
	public static void main (String[] args)
	{
		Student student = new Student("Cracker, Carla");
		student.addQuiz(100);
		student.addQuiz(90);
		student.addQuiz(80);
		System.out.println("Cracker, Carla"+"    "+student.getName());
		System.out.println("Total Score "+student.getTotalScore());
		System.out.println("Average score " + student.getAverage());

	}
}

