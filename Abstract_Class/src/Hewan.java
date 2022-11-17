public abstract class Hewan  extends MakhlukHidup{
    
    @Override
    public void makan(){
        System.out.println("Hewan perlu untuk makan agar dapat bertahan hidup");
    }
    public void bernafas(){
        System.out.println("Hewan hidup dengan cara bernafas");
    }

    public abstract void berkembangBiak();
}
