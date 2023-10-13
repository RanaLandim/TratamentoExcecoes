public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("20376064");
            System.out.println(cepFormatado);
        } catch (CepInvalidadoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidadoException{
        if(cep.length() != 8)
            throw new CepInvalidadoException();

            //simulando um cep formatado
            return "23.765-064";
    }
}
