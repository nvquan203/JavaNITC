public class Computer {
    private CPU cpu;
    private RAM ram;
    private Mainboard mainboard;
    private ID id;
    private int sl;
    private float price;

    public Computer(CPU cpu, RAM ram, Mainboard mainboard, ID id, int sl) {
        this.cpu = cpu;
        this.ram = ram;
        this.mainboard = mainboard;
        this.id = id;
        this.sl = sl;
        this.price = cpu.getPrice() + ram.getPrice() + mainboard.getPrice();
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public ID getId() {
        return id;
    }

    public int getSl() {
        return sl;
    }

    public float getPrice() {
        return price;
    }
}