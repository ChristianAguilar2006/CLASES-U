public class motocicleta extends Vehiculo{
    private String tipoLlantas;

    public String getTipoLlantas() {
        return tipoLlantas;
    }

    public void setTipoLlantas(String tipoLlantas) {
        this.tipoLlantas = tipoLlantas;
    }

    public void informacion(){
        System.out.println("MARCA: "+this.getMarca()+" MODELO: "+this.getModelo()+" AÑO: "+this.getAnio()+" PUERTAS: "+this.tipoLlantas);
    }


}
