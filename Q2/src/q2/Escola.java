
package q2;

import java.util.Scanner;

public class Escola {

    private float n1, n2, trab,media;
    private int matricula;
    private String nome;
    private boolean k;

    Scanner tec = new Scanner(System.in);
    public Escola() {         
            System.out.println("Informe seu Nome:");
            setNome(tec.next());
            System.out.println("Informe a Matrícula:");
            setMatricula(tec.nextInt());
            System.out.println("Informe a Nota da 1ª Prova:");
            setN1(tec.nextFloat());
            System.out.println("Informe a Nota da 2ª Prova:");
            setN2(tec.nextFloat());
            System.out.println("Informe a Nota do Trabalho:");
            setTrab(tec.nextFloat());
            this.setMedia((this.getN1() * 0.3f) + (this.getN2() * 0.3f) + (this.getTrab() * 0.4f));
            System.out.printf("Sua nota foi %.2f\n", this.getMedia());
            System.out.printf("\n");
            if (this.getMedia() < 6) {
                System.out.println("Você está na Final");
                System.out.printf("Você precisa de %.2f pontos para alcaçar a média\n",(this.getMedia()-6)*-1);
            } else {
                System.out.println("Aprovado");
            }
            
        }
    
    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getTrab() {
        return trab;
    }

    public void setTrab(float trab) {
        this.trab = trab;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
