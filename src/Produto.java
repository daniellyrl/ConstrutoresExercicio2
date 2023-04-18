public class Produto {
    protected String tipo;
    protected double preço;
    protected String descrição;
    public Produto(String tipo, double preço, String descrição){
        this.tipo = tipo;
        this.preço = preço;
        this.descrição = descrição;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
