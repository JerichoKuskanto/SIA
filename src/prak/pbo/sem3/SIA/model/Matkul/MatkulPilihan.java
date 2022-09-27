package prak.pbo.sem3.SIA.model.Matkul;

public class MatkulPilihan extends Matakuliah {

    private int minimum;

    public MatkulPilihan(int minimum, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.minimum = minimum;
    }

    public MatkulPilihan() {

    }

    @Override
    public String toString() {
        return  "minimum: " + minimum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

}
