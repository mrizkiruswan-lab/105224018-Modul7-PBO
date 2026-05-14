import java.util.ArrayList;

public class Main {

    public static void main(String[] args)throws Exception{

        // Membuat ArrayList untuk menyimpan berbagai jenis layanan ekspedisi
        ArrayList<LayananEkspedisi> daftar = new ArrayList<>();

        // Menambahkan data layanan reguler
        daftar.add(new LayananReguler("REG-11", 2, 50, 50, 50));

        // Menambahkan data layanan express
        daftar.add(new LayananExpress("EXP-22", 5, 10, 10, 10));

        // Menambahkan data layanan internasional
        daftar.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        // Variabel untuk menyimpan total seluruh pendapatan ongkir
        double totalPendapatan = 0.0;

        // Perulangan untuk membaca semua data layanan di ArrayList
        for (LayananEkspedisi r : daftar){

            // Menampilkan resi dan berat efektif paket
            r.cetakResi();

            // Menambahkan ongkir ke total pendapatan
            totalPendapatan += r.hitungOngkir();

            // Mengecek apakah objek termasuk layanan reguler
            if (r instanceof LayananReguler) {

                // Downcasting ke LayananReguler
                // lalu memanggil method overloaded hitungOngkir()
                ((LayananReguler) r).hitungOngkir(true, 25);

            // Mengecek apakah objek termasuk layanan express
            } else if (r instanceof LayananExpress) {

                // Downcasting ke LayananExpress
                // lalu memanggil method klaimAsuransi()
                ((LayananExpress) r).klaimAsuransi(1500000);

            } else {

                // Jika bukan reguler atau express,
                // berarti termasuk layanan internasional

                // Downcasting ke LayananInternasional
                // lalu memanggil method cetakManifest()
                ((LayananInternasional) r).cetakManifest();
            }

            // Garis pemisah output
            System.out.println("------------------------------");
        }

        // Menampilkan total seluruh pendapatan
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}