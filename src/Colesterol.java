import javax.swing.JOptionPane;

public class Colesterol extends Exames {
    int LDL, HDL;
    String RiscoPaciente;

    @Override
    public boolean CadastrarExame() {
        super.SetNomePaciente(JOptionPane.showInputDialog(null, "Digite o nome do Paciente:"));
        super.SetTipoSanguineo(JOptionPane.showInputDialog(null, "Digite o tipo Sanguineo do Paciente:"));
        super.SetAnoDeNascimento(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento do Paciente:")));

        this.LDL = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de LDL: "));

        this.HDL = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de HDL: "));

        this.RiscoPaciente = JOptionPane.showInputDialog(null,
                "Digite o risco do Paciente (B - baixo, M - medio e A - alto): ");

        this.RiscoPaciente.toLowerCase();
        // MostrarResultado();
        return true;
    }

    @Override
    public String ClassificarResultado() {
        StringBuilder resultBuilder = new StringBuilder();
        int Idade = this.CalcularIdade();
        if (Idade <= 19 && HDL > 45) {
            resultBuilder.append("HDL - BOM");
        } else if (Idade > 19 && HDL > 40) {
            resultBuilder.append("HDL - BOM");
        } else {
            resultBuilder.append("HDL - RUIM");
        }

        if (LDL < 100) {
            resultBuilder.append(", LDL - Risco Baixo");
        } else if (LDL < 70) {
            resultBuilder.append(", LDL - Risco Médio");
        } else {
            resultBuilder.append(", LDL - Risco Alto");
        }

        return resultBuilder.toString();
    }

    @Override
    public void MostrarResultado() {
        JOptionPane.showMessageDialog(null,
                "Paciente: " + this.ObterPaciente() + "\nLDL: " + this.LDL + "\nHDL: " + this.HDL
                        + "\nRisco do Paciente: "
                        + this.RiscoPaciente + "\nClassificação: " + this.ClassificarResultado());
    }
}
