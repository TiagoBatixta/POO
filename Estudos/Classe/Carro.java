
public class Carro{
    
    //atributos
    private String modelo;
    private String marca;
    private int ano;
    private int vel;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(ano >=1950 && ano <=2023){
        this.ano = ano;
        }
        else{
            System.out.println("Ano invalido");
        }
    }
    public int getVel(){
        if(vel>0){
        return vel;
        }
        else{
            return vel = 0;
        }
    }
    public void setVel(int vel) {
        if(vel >0 && vel <380){
        this.vel = vel;
        }
        else{
            System.out.println("Velocidade Invalida");
        }
    }

    //metodos
    void acelerar(int aceleracao){
        vel+=aceleracao;
    }
    void frear(int reduzir){
        vel-=reduzir;
    }
    void buzinar(){
        System.out.println("Buzz");
    }
}






