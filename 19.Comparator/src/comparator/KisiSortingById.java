package comparator;

import java.util.Comparator;

public class KisiSortingById implements Comparator<Kisi>{

	@Override
	public int compare(Kisi kisi1, Kisi kisi2) {
		return kisi1.getId() - kisi2.getId();
	}
}
