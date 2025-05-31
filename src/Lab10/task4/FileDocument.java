package Lab10.task4;

public class FileDocument implements Readable, Writable{
    @Override
    public void read() {
        System.out.println("Reading from file");
    }

    @Override
    public void write() {
        System.out.println("Writing to file");
    }
}
