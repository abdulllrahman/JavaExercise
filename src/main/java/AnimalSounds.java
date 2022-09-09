public class AnimalSounds {
    private Animal animal;

    public AnimalSounds(Animal animalInstance){
        this.animal = animalInstance;
    }

    public String howToSpeak(){
        return animal.howToSpeak();
    }
}
