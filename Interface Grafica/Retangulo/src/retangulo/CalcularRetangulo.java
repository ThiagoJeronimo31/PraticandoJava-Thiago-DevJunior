package retangulo;

public class CalcularRetangulo {
 
// variaveis de instancia
private double ladoA;
private double ladoB;
private double area;
private double perimetro;


public CalcularRetangulo(){

this.ladoA = 0;

this.ladoB = 0;

this.area = 0;

this.perimetro = 0;
}

// metodos acessores/ modificadores gets/sets

public double getLadoA(){
    return this.ladoA;
}

public void setLadoA(double ladoA){
    this.ladoA = ladoA;
}
public double getLadoB(){
    return this.ladoB;
}

public void setLadoB(double ladoB){
    this.ladoB = ladoB;
}

public double getPerimetro(){
    return this.perimetro;
}

public double getArea(){
    return this.area;
}

public void calcularPerimetro(){
    this.perimetro = 2.0 * this.ladoA + 2.0 * this.ladoB;
}

public void calcularArea(){
    this.area = this.ladoA * this.ladoB;
}






}
