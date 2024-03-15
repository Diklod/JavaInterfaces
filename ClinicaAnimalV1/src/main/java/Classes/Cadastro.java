package Classes;

public class Cadastro implements Comparable <Cadastro> {

    private String codigo;
    private String name;
    private String raca;
    private String anoNascimento;
    private String nomeDono;
    private String cpfDono;
    private String tipo;

    public Cadastro() {
    }

    public Cadastro(String codigo, String name, String raca, String anoNascimento, String nomeDono, String cpfDono, String tipo) {
        this.codigo = codigo;
        this.name = name;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.nomeDono = nomeDono;
        this.cpfDono = cpfDono;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Cadastro outro) {
        return this.name.compareTo(outro.name);
    }
}
