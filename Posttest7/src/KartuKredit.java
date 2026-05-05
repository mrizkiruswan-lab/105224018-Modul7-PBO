class KartuKredit extends MetodePembayaran {

    // Overriding
    @Override
    void bayar(double nominal) {
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal + "...");
    }

    // Method khusus
    void verifikasiPIN() {
        System.out.println("Memverifikasi PIN Kartu Kredit... BERHASIL!");
    }
}