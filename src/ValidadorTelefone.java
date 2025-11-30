public class ValidadorTelefone {

    public static boolean valido(String numero) {


        if (numero.length() != 6) {
            return false;
        }


        for (int i = 0; i < numero.length() - 1; i++) {
            if (numero.charAt(i) == numero.charAt(i + 1)) {
                return false;
            }
        }


        int soma = 0;
        for (char c : numero.toCharArray()) {
            soma += Character.getNumericValue(c);
        }
        if (soma % 2 != 0) {
            return false;
        }


        if (numero.charAt(0) == numero.charAt(numero.length() - 1)) {
            return false;
        }

        return true;
    }
}
