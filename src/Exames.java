abstract class Exames {
    // private String NomeExame;
    private String NomePaciente, TipoSanguineo;
    private int AnoDeNascimento;

    // public void CadastrarPaciente(String nome, String tipoSanguineo, int
    // AnoNascimento) {
    // NomePaciente = nome;
    // this.TipoSanguineo = tipoSanguineo;
    // this.AnoDeNascimento = AnoNascimento;

    // System.out.println("Paciente " + NomePaciente + " cadastrado.");
    // }

    public boolean CadastrarExame() {

        return true;
    }

    public abstract String ClassificarResultado();

    public void MostrarResultado() {

    }

    public void SetNomePaciente(String nome) {
        this.NomePaciente = nome;
    }

    public String ObterPaciente() {
        return this.NomePaciente;
    }

    public void SetTipoSanguineo(String tipo) {
        this.TipoSanguineo = tipo;
        this.TipoSanguineo.toUpperCase();
    }

    public String ObterTipoSanguineo() {
        return TipoSanguineo;
    }

    public void SetAnoDeNascimento(int ano) {
        this.AnoDeNascimento = ano;
    }

    public int ObterAnoDeNascimento() {
        return AnoDeNascimento;
    }

    public int CalcularIdade() {
        // int Idade = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) -
        // AnoDeNascimento;

        return 2023 - ObterAnoDeNascimento();
    }
}
