package prak.pbo.sem3.Animal;

public class Main {

    public static void main(String[] args) {
        hewan[] data = new hewan[4];
        data[0] = new hewan("Dog", "Fiver", 10, "daging", "male", 1);
        data[1] = new hewan("Cat", "Jotaro", 7, "ikan", "female", 0);
        data[2] = new hewan("Duck", "Luffy", 4, "roti", "male", 1);
        data[3] = new hewan("Horse", "Godai", 7, "wortel", "female", 1);

        for (int i = 0; i < data.length; i++) {
            data[i].printData();
            System.out.println("suara hewan tersebut " + data[i].printSound(data[i].jenis));
        }

    }
}
