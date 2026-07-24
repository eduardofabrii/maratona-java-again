package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPessoa {
    PJ("Pessoa Jurídica"),
    PF("Pessoa Física");

    public final String TIPO;
    TipoPessoa(String tipo) {
        this.TIPO = tipo;
    }

    public static TipoPessoa tipoPessoaPorNomeRelatorio(String nomeRelatorio) {
        for (TipoPessoa tipoPessoa : TipoPessoa.values()) {
            if (tipoPessoa.TIPO.equals(nomeRelatorio)) {
                return tipoPessoa;
            }
        }
        return null;
    }
}
