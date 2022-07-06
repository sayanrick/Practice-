public class Practice {
   String userName;
   int userId;
   int salary;

   Practice(String userName, int userId, int salary){
       this.userName = userName;
       this.userId = userId;
       this.salary = salary;

   }
   
   public static void main(String[] args) {
	   Hello obj = new Hello();
   }

}

class Hello {
	
//	public static void main(String[] args) {
//		Practice obj = new Practice("Sayan", 17001, 20000);
//		Practice obj2 = new Practice("Sayan", 17001, 30000);
//		System.out.println(obj.userName + " " + obj.userId + " " + obj.salary);
//	}
	
	Hello() {
		Practice obj = new Practice("Sayan", 17001, 20000);
		System.out.println(obj.userName + " " + obj.userId + " " + obj.salary);

	}
}

