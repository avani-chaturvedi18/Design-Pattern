package AbstractFactoryDesign;

interface Chair {
    public void designChair();
}

interface Table {
    public void designTable();
}

class PlasticChair implements  Chair {
    @Override
    public void designChair() {
        System.out.println("Designing a high quality plastic chair.");
    }
}

class WoodenChair implements  Chair {
    @Override
    public void designChair() {
        System.out.println("Designing a high quality wooden chair.");
    }
}

class PlasticTable implements Table {
    @Override
    public void designTable() {
        System.out.println("Designing a high quality plastic table.");
    }
}

class WoodenTable implements Table {
    @Override
    public void designTable() {
        System.out.println("Designing a high quality wooden table.");
    }
}

interface FurnitureFactory {
    public Table createTable(String materialType);
    public Chair createChair(String materialType);
}

class WoodenFactory implements FurnitureFactory {

    @Override
    public Table createTable(String materialType) {
        if(materialType.equalsIgnoreCase("wooden")) {
            return new WoodenTable();
        }
        return null;
    }

    @Override
    public Chair createChair(String materialType) {
        if(materialType.equalsIgnoreCase("wooden")) {
            return new WoodenChair();
        }
        return null;
    }
}

class PlasticFactory implements FurnitureFactory {
    @Override
    public Table createTable(String materialType) {
        if(materialType.equalsIgnoreCase("plastic")) {
            return new PlasticTable();
        }
        return null;
    }

    @Override
    public Chair createChair(String materialType) {
        if (materialType.equalsIgnoreCase("plastic")) {
            return new PlasticChair();
        }
        return null;
    }
}


public class AbstractFactory2 {
    public static void main(String[] args) {
        FurnitureFactory psf = new PlasticFactory();
        FurnitureFactory wdf = new WoodenFactory();
        Chair c1 = psf.createChair("plastic");
        Chair c2 = wdf.createChair("wooden");
        Table t1 = psf.createTable("plastic");
        Table t2 = wdf.createTable("wooden");
        c1.designChair();
        c2.designChair();
        t1.designTable();
        t2.designTable();
    }
}
