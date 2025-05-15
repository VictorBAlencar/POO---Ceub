package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Pessoa;

public class ControladorGravar implements ActionListener {
	//Propriedades
	
	private JTextField txtNome = null;
	private JTextField txtEndereco = null;
	private JTextField txtTelefone = null;
	
	//Construtor Cheio
	
	public ControladorGravar(JTextField txtNome, JTextField txtEndereco, JTextField txtTelefone) {
		super();
		this.txtNome = txtNome;
		this.txtEndereco = txtEndereco;
		this.txtTelefone = txtTelefone;
	}

	
	public void actionPerformed(ActionEvent e) {
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setTelefone(txtTelefone.getText());
		
		try {
			objPessoa.persistir();
			JOptionPane.showMessageDialog(null, "Gravacao realizada com sucesso");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);		}
	}
}
