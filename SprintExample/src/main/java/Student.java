
public class Student {
	int htno;
	String name;
	Address address;
	public int getHtno() {
	return htno;
	}
	public void setHtno(int htno) {
	this.htno = htno;
	}
	public Student(int htno, String name, Address address) {
	super();
	this.htno = htno;
	this.name = name;
	this.address = address;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public Address getAddress() {
	return address;
	}
	public void setAddress(Address address) {
	this.address = address;
	}
	Student(){
	}
	@Override
	public String toString() {
	return "Student [htno=" + htno + ", name=" + name + ", address=" + address + "]";
	}
	}

