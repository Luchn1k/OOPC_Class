package Day4;

public class BuilderPattern {
}

class Computer{
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    public Computer(String cpu, String ram, String storage, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;

        public Builder(){

        }
        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public  Builder ram(String ram){
            this.ram = ram;
            return this;
        }
        public  Builder storage(String storage){
            this.storage = storage;
            return this;
        }

        public  Builder gpu(String gpu){
            this.gpu = gpu;
            return this;
        }
        public Computer build(){
            return  new Computer(cpu,ram,storage,gpu);
        }

    }
}

class TestBuilder{
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().
                cpu("i7").
                gpu("1060ti").
                ram("8gb").build();

        Computer computer2 =new  Computer.Builder().storage("dasdasd").build();
        System.out.println(computer2);
        
        Computer computer3 = new Computer(null,null,"asdasdas",null);
    }
}