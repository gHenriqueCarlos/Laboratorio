import javax.swing.JOptionPane;

public class Glicemia extends Exames {
    int Glicose;

    @Override
    public boolean CadastrarExame() {
        super.SetNomePaciente(JOptionPane.showInputDialog(null, "Digite o nome do Paciente:"));
        super.SetTipoSanguineo(JOptionPane.showInputDialog(null, "Digite o tipo Sanguineo do Paciente:"));
        super.SetAnoDeNascimento(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento do Paciente:")));

        this.Glicose = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor Glicemico:"));
        // MostrarResultado();
        return true;
    }

    @Override
    public String ClassificarResultado() {

        if (this.Glicose < 100) {
            return "Normoglicemia";
        } else if (this.Glicose >= 100 && Glicose < 126) {
            return "Pré-diabetes";
        } else if (this.Glicose >= 126) {
            return "Diabetes estabelecido";
        } else {
            return "Erro ao gerar a classificação do Diabetes.";
        }
    }

    @Override
    public void MostrarResultado() {
        JOptionPane.showMessageDialog(null, "Paciente: " + this.ObterPaciente() + "\nGlicemia: " + this.Glicose
                + " mg/dL" + "\nClassificação: " + this.ClassificarResultado());
    }
}
