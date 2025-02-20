package Codificadores;

public class Codifica20103332 implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Lucas Antunes";
    }

    @Override
    public String getMatriculaAutor() {
        return "20103332-1";
    }

    // Soma 2 ao codigo de cada caractere
    @Override
    public String codifica(String str) {
        StringBuilder out = new StringBuilder();

        for(char c : str.toCharArray()) {
            c = (char)(c + 2);
            out.append(c);
        }

        return out.toString();
    }

    // Subtrai 2 do codigo de cada caractere
    @Override
    public String decodifica(String str) {
        StringBuilder out = new StringBuilder();

        for(char c : str.toCharArray()) {
            c = (char)(c - 2);
            out.append(c);
        }

        return out.toString();
    }
}
