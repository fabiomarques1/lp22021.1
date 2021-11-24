
package caneta;

public class Caneta {
    //atributos (características e estados)
    private String modelo;
    private String cor;
    private Double ponta;
    private int carga;
    private boolean tampada;

    public Caneta() {
    }

    public Caneta(String modelo, String cor, Double ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(int opcao) {
        String cores[] = {"Azul", "Vermelha", "Verde", "Preta"};
        if (opcao > 0 && opcao < 5) {
            this.cor = cores[opcao-1];
        } else {
            this.cor = "Cor Inválida";
            
        }
    }

    public Double getPonta() {
        return ponta;
    }

    public void setPonta(Double ponta) {
        if (ponta >= 0) {
            this.ponta = ponta;
        } else {
            this.ponta = 0.0;
        }
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        if (carga >= 0) {
            this.carga = carga;
        } else {
            this.carga = 0;
        }
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    //métodos(comportamentos codificados)
    public String escrever() {
        return "Escrevendo...";
    }

    public String rabiscar() {
        return "Rabiscando...";
    }

    private String pintar() {
        return "Pintando...";
    }

    public String tampar() {
        if (!tampada) {
            tampada = true;
            return "A caneta foi TAMPADA com sucesso!";
        } else {
            return "A caneta já está tampada!";
        }
    }

    public String destampar() {
        if (tampada) {
            tampada = false;
            return "A caneta foi DESTAMPADA com sucesso!";
        } else {
            return "A caneta já está destampada!";
        }
    }

    @Override
    public String toString() {
        return "Caneta{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada=" + tampada + '}';
    }

    
    
    
}
