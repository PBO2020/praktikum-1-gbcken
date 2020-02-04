public class ken {

    private String nik;
	private String nama;
	private String ttl;
        private String jk;
        private int goldar;

    public ken(String nik,String nama,String ttl,String jk,int goldar) {
        this.nik = nik;
        this.nama = nama;
        this.ttl = ttl;
        this.jk = jk;
        this.goldar = goldar;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public int getGoldar() {
        return goldar;
    }

    public void setGoldar(int goldar) {
        this.goldar = goldar;
    }


	public void cetak(){ 
    System.out.println("Informasi");  
    System.out.println("NIK           : " + getNik());
    System.out.println("Nama          : " + getNama());
    System.out.println("TTL           : " + getTtl());
    System.out.println("Jenis Kelamin : " + getJk());
    System.out.println("Golongan Darah: " + getGoldar());
  }

}