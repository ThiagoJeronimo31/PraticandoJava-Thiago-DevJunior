package imc;

public class CalcularImc {
private double altura;
private double peso;
private String classifi;
private char s;
private double imc;


public void GUI_Imc(){
 limpar();
}
public void limpar(){
    this.altura = 0;
    this.peso = 0;
    this.classifi = "";
    this.s = ' ';
    this.imc = 0;
}

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getS() {
        return s;
    }

    public void setS(char s) {
        this.s = s;
    }

    public String getClassifi() {
        return classifi;
    }

    public double getImc() {
        return imc;
    }

      private void CalculandoImc(){
      this.imc = this.peso/ Math.pow(this.altura,2);
      
    }

    private void MostrandoClassifica(){
    
      if (this.s =='F') {
      if(this.imc < 19.0){
          this.classifi = "ABAIXO DO PESO";
      }
      else if (this.imc <= 23.9 ){
          this.classifi = "PESO IDEAL";
      }
      else if (this.imc <= 28.9 ){
          this.classifi = "OBESIDADE LEVE";
      }
      else if (this.imc <= 38.9 ){
          this.classifi = "OBESIDADE MODERADA ";
      }
      
      else{
          this.classifi = "OBESIDADE MORBIDA";
              
              }
    }
    
    else if (this.s == 'M')
    {
      if(this.imc <= 18.5){
          this.classifi = "ABAIXO DO PESO";
      }
      else if (this.imc <= 24.9 ){
          this.classifi = "PESO IDEAL";
      }
      else if (this.imc <= 29.9 ){
          this.classifi = "OBESIDADE LEVE";
      }
      else if (this.imc <= 39.9 ){
          this.classifi = "OBESIDADE MODERADA";
      }
      else{
          this.classifi = "OBESIDADE MORBIDA";
      }
    
              
              }
      
    else{
        this.classifi = "ERRO!!!";
    }
    
    }
    
    public void Calc_Imc_Classifi(){
        CalculandoImc();
        MostrandoClassifica();
        
        
    }
    
    }




