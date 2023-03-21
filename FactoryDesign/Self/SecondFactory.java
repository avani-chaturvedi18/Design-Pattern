package FactoryDesign.Self;

abstract class Bill {
    private int billId;
    private int bill_unit;
    private int bill_unitRate;

    Bill(int bill_unit, int bill_unitRate) {
        this.bill_unit = bill_unit;
        this.bill_unitRate = bill_unitRate;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }
    public int getBillId() {
        return billId;
    }

    public void setBill_unit(int bill_unit) {
        this.bill_unit = bill_unit;
    }
    public int getBill_unit() {
        return bill_unit;
    }

    public void setBill_unitRate(int bill_unitRate) {
        this.bill_unitRate = bill_unitRate;
    }

    public int getBill_unitRate() {
        return bill_unitRate;
    }

    public abstract float calculateBill();
    public abstract void printBill();
}

class MobileBill extends Bill{
    int serviceCharges;
    int dataTopUpCharges;


    MobileBill(int serviceCharges, int dataTopUpCharges,int bill_unit, int bill_unitRate) {
        super(bill_unit,bill_unitRate);
        this.serviceCharges = serviceCharges;
        this.dataTopUpCharges = dataTopUpCharges;
    }

    @Override
    public float calculateBill() {
        return (super.getBill_unit())*(super.getBill_unitRate()) + serviceCharges + dataTopUpCharges;
    }

    @Override
    public void printBill() {
        System.out.println("Total bill is: "+calculateBill());
    }
}

class GasBill extends Bill {
    int subsidy;
    GasBill(int bill_unit, int bill_unitRate,int subsidy) {
        super(bill_unit, bill_unitRate);
        this.subsidy = subsidy;
    }

    @Override
    public float calculateBill() {
        return (super.getBill_unit())*(super.getBill_unitRate()) - subsidy;
    }

    @Override
    public void printBill() {
        System.out.println("Total bill is: "+calculateBill());
    }
}

class ElectricityBill extends Bill {
    int companyPremium;
    ElectricityBill(int bill_unit, int bill_unitRate,int companyPremium) {
        super(bill_unit, bill_unitRate);
        this.companyPremium = companyPremium;
    }

    @Override
    public float calculateBill() {
        return (super.getBill_unit())*(super.getBill_unitRate())+companyPremium;
    }

    @Override
    public void printBill() {
        System.out.println("Total bill is: "+calculateBill());
    }
}

public class SecondFactory {
    public static void main(String[] args) {
        Bill a = new MobileBill(100,10,7,8);
        a.printBill();
        Bill b = new GasBill(100,10,200);
        b.printBill();

    }
}