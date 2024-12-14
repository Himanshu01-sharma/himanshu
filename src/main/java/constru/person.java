package constru;

public class person {
private String name ;
private int persionid;
private Certi certi;
public person(String name ,int personid,Certi certi) {
	this.name = name ;
	this.persionid = persionid;
	this.certi = certi;
	
}
@Override
public String toString() {
	return "person [name=" + name + ", persionid=" + persionid + ", certi=" + certi + "]";
}



}

