package hello;

public class Child extends Parent {
	int bonus=10000; 
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("Salary : " +c.salary);
		System.out.println("Total salary inclidng bonus : "+ (c.salary + c.bonus));
	}
}
