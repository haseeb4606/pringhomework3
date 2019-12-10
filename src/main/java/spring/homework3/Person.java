package spring.homework3;

public class Person {

	private Phone ph;

	public void myInfo() {

		System.out.println("I have to call someone to pick me up from scholl");
		ph.help();

	}

	public Phone getPh() {
		return ph;
	}

	public void setPh(Phone ph) {
		this.ph = ph;
	}

}
