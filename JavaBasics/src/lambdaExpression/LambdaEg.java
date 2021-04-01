package lambdaExpression;
interface addition{
	public void add();
}

interface display{
	public String disp();
}

interface display1{
	public String disp(String color);
}

interface display2{
	public String disp(String A,String B,String C);
}

interface message{
	public String show(String msg);
}

public class LambdaEg {
    public static void main(String[] args) {
		int a = 10, b = 5;
		addition obj = new addition() {     //Normal way
		public void add() {
		System.out.println(a+b);
	}
		};
	    obj.add();
	    
	   addition obj1 = ()->{    //using lambda
		   System.out.println(a+b);
	   };
	   obj1.add();
	   
	   display obj2 = ()->{                   //No parameter
		   return "Hello World" + " Yogi :)";
	   };
	      System.out.println(obj2.disp());
	      
	   display1 obj3 =  (color)->{         //With Single Parameter
		   return "Sky" +color;
	   };
	   System.out.println(obj3.disp("Blue"));
	   
	   display2 obj4 = (A,B,C)->(A+B+C);
	   System.out.println(obj4.disp("The ", "Famous ", "Monuments "));
	   
	   display2 obj5 = (A,B,C)->{
		   return (A+B+C);
		  // return (A+B+"Go1S");
	   };
	   System.out.println(obj5.disp("Get ", "Set ", "Go"));
	   
	   message obj6 = (msg)->{
		   String s1 = "You are the creator of your own reality";     //Multiple Stmnt
		   String s2 = "By Yogeshwari Karnan - " + s1 + msg;
		   return s2;
	   };
	   System.out.println(obj6.show(" :)"));
	   
}
}
