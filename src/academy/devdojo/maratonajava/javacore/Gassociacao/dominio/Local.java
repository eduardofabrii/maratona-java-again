package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Local {
    private String endereco;
    private String bloco;
    private String sala;

    @Override
    public String toString() {
        return "Local{" +
                "endereco='" + endereco + '\'' +
                ", bloco='" + bloco + '\'' +
                ", sala='" + sala + '\'' +
                '}';
    }

    public Local(String endereco, String bloco, String sala) {
        this.endereco = endereco;
        this.bloco = bloco;
        this.sala = sala;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
