package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VisaoPessoa extends JFrame{
		//Propriedades
		
		private static final long serialVersionUID = 1L;
		
		private JLabel lblNome = new JLabel("Nome");
		private JTextField txtNome = new JTextField();
		
		private JLabel lblEndereco = new JLabel("Endereco");
		private JTextField txtEndereco = new JTextField();
		
		private JLabel lblTelefone = new JLabel("Telefone");
		private JTextField txtTelefone = new JTextField();
		
		private JButton btnGravar = new JButton("Gravar");
		
		//Metodo de Execucao
		
		public static void main(String[] args) {
			new VisaoPessoa().setVisible(true);
		}
		
		//Metodos da Classe
		
		public VisaoPessoa() {
			//Janela
			
			setTitle("Cadastro de Pessoas no Banco de Dados");
			setSize(300, 240);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setLayout(null);
			
			//Nome
			
			lblNome.setBounds(10, 10, 200, 20);
			add(lblNome);
			txtNome.setBounds(10, 30, 265, 20);
			add(txtNome);
			
			//Endereco
			
			lblEndereco.setBounds(10, 60, 200, 20);
			add(lblEndereco);
			txtEndereco.setBounds(10, 80, 265, 20);
			add(txtEndereco);
			
			//Telefone
			
			lblTelefone.setBounds(10, 110, 200, 20);
			add(lblTelefone);
			txtTelefone.setBounds(10, 130, 100, 20);
			add(txtTelefone);
			
			//Button
			
			btnGravar.setBounds(100, 160, 100, 30);
			add(btnGravar);
			btnGravar.addActionListener(new ControladorGravar(txtNome, txtEndereco, txtTelefone));
		}
}