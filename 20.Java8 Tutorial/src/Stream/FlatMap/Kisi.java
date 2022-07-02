package Stream.FlatMap;

import java.util.List;

public class Kisi {
	
	private String name;
	private List<String> cars;
	
	public Kisi(String name, List<String> cars) {
		this.name = name;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Kisi [name=" + name + ", cars=" + cars + "]";
	}
}
