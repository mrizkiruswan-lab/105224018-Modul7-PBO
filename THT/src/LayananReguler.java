public class LayananReguler extends LayananEkspedisi {
    LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    @Override
    public double hitungOngkir(){
        return hitungBeratEfektif() * 15000;
    }
    //Overloading
    public double hitungOngkir(boolean isMember, int jarakKM){
        double tarifDasar = hitungOngkir();
        if (isMember){
            tarifDasar -= 0.1 * tarifDasar; //diskon 10% buat member
        }
        double surcharge = 500 * jarakKM; //tambahan biaya berdasarkan jarak
        return tarifDasar + surcharge;
    }

}
