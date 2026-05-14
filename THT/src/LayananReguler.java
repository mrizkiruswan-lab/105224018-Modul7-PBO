public class LayananReguler extends LayananEkspedisi {

    // Constructor untuk layanan reguler
    LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){

        // Memanggil constructor dari class induk
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Override method hitungOngkir() dari class parent
    @Override
    public double hitungOngkir(){

        // Ongkir reguler = berat efektif x tarif reguler
        return hitungBeratEfektif() * 15000;
    }

    // Overloading method hitungOngkir()
    // Method ini punya parameter tambahan:
    // status member dan jarak pengiriman
    public double hitungOngkir(boolean isMember, int jarakKM){

        // Mengambil ongkir dasar dari method hitungOngkir()
        double tarifDasar = hitungOngkir();

        // Jika pelanggan adalah member
        if (isMember){

            // Dapat diskon 10%
            tarifDasar -= 0.1 * tarifDasar;
        }

        // Tambahan biaya berdasarkan jarak
        double surcharge = 500 * jarakKM;

        // Total ongkir = tarif dasar + biaya tambahan jarak
        return tarifDasar + surcharge;
    }

}