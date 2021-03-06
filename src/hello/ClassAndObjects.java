package hello;

public class ClassAndObjects {
	int age;
	String name;
	String address;
//	
//	public ClassAndObjects(int age,String name,String address) {
//		this.name=name;
//		this.address=address;
//		this.age=age;
//	}
//	public void showData() {
//		System.out.println("Your name is "+this.name +" Your age is "+this.age+" You are from "+this.address);
//	}
	public void getAge(int ag) {
		age=ag;
	}
	public void getName(String nm) {
		name=nm;
	}
	public void getAddress(String add) {
		address=add;
	}
	
	public void displayData() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
	}
	
	public static void main(String[] args) {
//		ClassAndObjects clo=new ClassAndObjects(24, "Alex", "Gurgaon");
//		clo.showData();
		ClassAndObjects cls=new ClassAndObjects();
		cls.getName("Lena");
		cls.getAge(25);
		cls.getAddress("San Francisco");
		cls.displayData();
	}
}
