public class Main {

    public static void main(String[] args) {
        AnimalSounds dog = new AnimalSounds(new Dog());
        System.out.println("Dog should say " + dog.howToSpeak());

        AnimalSounds cat = new AnimalSounds(new Cat());
        System.out.println("cat should say " + cat.howToSpeak());

        AnimalSounds bird = new AnimalSounds(new Bird());
        System.out.println("bird should say " + bird.howToSpeak());
    }
}
