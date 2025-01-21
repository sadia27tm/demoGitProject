package Assignment01;

public class Student {
	
	int English;
	int Maths;
	int Science;
	int Social_studies;
	int output1;
	double output2;
	
	
	
	
	void Total_marks() {
		
	int output1= English+Maths+Science+Social_studies;
		System.out.println("Total marks= " + output1);
		
	}
	
	void Average() {
	double output2= (English+Maths+Science+Social_studies)/4;
	       System.out.println("Average= "+ output2);
		
	}
	
	public static void main(String[] args) {
		
		Student one= new Student();
		one.English=80;
		one.Maths=90;
		one.Science=75;
		one.Social_studies=65;
		System.out.println("Student one: ");
		one.Total_marks();
		one.Average();
		
		
		Student two= new Student();
		two.English=90;
		two.Maths=95;
		two.Science=50;
		two.Social_studies=78;
		System.out.println("Student two: ");
		two.Total_marks();
		two.Average();
		
		Student three= new Student();
		three.English=75;
		three.Maths=98;
		three.Science=65;
		three.Social_studies=98;
		System.out.println("Student three: ");
		three.Total_marks();
		three.Average();
		
		Student four= new Student();
		four.English=77;
		four.Maths=56;
		four.Science=87;
		four.Social_studies=88;
		System.out.println("Student four: ");
		four.Total_marks();
		four.Average();
		
		
		
		
	}

}
