package EncapsulationShann;

public class Main {
    public static void main(String[] args) {
        // 1. Persegi
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("=== Persegi ===");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
        System.out.println();

        // 2. Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7);
        System.out.println("=== Lingkaran ===");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas     : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());
        System.out.println();

        // 3. Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(4);
        System.out.println("=== Persegi Panjang ===");
        System.out.println("Panjang  : " + persegiPanjang.getPanjang());
        System.out.println("Lebar    : " + persegiPanjang.getLebar());
        System.out.println("Luas     : " + persegiPanjang.getLuas());
        System.out.println("Keliling : " + persegiPanjang.getKeliling());
        System.out.println();

        // 4. Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(8);
        segitiga.setSisiMiring(10);
        System.out.println("=== Segitiga ===");
        System.out.println("Alas     : " + segitiga.getAlas());
        System.out.println("Tinggi   : " + segitiga.getTinggi());
        System.out.println("Luas     : " + segitiga.getLuas());
        System.out.println("Keliling : " + segitiga.getKeliling());
    }
}