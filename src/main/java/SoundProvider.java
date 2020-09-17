public class SoundProvider {

    AnimalRepository provider;

    public SoundProvider() {
    }

    public SoundProvider(AnimalRepository provider) {
        this.provider = provider;
    }

    public String printElement(String animal) {
        String sound = provider.getSound(animal);
        return sound;
    }

}
