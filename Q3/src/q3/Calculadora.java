package q3;

import java.util.Scanner;

public class Calculadora {
    //Atributos
    private String tipo;
    private float num1, num2;
    private float result;
    
    //Construtor
    
    Scanner tec = new Scanner(System.in);
    public Calculadora() {
        while (this.getTipo() != "$"){
            System.out.println("Informe os números");
            switch(menu()){
                case "+":
                    this.setResult(this.getNum1() + this.getNum2());
                    System.out.println(this.getResult());
                    break;
                case "-":
                    this.setResult(this.getNum1() - this.getNum2());
                    System.out.println(this.getResult());
                    break;
                case "*":
                    this.setResult(this.getNum1() * this.getNum2());
                    System.out.println(this.getResult());
                    break;
                case "/":
                    this.setResult(this.getNum1() / this.getNum2());
                    System.out.println(this.getResult());
                    break;
                case "$":
                    this.setTipo("$");
                    break;
            }
        } 
    }
    //Métodos
    public String menu(){
        this.setNum1(tec.nextFloat());
        System.out.println("-----------------------------");
        System.out.println("        + - Somar            ");
        System.out.println("        - - Subtrair         ");
        System.out.println("        * - Multiplcar       ");
        System.out.println("        / - Dividir          ");
        System.out.println("        $ - Sair             ");
        System.out.println("-----------------------------");
        this.setTipo(tec.next());
        if (!"$".equals(this.getTipo())) {
            this.setNum2(tec.nextFloat());
        }
        return this.getTipo();
        
    }

    //Métodos Especiais
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public Scanner getTec() {
        return tec;
    }

    public void setTec(Scanner tec) {
        this.tec = tec;
    }
    
}
