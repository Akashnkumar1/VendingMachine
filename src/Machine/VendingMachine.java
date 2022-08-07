package Machine;

import Model.Machine;
import Model.Product;

import java.util.Random;

public class VendingMachine {

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    Machine machine;//has a rel with machine as a object
    public void addMachine(String machineName, String machineLocation){
        machine = new Machine(genRandMachineId(), machineName, machineLocation);
    }

    public String genRandMachineId(){
        Random random = new Random();
        int leftlimit = 97;
        int rightlimit = 122;
        return random.ints(leftlimit, rightlimit + 1).limit(10).
                collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
