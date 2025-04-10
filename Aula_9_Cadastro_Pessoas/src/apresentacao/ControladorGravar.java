package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

public class ControladorGravar implements ActionListener {

	//Propriedades
	
	private JTextField txtNome = null;
	private JTextField txtEndereco = null;
	private JRadioButton optMasculino = null;
	private JComboBox<String> cboUf = null;
	
	//Construtores Cheios
	
	public ControladorGravar(JTextField txtNome, JTextField txtEndereco, JRadioButton optMasculino,JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.txtEndereco = txtEndereco;
		this.optMasculino = optMasculino;
		this.cboUf = cboUf;
	}

	//Metodo Interface
	
	public void actionPerformed(ActionEvent e) {
		//Composição do Objeto
		
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setSexo(optMasculino.isSelected());
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		JOptionPane.showMessageDialog(null,
				"Gravação realizada com sucesso." + "\n\n" +
				"Nome: " + objPessoa.getNome() + "\n" +
				"Sexo: " + (objPessoa.isSexo() ? "Masculino" : "Feminino") + "\n" + // ? --> if : --> else
				"Endereco: " + objPessoa.getEndereco() + "\n" +
				"UF: " + objPessoa.getObjUf().getSigla()
				);
	}
}
