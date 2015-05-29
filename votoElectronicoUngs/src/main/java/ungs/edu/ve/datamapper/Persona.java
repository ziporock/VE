package ungs.edu.ve.datamapper;



public class Persona {

	
    private String firstName;
    private String lastName;
    private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Persona [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}

    //getters and setters for the above fields are omitted
    //Imagine they were below. Go on, it'll make life easier.

}
