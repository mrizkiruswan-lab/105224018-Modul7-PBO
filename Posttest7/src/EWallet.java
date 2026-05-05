class EWallet extends MetodePembayaran {

    // Overriding
    @Override
    void bayar(double nominal) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + "...");
    }

    // Overloading
    void bayar(double nominal, String nomorHp) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + " dari nomor " + nomorHp + "...");
    }
}