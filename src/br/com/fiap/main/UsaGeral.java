package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Bicicleta;
import br.com.fiap.bean.Empresa;
import br.com.fiap.bean.Login;
import br.com.fiap.bean.Modificacoes;
import br.com.fiap.bean.PessoaFisica;
import br.com.fiap.bean.Vistoria;
import br.com.fiap.bean.VistoriaSolicitada;

public class UsaGeral {
	public static void main(String[] args) {
		
		PessoaFisica pesFis = new PessoaFisica();
		Empresa emp = new Empresa();
		Login login = new Login();
		Modificacoes mod = new Modificacoes();
		VistoriaSolicitada visSol = new VistoriaSolicitada();
		Vistoria vis = new Vistoria();
		Bicicleta bic = new Bicicleta();
		
		try {
			int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 se é cliente pessoa física: " + "\nDigite 2 se é uma empresa: "));
			
			if (escolha == 1) {
				pesFis.setNome(JOptionPane.showInputDialog("Insira o nome do cliente: "));
				pesFis.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF do cliente: ")));
				pesFis.setRg(Integer.parseInt(JOptionPane.showInputDialog("Insira o RG do cliente: ")));
				pesFis.setEndereco(JOptionPane.showInputDialog("Insira o endereço do cliente: "));
				pesFis.setContato(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de contato do cliente: ")));
				pesFis.setEmail(JOptionPane.showInputDialog("Insira o e-mail do cliente: "));
				
				System.out.println("Nome: " +  pesFis.getNome() + "\nCpf: " +  pesFis.getCpf() + "\nRG: " + pesFis.getRg() + "\nEndereço: " + pesFis.getEndereco() + "\nContato: " + pesFis.getContato() + "\nE-mail: " + pesFis.getEmail());
				
				visSol.setNomeCLiente(JOptionPane.showInputDialog("Insira o nome do cliente: "));
				visSol.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF do cliente: ")));
				visSol.setNomeCorretor(JOptionPane.showInputDialog("Insira o nome do corretor: "));
				visSol.setNomeDaBike(JOptionPane.showInputDialog("Insira o nome da bike: "));
				
				System.out.println("\nNome do cliente: " + visSol.getNomeCLiente() + "\nCpf: " + visSol.getCpf() + "\nNome do corretor: " + visSol.getNomeCorretor() + "\nNome da bika: " + visSol.getNomeDaBike());
			} else if (escolha == 2){
				emp.setCnpj(Integer.parseInt(JOptionPane.showInputDialog("Insira o cnpj do cliente: ")));
				emp.setEndereco(JOptionPane.showInputDialog("Insira o endereço do cliente: "));
				emp.setContato(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de contato do cliente: ")));
				emp.setEmail(JOptionPane.showInputDialog("Insira o e-mail do cliente: "));
				
				System.out.println("\nRazao Social: " +  emp.getRazaoSocial() + "\nCnpj: " +  emp.getCnpj() + "\nEndereço: " + emp.getEndereco() + "\nContato: " + emp.getContato() + "\nE-mail: " + emp.getEmail());
				
				visSol.setNomeCLiente(JOptionPane.showInputDialog("Insira o nome do cliente: "));
				visSol.setCnpj(Integer.parseInt(JOptionPane.showInputDialog("Insira o CNPJ do cliente: ")));
				visSol.setNomeCorretor(JOptionPane.showInputDialog("Insira o nome do corretor: "));
				visSol.setNomeDaBike(JOptionPane.showInputDialog("Insira o nome da bike: "));
				
				System.out.println("\nNome do cliente: " + visSol.getNomeCLiente() + "\nCpf: " + visSol.getCpf() + "\nNome do corretor: " + visSol.getNomeCorretor() + "\nNome da bika: " + visSol.getNomeDaBike());
			} else {
				throw new Exception("Escolha uma opção válida!");
			}
			
			bic.setMarcaBike(JOptionPane.showInputDialog("Insira a marca da bike: "));
			bic.setAnoBike(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano da bike: ")));
			bic.setValorMercado(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de mercado da bike: ")));
			bic.setFuncaoBike(JOptionPane.showInputDialog("Insira a função da bike: "));
			bic.setModeloBike(JOptionPane.showInputDialog("Insira o modelo da bike: "));
			bic.setCorBike(JOptionPane.showInputDialog("Insira a cor da bike: "));
			
			System.out.println("\nMarca da bike: " + bic.getMarcaBike() + "\nAno da bike" + bic.getAnoBike() + "\nValor de mercado: " + bic.getValorMercado() + "\nFunção da bike: " + bic.getFuncaoBike() + "\nModelo bike: " + bic.getModeloBike() + "\nCor: " + bic.getCorBike());
			
			login.setNome(JOptionPane.showInputDialog("Insira seu username: "));
			login.setSenha(JOptionPane.showInputDialog("Insira sua senha: "));
			
			login.logar();
			
			System.out.println("\nUsername: " + login.getNome());
			
			mod.setQuadro(JOptionPane.showInputDialog("Insira o quadro da bike: "));
			mod.setFreio(JOptionPane.showInputDialog("Insira o freio da bike: "));
			mod.setGuidao(JOptionPane.showInputDialog("Insira o guidao da bike: "));
			mod.setPneu(JOptionPane.showInputDialog("Insira o pneu da bike: "));
			mod.setSuspensaoTraseira(JOptionPane.showInputDialog("Insira a suspensão traseira da bike: "));
			mod.setSuspensaoDianteira(JOptionPane.showInputDialog("Insira a suspensão dianteira da bike: "));
			mod.setPedal(JOptionPane.showInputDialog("Insira o pedal bike: "));
			
			System.out.println("\nQuadro: " + mod.getQuadro() + "\nFreio: " + mod.getFreio() + "\nGuidao: " + mod.getGuidao() + "\nPneu: " + mod.getPneu() + "\nSuspensão traseira: " + mod.getSuspensaoDianteira() + "\nSuspensão dianteira: " + mod.getSuspensaoDianteira() + "\nPedal: " + mod.getPedal());
			
			
			
			vis.validacao(vis.isAnaliseAvaria(), vis.isConfirmaçãoInformaçãoBike());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
