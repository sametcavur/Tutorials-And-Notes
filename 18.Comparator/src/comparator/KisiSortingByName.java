package comparator;

import java.util.Comparator;

public class KisiSortingByName implements Comparator<Kisi>  {

	@Override
	public int compare(Kisi kisi1, Kisi kisi2) {
		return kisi1.getName().compareTo(kisi2.getName());
	}
}
