package sherwinw;

public class Student 
{
	private String name;
	private double totalscore;
	private int numberoftest;
	
	public Student(String name)
	{
		this.name = name;
		totalscore = 0.0;
		numberoftest = 0;
	}
	public String getName()
	{
		return name;
	}
	public void addQuiz(int score)
	{
		totalscore = totalscore + score;
		numberoftest++;		
	}
	
	public double getTotalScore()
	{
		return totalscore;
	}
	public double getAverage()
	{
		return totalscore/numberoftest;
	}
}

