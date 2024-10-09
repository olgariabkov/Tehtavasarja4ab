public class Juoma {

    private String nome;
    private Water waterType;

    //konstruktori

    public Juoma(String nome, Water waterType) {
        this.nome = nome;
        this.waterType = waterType;
    }

    //getterit
    public String getNome() {
        return nome;
    }

    public Water getWaterType() {
        return waterType;
    }

    //tulostaa juoman tiedot

    @Override
    public String toString() {
        return "Juoma{" +
                "nome='" + nome + '\'' +
                ", waterType=" + waterType +
                '}';
    }
}

