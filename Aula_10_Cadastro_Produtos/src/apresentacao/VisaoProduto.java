package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Tipo;

public class VisaoProduto extends JFrame{

	//Propriedades
	
	private static final long serialVersionUID = 1L;

	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblPreco = new JLabel("Preço");
	private JTextField txtPreco = new JTextField();
	
	private JLabel lblTipo = new JLabel("Tipo");
	private JComboBox cboTipo = new JComboBox<String>();
	
	private JCheckBox chkPerecivel = new JCheckBox("Perecível");
	
	private JLabel lblDetalhamento = new JLabel("Detalhamento");
	private JTextArea txtDetalhamento = new JTextArea();
	private JScrollPane jspDetalhamento = new JScrollPane(txtDetalhamento);
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//Acesso
	
	public static void main(String[] args) {
		new VisaoProduto().setVisible(true);
	}
	
	//Construtores
	
	public VisaoProduto() {
		
		//Janela
		
		setTitle("Cadastro de Produtos");
		setSize(400, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Nome
		
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		
		txtNome.setBounds(10, 30, 365, 20);
		add(txtNome);
		
		//Preco
		
		lblPreco.setBounds(10, 60, 200, 20);
		add(lblPreco);
		
		txtPreco.setBounds(10, 80, 100, 20);
		add(txtPreco);
		
		//Tipo
		
		lblTipo.setBounds(10, 110, 200, 20);
		add(lblTipo);
		
		cboTipo.setBounds(10, 130, 365, 20);
		add(cboTipo);
		
		cboTipo.addItem("--- Selecione o tipo ---");
		
		try {
			for(Tipo objTipo : Tipo.getTodos()) {
				cboTipo.addItem(objTipo.getDescricao());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//Perecivel
		
		chkPerecivel.setBounds(7, 160, 200, 20);
		add(chkPerecivel);
		
		//Detalhamento
		
		lblDetalhamento.setBounds(10, 190, 200, 20);
		add(lblDetalhamento);
		
		jspDetalhamento.setBounds(10, 210, 365, 150);
		add(jspDetalhamento);
		txtDetalhamento.setLineWrap(true); 
		
		//Botões
		
		btnGravar.setBounds(30, 370, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtPreco, cboTipo,chkPerecivel, txtDetalhamento));
		
		btnLimpar.setBounds(140, 370, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtPreco, cboTipo,chkPerecivel, txtDetalhamento));
		
		btnSair.setBounds(250, 370, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
