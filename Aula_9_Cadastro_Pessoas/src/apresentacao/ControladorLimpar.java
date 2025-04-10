package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	
	//Propriedades
	private JTextField txtNome = null;
	private JTextField txtEndereco = null;
	private JRadioButton optMasculino = null;
	private JComboBox<String> cboUf = null;
	
	//Construtores
	public ControladorLimpar(JTextField txtNome, JTextField txtEndereco, JRadioButton optMasculino,JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.txtEndereco = txtEndereco;
		this.optMasculino = optMasculino;
		this.cboUf = cboUf;
	}

	//Metodo Interface
	
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		optMasculino.setSelected(true);
		txtEndereco.setText("");
		cboUf.setSelectedIndex(0);
	}
}
