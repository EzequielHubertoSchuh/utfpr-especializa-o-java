
/**
 *
 * @author ezequiel huberto schuh
 */
public class TstConta {

    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();

        try {
            pj.setNumeroConta(-1515);
        } catch (NumException ne) {
            ne.impMsg();
        }

        pj.setCnpj(1234567891);
        pj.getEnder().setRua("Dante Tesser");
        pj.getResponsavel().setCpf(20);
        pj.getResponsavel().setNome("Ezequiel Huberto Schuh");

        System.out.println("Número da conta: " + pj.getNumeroConta());
        pj.validar();
        System.out.println("CNPJ           : " + pj.getCnpj());
        System.out.println("Rua            : " + pj.getEnder().getRua());
        System.out.println("CPF Responsavel: " + pj.getResponsavel().getCpf());
        pj.getResponsavel().verifDoc();
        System.out.println("Nome           : " + pj.getResponsavel().getNome());
        pj.verifDoc();

    }
}
