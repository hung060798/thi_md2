public class DanhBa {
    private String name;
    private String sdt;
    private String diaChi;
    private String gender;
    private String Nhom;
    private String ngaySinh;
    private String email;


    public DanhBa() {
    }

    public DanhBa(String name, String sdt, String diaChi, String gender, String nhom, String ngaySinh, String email) {
        this.name = name;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gender = gender;
        this.Nhom = nhom;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNhom() {
        return Nhom;
    }

    public void setNhom(String nhom) {
        Nhom = nhom;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "name='" + name + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gender='" + gender + '\'' +
                ", Nhom='" + Nhom + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String ghi(){
        return name + "," + sdt + "," + diaChi + "," + gender + "," + Nhom + ","  + ngaySinh + "," + email;
    }


}
