package q1;

import java.util.Scanner;

public class NotaFiscal {
    //Atributos
    private String numPeca, nomePeca;
    private String descPeca;
    private int quantComprada;
    private float preco,total;
    private int stat;
    
    Scanner tec = new Scanner(System.in);
    
    //Construtor
    
    public NotaFiscal() {
        do {
            switch(menu()){
                case 1:
                    cadNota();
                    break;
                case 2:
                    mostrarDados();
                    break;
                case 3:
                    this.stat = 3;
                    break;
                default:
                    System.out.println("Informe a opção correta!!!\n");
            } 
        }while (stat != 3);
    }
    //Métodos
    
    public int menu(){
        System.out.println("1 - Cadastrar dados da Nota Fiscal");
        System.out.println("2 - Mostrar dados e valor da Nota Fiscal");
        System.out.println("3 - Sair do Programa");
        int num = tec.nextInt();
        return num;
    }
    
    public void cadNota(){
        System.out.println("Informe o nome do produto");
        setNomePeca(tec.next());
        System.out.println("Informe o número do produto");
        setNumPeca(tec.next());
        System.out.println("Descrição do Produto (" + this.getNomePeca()+ ")");
        setDescPeca(tec.next());
        System.out.println("Informe a quantidade de (" + this.getNomePeca() + ") compradas");
        setQuantComprada(tec.nextInt());
        System.out.println("Informe o preço do produto (" + this.getNomePeca() + ")");
        setPreco(tec.nextFloat());
        this.total =  (int) (getPreco() * getQuantComprada());
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + this.getNomePeca());
        System.out.println("Número: " + this.getNumPeca());
        System.out.println("Descrição: " + this.getDescPeca());
        System.out.println("Quantidade: " + this.getQuantComprada());
        System.out.printf("Preço Unitário: R$ %.2f\n",this.getPreco());
        System.out.printf("Preço Total: R$ %.2f\n", this.getTotal());
    }

    //Métodos Especiais

    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }
    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }
    public String getNumPeca() {
        return numPeca;
    }

    public void setNumPeca(String numPeca) {
        this.numPeca = numPeca;
    }

    public String getDescPeca() {
        return descPeca;
    }

    public void setDescPeca(String descPeca) {
        this.descPeca = descPeca;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
