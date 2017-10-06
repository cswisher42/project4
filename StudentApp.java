import java.util.*;

public class StudentApp{
	public static void main(String [] args){
		Student [] students = new Student[50];
		Scanner s = new Scanner(System.in);
		double lab, project, exam, codeLab, fExam;
		int count = 0;
		char answer;
		boolean loopAgain = true;
		
		System.out.print("Enter the total possible points for labs: ");
		lab = Double.parseDouble(s.nextLine());
		System.out.print("Enter the total possible points for projects: ");
		project = Double.parseDouble(s.nextLine());
		System.out.print("Enter the total possible points for exams: ");
		exam = Double.parseDouble(s.nextLine());
		System.out.print("Enter the total possible points for codeLab: ");
		codeLab = Double.parseDouble(s.nextLine());
		System.out.print("Enter the total possible points for the final exam: ");
		fExam = Double.parseDouble(s.nextLine());		
		do{
			System.out.print("Enter the student's first name: ");
			String first = s.nextLine();
			System.out.print("Enter the student's last name: ");
			String last = s.nextLine();
			System.out.print("Enter the student's WID: ");
			String WID = s.nextLine();
			System.out.print("Enter the student's lab points: ");
			double labs = Double.parseDouble(s.nextLine());
			System.out.print("Enter the student's project points: ");
			double projects = Double.parseDouble(s.nextLine());
			System.out.print("Enter the amount of points the student got on the exams: ");
			double exams = Double.parseDouble(s.nextLine());
			System.out.print("Enter the student's Code Lab points: ");
			double codeLabs = Double.parseDouble(s.nextLine());
			System.out.print("Enter the amount of points that the student got on the final exam: ");
			double fExams = Double.parseDouble(s.nextLine());
			students[count] = new Student(first, last, WID, labs, projects, exams, codeLabs, fExams);
			students[count].setTotalPoints(lab,project,exam,codeLab,fExam);
			
			count++;
			System.out.print("Do you want to enter another student? (Y/N)");
			answer = s.nextLine().charAt(0);
			if(answer == 'N')
				loopAgain = false;
		}while(loopAgain);
		
		for(int i = 0; i < 15; i++){
			if(students[i] != null)
				System.out.println(students[i].toString());
		}
	}
}