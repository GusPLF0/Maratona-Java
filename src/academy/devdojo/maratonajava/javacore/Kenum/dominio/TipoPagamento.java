package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    // Podemos definir métodos para tipos enum diferentes
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };


    public abstract double calcularDesconto(double valor);
}
