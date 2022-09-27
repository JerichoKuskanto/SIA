package prak.pbo.sem3.Animal;

public abstract class data implements statusinterface {

    String name;
    int age;
    String food;
    String gender;
    boolean life;

    public data(String name, int age, String food, String gender, int life) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.life = isAlive(life);
    }

    public String printSound(String nama) {
        return "ini di override";
    }

    abstract String printData();

    public boolean isAlive(int life) {
        if (life == Alive) {
            return true;
        }
        return false;
    }

}
