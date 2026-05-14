public class LayananInternasional extends LayananEkspedisi{

    // Menyimpan negara tujuan pengiriman
    String negaraTujuan;

    // Menyimpan nilai barang dalam USD
    double nilaiBarangUSD;

    // Constructor untuk mengisi data pengiriman internasional
    LayananInternasional (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD){

        // Memanggil constructor dari class induk
        super (nomorResi, beratAktualKg, panjang, lebar, tinggi);

        // Mengisi data tambahan khusus internasional
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    // Override method hitungOngkir() dari class parent
    @Override
    public double hitungOngkir() {

        // Ongkir dasar dihitung dari berat efektif x tarif internasional
        double ongkirDasar = hitungBeratEfektif() * 200_000;

        // Nilai awal pajak
        double pajak = 0.0;
 
        // Jika nilai barang lebih dari 50 USD
        if (nilaiBarangUSD > 50) {

            // Maka dikenakan pajak 20% dari ongkir dasar
            pajak = ongkirDasar * 0.20; 
        }
 
        // Total ongkir = ongkir dasar + pajak
        return ongkirDasar + pajak;
    }

    // Method untuk mencetak manifest pengiriman internasional
    public void cetakManifest(){

        System.out.println("Manifest Internasiaonal ke " + this.negaraTujuan + " Deklarasi Nilai:$" + this.nilaiBarangUSD);
    }

}