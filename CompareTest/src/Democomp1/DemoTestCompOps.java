package Democomp1;

public class DemoTestCompOps {

	public static void main(String[] args) {
		
		
//		String name1= "This is comparation test";
//		String name2= "This is comparation test";
//		
//		System.out.println(name1==name2);
//		System.out.println(name2.equals(name2));
//		
//		String name3=new String("Testing String Comp");
//		String name4=new String("Testing String Comp");
//		System.out.println("-----------------Case1--------------------");
//		System.out.println(name3==name4);
//		System.out.println(name3.equals(name4));
//		
//		/*
//		 * Solution for case1 is "Singleton Design pattern 
//		 * 
//		 */
		
//		singletonTest t= new singletonTest(); //The constructor singletonTest() is not visible
		
		
		singletonTest t1= singletonTest.getInstance();
		singletonTest t2= singletonTest.getInstance();
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		System.out.println(t1);
		System.out.println(t2);
		
	/*
	 * == is comparison 	=  object reference same, addresses 
	 * .equals this comparison is return true if content is same  
	 */
		

	}

}
