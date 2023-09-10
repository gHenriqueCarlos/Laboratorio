import javax.swing.JOptionPane;

public class Triglicerideos extends Exames {
    int Triglicerideo;

    @Override
    public boolean CadastrarExame() {
        super.SetNomePaciente(JOptionPane.showInputDialog(null, "Digite o nome do Paciente:"));
        super.SetTipoSanguineo(JOptionPane.showInputDialog(null, "Digite o tipo Sanguineo do Paciente:"));
        super.SetAnoDeNascimento(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento do Paciente:")));

        this.Triglicerideo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do Triglicerideo: "));
        // MostrarResultado();
        return true;
    }

    @Override
    public String ClassificarResultado() {
        int Idade = this.CalcularIdade();
        String temp = "";
        if (Idade <= 9) {
            if (this.Triglicerideo < 75)
                temp = "BOM";
            else
                temp = "RUIM";

        } else if (Idade > 10 && Idade <= 19) {
            if (this.Triglicerideo < 90)
                temp = "BOM";
            else
                temp = "RUIM";
        } else if (Idade > 19) {
            if (this.Triglicerideo < 150)
                temp = "BOM";
            else
                temp = "RUIM";
        }

        return temp;
    }

    @Override
    public void MostrarResultado() {
        JOptionPane.showMessageDialog(null, "Paciente: " + this.ObterPaciente() +
                "\nTriglicerideos: " + this.Triglicerideo + "\nClassificação: Triglicerideo "
                + this.ClassificarResultado());
    }
}
