package rplbkLiskov;

class Kendaraan {
    public void nyalakanMesin() {
        System.out.println("Mesin dinyalakan");
    }
}

class Mobil extends Kendaraan {
    // Mobil bisa menyalakan mesin
}

class Sepeda extends Kendaraan {
    @Override
    public void nyalakanMesin() {
        throw new UnsupportedOperationException("Sepeda tidak memiliki mesin");
    }
}

public class ProblemLiskov {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil();
        kendaraan1.nyalakanMesin(); // Berfungsi normal

        Kendaraan kendaraan2 = new Sepeda();
        // Tidak ada try-catch, jadi program akan error ketika sepeda mencoba menyalakan mesin
        kendaraan2.nyalakanMesin(); // Akan menimbulkan error UnsupportedOperationException
    }
}
