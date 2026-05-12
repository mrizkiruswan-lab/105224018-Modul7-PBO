public class LayananExpress extends LayananEkspedisi {
    LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    @Override
    public double hitungOngkir(){
        return hitungBeratEfektif() * 30000;
    }

    public void klaimAsuransi(double nilaiBarang) {
        if (nilaiBarang > 1000000) {
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " sedang diproses prioritas");
        } else {
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja");
        }
    }
}
