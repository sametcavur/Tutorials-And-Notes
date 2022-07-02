package Stream.Sorted;

public class book {

	private long id;
	private String name;
	private long pageSize;

	public book(long id, String name, long pageSize) {
		this.id = id;
		this.name = name;
		this.pageSize = pageSize;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", pageSize=" + pageSize + "]";
	}

}
