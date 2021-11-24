package trator;

public class Retroescavadeira {
    //atributos
    private String marca;
    //estado
    private double alturaBraco;
    private double velocidade;

    public Retroescavadeira(String marca) {
        this.marca = marca;
        this.velocidade = 0;
        this.alturaBraco = 10;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAlturaBraco() {
        return alturaBraco;
    }

    public void setAlturaBraco(double alturaBraco) {
        this.alturaBraco = alturaBraco;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void andar() {
        this.velocidade = this.velocidade + 10;
    }
    
    public void parar() {
        this.velocidade = 0;
    }
    
    public String levantarBraco() {
        if (this.alturaBraco < 10) {
            this.alturaBraco = this.alturaBraco + 1;
            return "Braço levantado!";
        } else {
            return "Não foi possível LEVANTAR o braço porque já está no limite!";
        } 
    }
    
    public String abaixarBraco() {
        if (this.alturaBraco > 0) {
            this.alturaBraco = this.alturaBraco - 1;
            return "Braço abaixado!";
        } else {
            return "Não foi possível ABAIXAR o braço porque já está no limite!";
        }
    }

    @Override
    public String toString() {
        return "Retroescavadeira{" + "marca=" + marca + ", alturaBraco=" + alturaBraco + ", velocidade=" + velocidade + '}';
    }  
}
