package CodeSoft_Task;

import java.util.Scanner;

public class studentGradeCalculator {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Student Grade calculator\n"); 
	System.out.println("Enter all No of the Subject");
	int noSub=sc.nextInt();
	int total=0;
	
	for(int i=1;i<= noSub;i++) {
		System.out.println("Enter marks obtained in Subject "+i+" : ");
		int marks=sc.nextInt();
		total+=marks;
	}
	
	double averagePer=(double)total/noSub;
	char Grade;
	if(averagePer>=80) {
		Grade='A';
	}
	else if(averagePer>=60) {
		Grade='B';
	}
	else if(averagePer>=45) {
		Grade='C';
	}
	else if(averagePer>=33) {
		Grade='D';
	}
	else {
		Grade='F';
	}
	
	System.out.println("total marks obtained in "+noSub+" subject : "+total);
	System.out.println("Average Percentage Gaine in "+noSub+"subject : "+averagePer+"%");
	System.out.println("Grade : "+Grade);
}
}
