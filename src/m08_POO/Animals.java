package m08_POO;

public abstract class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("El animal está comiendo");
    }

    public void makeSound() {
        System.out.println("El animal esta haciendo un sonido");
    }


}

interface Volador {
    void volar();
}

class Pajaro extends Animals implements Volador {
    public Pajaro(String name) {
        super(name);
    }

    @Override
    public void volar() {
        System.out.println(this.name + " es volador");
    }
}

class Perro extends Animals {
    public Perro(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("El perro está comiendo");
    }
}