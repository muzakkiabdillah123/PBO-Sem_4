
interface Animal {
    public void animalSound();

    public void sleep();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("Oink");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Cat implements Animal {
    public void animalSound() {
        System.out.println("Meow");
    }

    public void sleep() {
        System.out.println("Sss");
    }
}

class interfaces {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
