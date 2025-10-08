public class auto extends Vehiculo{

    private int numPuertas;

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void informacion(){
        System.out.println("MARCA: "+this.getMarca()+" MODELO: "+this.getModelo()+" AÑO: "+this.getAnio()+" PUERTAS: "+this.numPuertas);
    }




}
