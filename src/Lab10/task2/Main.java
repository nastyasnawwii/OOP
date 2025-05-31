package Lab10.task2;

public class Main {
    public static void main(String[] args) {
        Playable[] playables = new Playable[2];
        playables[0] = new Guitar();
        playables[1] = new Piano();

        for (Playable playable : playables){
            playable.play();
        }
    }
}