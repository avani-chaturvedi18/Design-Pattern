package BuilderDesign;

class Computer {
    private static int compID = 100;
    Computer() {
        compID++;
    }
    private int HDD;
    private int RAM_Size;
    private String processor_Make;
    private String processor_Type;
    private float monitorSize;
    private String monitorType;
    private String osConfig;
    private String deviceDriver;

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }
    public void setRAM_Size(int RAM_Size) {
        this.RAM_Size = RAM_Size;
    }
    public void setProcessor_Type(String processor_Type) {
        this.processor_Type = processor_Type;
    }
    public void setProcessor_Make(String processor_Make) {
        this.processor_Make = processor_Make;
    }
    public void setMonitorSize(float monitorSize) {
        this.monitorSize = monitorSize;
    }
    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }
    public void setOsConfig(String osConfig) {
        this.osConfig = osConfig;
    }
    public void setDeviceDriver(String deviceDriver) {
        this.osConfig = osConfig;
    }

    public String toString() {
        System.out.println("--------------SPECS OF THE COMPUTER-----------------");
        System.out.println("RAM SIZE: "+RAM_Size+" GB");
        System.out.println("HDD SIZE: "+HDD+" GB");
        System.out.println("MONITOR SIZE: "+monitorSize+" inch");
        System.out.println("MONITOR TYPE: "+monitorType);
        System.out.println("PROCESSOR MAKE: "+processor_Make);
        System.out.println("PROCESSOR TYPE: "+processor_Type);
//        System.out.println("DEVICE DRIVER: "+deviceDriver);
        return "";
    }
}

abstract class ComputerBuilder {
    protected Computer c1;
    ComputerBuilder() {
        c1 = new Computer();
    }
    public abstract void buildHDD();
    public abstract void buildRAM_Size();
    public abstract void buildProcessor_Make();
    public abstract void buildMonitorSize();
    public abstract void buildMonitorType();
    public abstract void buildOsConfig();
    public abstract void buildDeviceDriver();
    public abstract void buildProcessorType();
    public Computer getComputer() {
        return c1;
    }
}

class PersonalComputer extends ComputerBuilder {

    @Override
    public void buildHDD() {
        c1.setHDD(512);
    }

    @Override
    public void buildRAM_Size() {
        c1.setRAM_Size(16);
    }

    @Override
    public void buildProcessor_Make() {
        c1.setProcessor_Make("Intel");
    }

    @Override
    public void buildMonitorSize() {
        c1.setMonitorSize(15.6f);
    }

    @Override
    public void buildMonitorType() {
        c1.setMonitorType("OLED");
    }

    @Override
    public void buildOsConfig() {
        c1.setOsConfig("Windows");
    }

    @Override
    public void buildDeviceDriver() {
        c1.setDeviceDriver("C DRIVE,D DRIVE");
    }

    @Override
    public void buildProcessorType() {
        c1.setProcessor_Type("Octa-Core");
    }
}

class ServerComputer extends ComputerBuilder {

    @Override
    public void buildHDD() {
        c1.setHDD(10240);
    }

    @Override
    public void buildRAM_Size() {
        c1.setRAM_Size(128);
    }

    @Override
    public void buildProcessor_Make() {
        c1.setProcessor_Make("AMD");
    }

    @Override
    public void buildMonitorSize() {
        c1.setMonitorSize(16.0f);
    }

    @Override
    public void buildMonitorType() {
        c1.setMonitorType("LCD");
    }

    @Override
    public void buildOsConfig() {
        c1.setOsConfig("Linux");
    }

    @Override
    public void buildDeviceDriver() {
        c1.setDeviceDriver("Hard Disk Drive Driver");
    }

    @Override
    public void buildProcessorType() {
        c1.setProcessor_Type("Hexa-Core");
    }
}

class HardwareEngineer {
    private ComputerBuilder cb;
    public void setComputerBuilder(ComputerBuilder c) {
        cb = c;
    }
    public void configureComputer() {
        cb.buildHDD();
        //cb.buildDeviceDriver();
        cb.buildMonitorSize();
        cb.buildOsConfig();
        cb.buildMonitorType();
        cb.buildProcessor_Make();
        cb.buildProcessorType();
        cb.buildRAM_Size();
    }
    public Computer getComputer() {
        return cb.getComputer();
    }
}

public class BuilderDesign2 {
    public static void main(String[] args) {
        HardwareEngineer h1 = new HardwareEngineer();
        ComputerBuilder c1 = new ServerComputer();
        ComputerBuilder c2 = new PersonalComputer();
        h1.setComputerBuilder(c2);
        h1.configureComputer();
        Computer c3 = h1.getComputer();
        System.out.println(c3);
    }
}