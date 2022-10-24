package academy.devdojo.maratonajava.javacore.Kenum.dominio;

// Todos os atributos aqui criados são constantes
// Com ENUM você controla o que pode ser colocado em tipoCliente
// Quando você tem escolhas para fazer em uma variável e essas escolhas são "fixas" de algum forma (como os dias da semana)
// é recomendado usar ENUM!
public enum TipoCliente {
    // Colocando var(valor) podemos colocar um número que define o tipo
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String NOMEFATORADO;

    public static TipoCliente clientTypeRelatory(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.NOMEFATORADO.equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    TipoCliente(int valor, String s) {
        this.VALOR = valor;
        this.NOMEFATORADO = s;
    }

}
