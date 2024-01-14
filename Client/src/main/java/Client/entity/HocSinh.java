package Client.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hocsinh")
public class HocSinh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHS;
	private String tenHS;
	private String tuoi;
	public HocSinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HocSinh(int maHS, String tenHS, String tuoi) {
		super();
		this.maHS = maHS;
		this.tenHS = tenHS;
		this.tuoi = tuoi;
	}
	public int getMaHS() {
		return maHS;
	}
	public void setMaHS(int maHS) {
		this.maHS = maHS;
	}
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return 
		"{\r\n"
		+ "	\"maHS\":" + "'" + maHS + "'" + ",\r\n"
		+ "	\"tenHS\":" + "'" + tenHS + "'" + ",\r\n"
		+ "	\"tuoi\":" + "'" + tuoi + "'" + "\r\n"
		+ "}";
	}
	
	

}
