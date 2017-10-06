import java.text.*;

public class Student{
	private String firstName;
	private String lastName;
	private String WID;
	private char grade = 'z';
	private double totalLabs;
	private double totalProjects;
	private double totalExams;
	private double totalCodeLab;
	private double totalFinal; 
	private double totalPoints;
	private double scoreLabs;
	private double scoreProjects;
	private double scoreExams;
	private double scoreCodeLab;
	private double scoreFinal;
	private double adjPoints;
	private double studentOverall;
	final private double labP = .15;
	final private double projectsP = .15;
	final private double examsP = .30;
	final private double codeLabP = .10;
	final private double finalP = .30;
	DecimalFormat df = new DecimalFormat("###.#%");
	
	public Student(){
		firstName = "no name entered";
		lastName = "no name entered";
		WID = "no WID";
		scoreLabs = 0;
		scoreProjects = 0;
		scoreExams = 0;
		scoreCodeLab = 0;
		scoreFinal = 0;
		studentOverall = 0;
	}
	
	public Student(String f, String l, String w, double lab, double p, double e, double c, double fGrade) {
		firstName = f;
		lastName = l;
		WID = w;
		scoreLabs = lab;
		scoreProjects = p;
		scoreExams = e;
		scoreCodeLab = c;
		scoreFinal = fGrade;
	}
	
	public void setTotalPoints(double lab, double p, double e, double c, double f){
		totalLabs = lab;
		totalProjects = p;
		totalExams = e;
		totalCodeLab = c;
		totalFinal = f;
		totalPoints = lab + p + e + c + f;
		calcAdjPoints();
	}
	
	public void calcAdjPoints(){
		adjPoints = (((scoreLabs/totalLabs) * (totalPoints*labP)) + ((scoreProjects/totalProjects) * (totalPoints*projectsP))
					+ ((scoreExams/totalExams) * (totalPoints*examsP)) + ((scoreCodeLab/totalCodeLab) * (totalPoints*codeLabP))
					+ ((scoreFinal/totalFinal) * (totalPoints*finalP)));		
		weightedOverall();
	}
	
	private void weightedOverall(){
		studentOverall = adjPoints/totalPoints;
		letterGrade();
	}
	
	private void letterGrade(){
		if(studentOverall*100 >= 89.5)
			grade = 'A';
		else if(studentOverall*100 >= 79.5)
			grade = 'B';
		else if(studentOverall*100 >= 68.5)
			grade = 'C';
		else if(studentOverall*100 >= 58.5)
			grade = 'D';
		else
			grade = 'F';
	}
	
	public String toString(){
		return ("Student Name: " + lastName + ", " + firstName
				+ "\nWID: " + WID
				+ "\nOveral %: " + df.format(studentOverall)
				+ "\nFinal Grade: " + grade);
	}
}