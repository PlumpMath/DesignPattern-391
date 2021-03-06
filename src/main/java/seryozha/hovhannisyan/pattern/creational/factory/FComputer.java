package seryozha.hovhannisyan.pattern.creational.factory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public abstract class FComputer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }

}
