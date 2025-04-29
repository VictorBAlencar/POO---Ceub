package apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visao extends JFrame{

	//Propriedades
	private static final long serialVersionUID = 1L; // Identificador da Janela
	
	private JPanel objPainel = new Painel();
	
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	//Construtores
	public Visao() {
		//Configurador da Janela
		setTitle("Minha primeira janela Java."); //Titulo
		setSize(1024, 768); //Tamanho
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Fechar
		setLocationRelativeTo(null); //Local
		
		//Configurador do Painel
		setContentPane(objPainel);
	}
}

//1 Passo: JFrame

//2 Passo: serialVersionUID

//3 Passo: Especificar todas as propriedades usadas(Controle)

//4 Passo: main + setVisibile

//5 Passo: Construtores + Configurador