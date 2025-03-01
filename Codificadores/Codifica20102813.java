//Colaborando em projetos de codigo aberto - Prof. Bernardo Copstein
//Fernanda Fraga Rosa


package Codificadores;

public class Codifica20102813 implements Codifica {

    private static String tabela = "XYZWVUTSRQPOMNOLQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int deslc = 3;

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                codificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        codificada += tabela.charAt(i + deslc);
                    }
                }
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                decodificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        decodificada += tabela.charAt(i - deslc);
                    }
                }
            }
        }
        return decodificada;
    }


    
    @Override
    public String getMatriculaAutor() {
        return "20102813-1";
    }

    @Override
    public String getNomeAutor() {
        return "Fernanda Rosa";
    }
    
}
