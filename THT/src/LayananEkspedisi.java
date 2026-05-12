public class LayananEkspedisi {
    String nomorResi;
    double beratAktualKg;
    double panjang;
    double lebar;
    double tinggi;

    LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungBeratEfektif(){
        double volumetrik = (panjang * lebar * tinggi) / 6000;
        if (volumetrik > this.beratAktualKg){
            return volumetrik;
        } else {
            return this.beratAktualKg;
        }
    }
    
    public void cetakResi(){
        System.out.println("Nomor Resi: " + this.nomorResi);
        System.out.println("Berat Efektif (kg): " + hitungBeratEfektif());
    }

    public double hitungOngkir(){
        return 0.0;
    }
}
