package test;

public class Test {
	
	public static void main(String[] args) {
		
		IA ia = new C();
		ia.show();
		
		IB ib = new C();
		ib.show();
		
		B b = new B();
		b.show();
		
		B bc = new C();
		bc.show();
		
	}
}

interface IA {
	
	void show();
}

interface IB {
	
	void show();
}

class B {
	
	public void show() {
		System.out.println("show :: B");
	}
	
}

class C extends B implements IA, IB {

	@Override
	public void show() {
		System.out.println("show :: C");
	}	
}
