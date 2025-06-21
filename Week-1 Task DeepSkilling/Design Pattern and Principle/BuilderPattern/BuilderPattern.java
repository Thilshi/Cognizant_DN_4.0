class Computer {
    // Required and optional fields
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private constructor accepts Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // To print Computer configuration
    public void displayConfig() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "None"));
        System.out.println("OS: " + (operatingSystem != null ? operatingSystem : "None"));
        System.out.println("----------------------------");
    }

    // Static Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "512GB SSD")
                                  .build();
        basicComputer.displayConfig();

        // Gaming computer
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB", "1TB SSD")
                                  .setGraphicsCard("NVIDIA RTX 4080")
                                  .setOperatingSystem("Windows 11 Pro")
                                  .build();
        gamingComputer.displayConfig();

        // Developer computer
        Computer devComputer = new Computer.Builder("Intel i7", "16GB", "1TB HDD")
                               .setOperatingSystem("Ubuntu Linux")
                               .build();
        devComputer.displayConfig();
    }
}