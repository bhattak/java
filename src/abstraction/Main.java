package abstraction;

abstract class One{
	abstract int getAge();
}
class Two extends One{
	int getAge(){
		return 25;
	}
}

public class Main {
	public static void main(String[] args) {
		Two b=new Two();
		System.out.println(b.getAge());
	}
}
