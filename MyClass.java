import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        // ----------- Nilai Tugas -----------


        // Masukkan banyak nilai tugas
        System.out.print("Masukkan jumlah banyak nilai tugas = ");
        int banyak = sc.nextInt();

        // nilai tertinggi  bernilai 0
        int nilai_tertinggi = 0;

        // Perulangan menginputkan banyak nilai tugas
        for (int i = 1; i <= banyak; i++) {
            // memasukkan nilai tugas
            System.out.print("Masukkan nilai Tugas "+i+ " = " );
            int nilai_tugas = sc.nextInt();

            // jika nilai tugas lebih besar dari nilai tinggi
            if (nilai_tugas > nilai_tertinggi) {
                nilai_tertinggi = nilai_tugas;
            }
        }

        // menghasilkan nilai paling tinggi
        System.out.println("Nilai Tertinggi adalah " +nilai_tertinggi);

        
        // ----------- Nilai Ulangan -----------


        // Masukkan banyak nilai ulangan        
        System.out.print("Masukkan jumlah banyak nilai ulangan = ");
        int banyak_nilai_ulangan = sc.nextInt();

        // nilai tertinggi  bernilai 0
        int nilai_tinggi = 0;

        // Perulangan menginputkan banyak nilai ulangan
        for (int j = 1; j <= banyak_nilai_ulangan; j++) {
            // memasukkan nilai ulangan
            System.out.print("Masukkan nilai ulangan "+j+ " = " );
            int nilai_ulangan = sc.nextInt();

            // jika nilai tugas lebih besar dari nilai ulangan
            if (nilai_ulangan > nilai_tinggi) {
                nilai_tinggi = nilai_ulangan;
            }
        }

        // menghasilkan nilai ulangan paling tinggi
        System.out.println("Nilai Tertinggi adalah " +nilai_tinggi);

        // masukkan nilai UTS
        System.out.print("Masukkan nilai UTS = ");
        int nilai_UTS = sc.nextInt();


        // Masukkan nilai UAS
        System.out.print("Masukkan nilai UAS = ");
        int nilai_UAS = sc.nextInt();
        

        // Jika nilai UTS atau nilai UAS = 0
        if (nilai_UTS == 0 || nilai_UAS == 0) {
            // maka tidak naik tingkat
            System.out.println("Maaf anda tidak naik tingkat");
        }

        // deklarasi variable rata-rata
        int rata = (nilai_tertinggi+nilai_tinggi+nilai_UTS+nilai_UAS)/4;

        // jika nilai rata-rata lebih dari 70
        if( rata >= 70) {
            // Mahasiswa naik tingkat
            System.out.print("Selamat anda naik tingkat");
        }else {
            // Mahasiswa tidak naik tingkat
            System.out.println("Maaf anda tidak naik tingkat");
        }


    }
}