package vo;

import java.io.Serializable;
import java.util.List;

import entity.User;

public class DepartmentVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer did;
	private String name;
	private List<User> users;

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "DepartmentVO [did=" + did + ", name=" + name + ", users=" + users + "]";
	}

}
