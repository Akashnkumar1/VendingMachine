package Model;

public class Machine {
    private String machineID;
    private String machineName;
    private String machineLocation;

    Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Machine(String machineID, String machineName, String machineLocation) {
        this.machineID = machineID;
        this.machineName = machineName;
        this.machineLocation = machineLocation;

    }

    public void addCustomer(String userName, String name, String email, String preferredPaymentMethod){
        customer = new Customer(userName, name, email, this.machineLocation, preferredPaymentMethod);
    }

    public String getMachineID() {
        return machineID;
    }

    public void setMachineID(String machineID) {
        this.machineID = machineID;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineLocation() {
        return machineLocation;
    }

    public void setMachineLocation(String machineLocation) {
        this.machineLocation = machineLocation;
    }
}
