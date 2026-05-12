import java.util.ArrayList;
public class Main {
    public static void main(String[] args)throws Exception{
        ArrayList<LayananEkspedisi> daftar = new ArrayList<>();
        daftar.add(new LayananReguler("REG-11", 2, 50, 50, 50));
        daftar.add(new LayananExpress("EXP-22", 5, 10, 10, 10));
        daftar.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        double totalPendapatan = 0.0;
        for (LayananEkspedisi r : daftar){
            r.cetakResi();
            totalPendapatan += r.hitungOngkir();
            if (r instanceof LayananReguler) {
                ((LayananReguler) r).hitungOngkir(true, 25);
            } else if (r instanceof LayananExpress) {
                ((LayananExpress) r).klaimAsuransi(1500000);
            } else {
                ((LayananInternasional) r).cetakManifest();
            }
            System.out.println("------------------------------");
        }
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}
