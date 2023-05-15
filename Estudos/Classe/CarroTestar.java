//import java.util.Scanner;

public class CarroTestar {
    public static void main(String [] args){
        //Scanner input = new Scanner(System.in);
        
        //Carro 1
        Carro c1 = new Carro();
        c1.setModelo("Corola");
        c1.setMarca("Toyota");
        c1.setAno(2023);
        c1.setVel(147);
        c1.acelerar(127);
        System.out.println("Velocidade atual: "+ c1.getVel() +"km/h");
        c1.frear(463);
        System.out.println("Velocidade atual: "+ c1.getVel() +"km/h");
        System.out.println("Ano do Veiculo: "+ c1.getAno());
        
    }
}
