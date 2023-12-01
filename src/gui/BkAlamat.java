package gui;

public class BkAlamat {
    String Id, Nama, JK, Telp, Alamat;

    public BkAlamat(String Id, String Nama, String JK, String Telp, String Alamat) {
        this.Id = Id;
        this.Nama = Nama;
        this.JK = JK;
        this.Telp = Telp;
        this.Alamat = Alamat;
    }

    public BkAlamat() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public String getTelp() {
        return Telp;
    }

    public void setTelp(String Telp) {
        this.Telp = Telp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    
}
