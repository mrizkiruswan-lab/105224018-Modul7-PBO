public class LayananExpress extends LayananEkspedisi {

    // Constructor class LayananExpress
    // super digunakan untuk memanggil constructor dari class induk
    LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){

        // Mengirim data ke constructor parent class
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Override method hitungOngkir() dari class induk
    @Override
    public double hitungOngkir(){

        // Ongkir dihitung dari berat efektif x tarif express
        return hitungBeratEfektif() * 30000;
    }

    // Method untuk klaim asuransi barang
    public void klaimAsuransi(double nilaiBarang) {

        // Jika nilai barang lebih dari 1 juta
        if (nilaiBarang > 1000000) {

            // Maka masuk asuransi VIP
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " sedang diproses prioritas");

        } else {

            // Jika di bawah atau sama dengan 1 juta
            // menggunakan proses asuransi standar
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja");
        }
    }
}