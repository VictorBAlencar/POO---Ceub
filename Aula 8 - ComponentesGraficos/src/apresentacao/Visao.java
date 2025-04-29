package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao extends JFrame{
	//Propriedades
	
	private static final long serialVersionUID = 1L;
	
	private JMenuBar barraMenu = new JMenuBar();
	
	private JMenu mnuArquivo = new JMenu("Arquivo"); //mnu = Menu
	private JMenuItem mniNovo = new JMenuItem("Novo"); //mni = MenuItem
	private JMenuItem mniAbrir = new JMenuItem("Abrir");
	private JMenuItem mniSair = new JMenuItem("Sair");
	
	private JMenu mnuEditar = new JMenu("Editar");
	private JMenuItem mniCopiar = new JMenuItem("Copiar");
	private JMenuItem mniColar = new JMenuItem("Colar");
	
	private JButton btnGravar = new JButton("Gravar"); //btn = Button
	
	private JLabel lblUsuario = new JLabel("Usuário"); //lbl = Label
	private JTextField txtUsuario = new JTextField(); //txt = TextField
	
	private JLabel lblDescricao = new JLabel("Descrição");
	private JTextArea txtDescricao = new JTextArea();
	private JScrollPane jspDescricao = new JScrollPane(txtDescricao); //ScrollPane --> jsp -- txt
	
	private JLabel lblOpcao = new JLabel("Opções");
	private JComboBox<String> cboOpcao = new JComboBox <String>(); //cbo = ComboBox
	
	private JCheckBox chkSalvarSenha = new JCheckBox("Salvar Senha"); // não precisa de Label
	
	private JLabel lblSexo = new JLabel("Sexo");
	private JRadioButton optMasculino = new JRadioButton("Masculino"); //opt = RadioButton
	private JRadioButton optFeminino = new JRadioButton("Feminino"); //opt = RadioButton
	private ButtonGroup btgSexo = new ButtonGroup(); // btg = ButtonGroup --> essencial
	
	private JLabel lblBancoDeDados = new JLabel("Banco de Dados");
	private JList<String> lstBancoDeDados = new JList<String>(); //lst = List
	private JScrollPane jspBancoDeDados = new JScrollPane(lstBancoDeDados);
	private DefaultListModel<String> dlmBancoDeDados = new DefaultListModel<String>(); //dlm = DefaultListModel
	
	//Acesso
	
	public static void main(String[] args) {
		new Visao().setVisible(true);	
	}
	
	//Construtores
	
	public Visao() {
		//Janela
		setTitle("Exemplo Janela - Controles Gráficos");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Barra de Menu
		
		setJMenuBar(barraMenu);
		
		barraMenu.add(mnuArquivo);
		mnuArquivo.add(mniNovo);
		mnuArquivo.add(mniAbrir);
		mnuArquivo.addSeparator();
		mnuArquivo.add(mniSair);
		
		barraMenu.add(mnuEditar);
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniColar);
		
		//Acoes
		
		mniSair.addActionListener(new ControladorSair());
		mniCopiar.addActionListener(new ControladorCopiar());
		
		//Button Config
		
		btnGravar.setBounds(460, 660, 100, 30); // x, y, largura, altura
		add(btnGravar);
		
		//TextField Config
		
		lblUsuario.setBounds(20, 20, 200, 20);
		add(lblUsuario);
		
		txtUsuario.setBounds(20, 40, 150, 20);
		add(txtUsuario);
		
		//TextArea/Descricao Config
		
		lblDescricao.setBounds(20, 70, 200, 20);
		add(lblDescricao);
		
		jspDescricao.setBounds(20, 90, 970, 200);
		add(jspDescricao);
		txtDescricao.setLineWrap(true);
		
		//Opcoes
		
		lblOpcao.setBounds(20, 300, 200, 20);
		add(lblOpcao);
		
		cboOpcao.setBounds(20, 320, 200, 20);
		add(cboOpcao);
		
		cboOpcao.addItem("-- Selecione --");
		cboOpcao.addItem("Opção 1");
		cboOpcao.addItem("Opção 2");
		cboOpcao.addItem("Opção 3");
		cboOpcao.addItem("Opção 4");	
		cboOpcao.addItem("Opção 5");
		
		//Check Box
		
		chkSalvarSenha.setBounds(20, 350, 200, 20);
		add(chkSalvarSenha);
		
		//Multipla Escolha
		
		lblSexo.setBounds(20, 380, 200, 20);
		add(lblSexo);
		
		optMasculino.setBounds(20, 400, 150, 20);
		add(optMasculino);
		
		optFeminino.setBounds(170, 400, 150, 20);
		add(optFeminino);
		
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		//optMasculino.setSelected(true); // pre selecao
		
		//Lista
		
		lblBancoDeDados.setBounds(20, 430, 200, 20);
		add(lblBancoDeDados);
		
		jspBancoDeDados.setBounds(20, 450, 970, 200);
		add(jspBancoDeDados);
		
		lstBancoDeDados.setModel(dlmBancoDeDados);
		dlmBancoDeDados.addElement("Registro 1");
		dlmBancoDeDados.addElement("Registro 2");
		dlmBancoDeDados.addElement("Registro 3");
		dlmBancoDeDados.addElement("Registro 4");
		dlmBancoDeDados.addElement("Registro 5");
	}
}
