public class LayananEkspedisi {

    // Menyimpan nomor resi paket
    String nomorResi;

    // Berat asli paket dalam kilogram
    double beratAktualKg;

    // Ukuran paket
    double panjang;
    double lebar;
    double tinggi;

    // Constructor untuk mengisi data paket saat objek dibuat
    LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){

        // this digunakan untuk membedakan variabel objek dengan parameter
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung berat efektif paket
    // Berat efektif diambil dari berat terbesar antara:
    // berat asli atau berat volumetrik
    public double hitungBeratEfektif(){

        // Rumus menghitung berat volumetrik
        double volumetrik = (panjang * lebar * tinggi) / 6000;

        // Jika berat volumetrik lebih besar dari berat asli
        if (volumetrik > this.beratAktualKg){

            // Maka gunakan berat volumetrik
            return volumetrik;

        } else {

            // Kalau tidak, gunakan berat asli
            return this.beratAktualKg;
        }
    }
    
    // Method untuk menampilkan data resi dan berat efektif
    public void cetakResi(){

        System.out.println("Nomor Resi: " + this.nomorResi);

        // Memanggil method hitungBeratEfektif()
        System.out.println("Berat Efektif (kg): " + hitungBeratEfektif());
    }

    // Method untuk menghitung ongkir
    // Masih default 0.0 karena nanti bisa dioverride di class turunan
    public double hitungOngkir(){
        return 0.0;
    }
}