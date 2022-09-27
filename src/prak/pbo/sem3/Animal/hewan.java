package prak.pbo.sem3.Animal;

public class hewan extends data implements statusinterface {

    String jenis;

    public hewan(String jenis, String name, int age, String food, String gender, int life) {
        super(name, age, food, gender, life);
        this.jenis = jenis;
    }

    @Override
    String printData() {
        return jenis + " " + name + " " + age + " " + food + " " + gender + " " + life;
    }

    @Override
    public String printSound(String name) {
        if (name.equals("Dog")) {
            return "woof";
        } else if (name.equals("Cat")) {
            return "meow";
        } else if (name.equals("Duck")) {
            return "quack";
        } else if (name.equals("Horse")) {
            return "hiegghh";
        }
        return "";
    }
}
