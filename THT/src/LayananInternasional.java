public class LayananInternasional extends LayananEkspedisi{
    String negaraTujuan;
    double nilaiBarangUSD;

    LayananInternasional (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD){
        super (nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }
    @Override
    public double hitungOngkir() {
        double ongkirDasar = hitungBeratEfektif() * 200_000;
        double pajak = 0.0;
 
        if (nilaiBarangUSD > 50) {
            pajak = ongkirDasar * 0.20; 
        }
 
        return ongkirDasar + pajak;
    }
    public void cetakManifest(){
        System.out.println("Manifest Internasiaonal ke " + this.negaraTujuan + " Deklarasi Nilai:$" + this.nilaiBarangUSD);
    }

}
