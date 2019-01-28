package entity;

public class department {
	private String name;
	private Integer did;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "department [name=" + name + ", did=" + did + "]";
	}
	
}
