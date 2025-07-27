package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;

public class VisaoLivro extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JLabel lblTitulo = new JLabel("Titulo");
	private JTextField txtTitulo = new JTextField();
	
	private JLabel lblAutor = new JLabel("Autor");
	private JComboBox<String> cboAutor = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnSair = new JButton("Sair");
	private JButton btnLimpar = new JButton("Limpar");
	
	//Execucao
	
	public static void main(String[] args) {
		new VisaoLivro().setVisible(true);
	}
	
	//Config
	
	public VisaoLivro() {
		
		//Janela
		
		setTitle("Cadastro de Livros");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Titulo
		
		lblTitulo.setBounds(10, 10, 200, 20);
		add(lblTitulo);
		
		txtTitulo.setBounds(10, 30, 990, 20);
		add(txtTitulo);
		
		//Autor
		
		lblAutor.setBounds(10, 60, 200, 20);
		add(lblAutor);
		
		cboAutor.setBounds(10, 80, 990, 20);
		add(cboAutor);
		
		cboAutor.addItem("--- Escolha o Autor ---");
		
		try {
			for(Autor objAutor : Autor.getTodos()) {
				cboAutor.addItem(objAutor.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	
		//Buttons
		
		btnGravar.setBounds(700, 678, 80, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtTitulo, cboAutor)); //manipula a tela
		
		btnLimpar.setBounds(800, 678, 80, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtTitulo, cboAutor)); //manipula a tela
		
		btnSair.setBounds(900, 678, 80, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
