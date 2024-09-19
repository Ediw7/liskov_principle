package rplbkLiskov;

// Abstraksi untuk kendaraan
interface KendaraanBermesin {
    void nyalakanMesin();
}

// Kelas MobilBaru mengimplementasikan KendaraanBermesin
class MobilBaru implements KendaraanBermesin {
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil baru dinyalakan");
    }
}

// Kelas Sepeda tidak mengimplementasikan KendaraanBermesin karena tidak memiliki mesin
class SepedaBaru {
    public void KayuhSepeda() {
        System.out.println("Sepeda sedang dikayuh");
    }
}

public class SolutionLiskov {
    public static void main(String[] args) {
        KendaraanBermesin kendaraan1 = new MobilBaru();
        kendaraan1.nyalakanMesin(); // Berfungsi normal untuk mobil

        SepedaBaru sepeda = new SepedaBaru();
        sepeda.KayuhSepeda(); // Berfungsi normal untuk sepeda tanpa error
    }
}
