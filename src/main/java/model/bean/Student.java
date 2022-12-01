package model.bean;

public class Student {
	private String MSV;
    private String hoten;
    private String gioitinh;
    private String khoa;

    public Student(String MSV, String hoten, String gioitinh, String khoa) {
    	this.MSV = MSV;
    	this.hoten = hoten;
    	this.gioitinh = gioitinh;
    	this.khoa = khoa;
    }
    
    public String getMSV() {
    	return this.MSV;
    }
    
    public String getHoten() {
    	return this.hoten;
    }
    public String getGioitinh() {
    	return this.gioitinh;
    }
    public String getKhoa() {
    	return this.khoa;
    }
    public void setMSV(String MSV) {
    	this.MSV = MSV;
    }
    public void setHoten(String hoten) {
    	this.hoten = hoten;
    }
    public void setGioitinh(String gioitinh) {
    	this.gioitinh = gioitinh;
    }
    public void setKhoa(String khoa) {
    	this.khoa = khoa;
    }
}