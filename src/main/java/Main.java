public class Main {

    public static void main(String[] args) {
        AnimalSounds dog = new AnimalSounds(new Dog());
        System.out.println("Dog should say" + dog.howToSpeak());

        AnimalSounds cat = new AnimalSounds(new Cat());
        System.out.println("Dog should say" + cat.howToSpeak());

        AnimalSounds bird = new AnimalSounds(new Bird());
        System.out.println("Dog should say" + bird.howToSpeak());
    }
}
