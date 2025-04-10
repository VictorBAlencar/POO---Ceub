package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class VisaoPessoa extends JFrame{
	
	//Propriedades
	private static final long serialVersionUID = 1L;
	
	//Nome
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();

	//Sexo
	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup btgSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	
	//Endereco
	private JLabel lblEndereco = new JLabel("Endereço");
	private JTextField txtEndereco = new JTextField();
	
	//Uf
	private JLabel lblUf  = new JLabel("UF");
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	//Opcoes
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	
	//Main
	
	public static void main(String[] args) {
		new VisaoPessoa().setVisible(true);
	}
	
	//Construtores
	
	public VisaoPessoa(){
		//Configurador Window
		setTitle("Cadstro de Pessoas");
		setSize(400, 315);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null); // criacao do layout manualmente
		
		//Funcionalidade Nome
		
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		
		txtNome.setBounds(10, 30, 365, 20);
		add(txtNome);
		
		//Funcionalidade Sexo
		
		lblSexo.setBounds(10, 60, 200, 20);
		add(lblSexo);
		
		optMasculino.setBounds(10, 80, 100, 20);
		add(optMasculino);
		
		optFeminino.setBounds(120, 80, 100, 20);
		add(optFeminino);
		
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		optMasculino.setSelected(true);
		
		//Funcionalidade Endereco
		
		lblEndereco.setBounds(10, 110, 200, 20);
		add(lblEndereco);
		
		txtEndereco.setBounds(10, 130, 365, 20);
		add(txtEndereco);
		
		//Funcionalidade UF
		
		lblUf.setBounds(10, 160, 200, 20);
		add(lblUf);
		
		cboUf.setBounds(10, 180, 70, 20);
		add(cboUf);
		
		//getTodos
		cboUf.addItem("---");
		
		try{
			for(Uf objUf : Uf.getTodos()) {
				cboUf.addItem(objUf.getSigla());
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//Funcionalidade Botões
		
		btnGravar.setBounds(20, 230, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtEndereco, optMasculino, cboUf));
		
		btnLimpar.setBounds(140, 230, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtEndereco, optMasculino, cboUf)); // option --> pode deixar 1 sobrando(ja sabe qual falta)
		
		btnSair.setBounds(260, 230, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair()); //() --> construtor vazio
	}
}