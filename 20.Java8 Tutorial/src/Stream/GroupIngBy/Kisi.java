package Stream.GroupIngBy;

public class Kisi {
	private String name;
	private String surname;
	private int age;
	private String country;

	public Kisi(String name, String surname, int age, String country) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Kisi [name=" + name + ", surname=" + surname + ", age=" + age + ", country=" + country + "]";
	}
}
