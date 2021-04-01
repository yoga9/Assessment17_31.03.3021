package lambdaExpression;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaComparator {
	
	public static void main(String[] args) {
		
		ArrayList<Student> obj = new ArrayList<Student>();
		obj.add(new Student(2,"Vizhal",85));
		obj.add(new Student(1,"Sara",98));
		obj.add(new Student(4,"Deepz",70));
		obj.add(new Student(3,"Shila",65));
		
		System.out.println("Sorting Based on Name");
		Collections.sort(obj,(n1,n2)->{
		return n1.StuName.compareTo(n2.StuName);	
		});
//		
//		for(Student s : obj) {
//			System.out.println(s.StuID+ " "+s.StuName+ " "+s.StuMarks);
//		}
		
		obj.forEach(
				(N)->System.out.println(N.StuID+" "+N.StuName+" "+N.StuMarks)
				);
		
}}
	
class Student{
	int StuID;
	String StuName;
	float StuMarks;
	
	public Student(int stuID, String stuName, float stuMarks) {
		super();
		StuID = stuID;
		StuName = stuName;
		StuMarks = stuMarks;
}
}

