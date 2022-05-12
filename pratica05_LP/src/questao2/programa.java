package questao2;

import javax.swing.JOptionPane;
import java.util.*;


public class programa {
	

	public static void main(String[] args) {
		
		String nome, telefone, usuario, email;
		int menu;

		ArrayList<String> social = new ArrayList();
		
		do
			
		{
			
			 menu = Integer.parseInt (JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair"));
			
		switch (menu)
		
		{
		
			case 1:
				
				nome = JOptionPane.showInputDialog("Digite o nome: ");
				telefone = JOptionPane.showInputDialog("Digite o telefone: ");
				usuario = JOptionPane.showInputDialog("Digite o usuario: ");
				email = JOptionPane.showInputDialog("Digite o email: ");
				
				social.add(nome+";"+telefone+";"+usuario +";"+email );
				JOptionPane.showMessageDialog(null, "Cadastro inserido com sucesso");
				break;
				
			case 2:
				
				String excluir = JOptionPane.showInputDialog("Digite uma informação que deseja excluir");
				for (int i=0; i<social.size(); i++)
					{
						if (social.get(i).contains(excluir))
							social.remove(i);
							JOptionPane.showMessageDialog(null, "Removido com sucesso");
					}
				
				break;
				
				case 3:
					
					String consulta = JOptionPane.showInputDialog("Digite uma informação que deseja pesquisar");
						for (int i=0; i<social.size(); i++)
							{
								if (social.get(i).contains(consulta))
									JOptionPane.showMessageDialog(null, social.get(i));
							}
				case 4:
					JOptionPane.showMessageDialog(null, "Saindo");
					break;
					
					
					}
	}
		while (menu!=4);
}
}