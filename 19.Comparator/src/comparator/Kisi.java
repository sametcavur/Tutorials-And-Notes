package comparator;

public class Kisi{
	private int id;
	private String name;
	private String surname;
	
	public Kisi(){}
	
	public Kisi(String name, int id, String surname) {
		this.name = name;
		this.id = id;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Kisi [name=" + name + ", id=" + id + ", surname=" + surname + "]";
	}
}