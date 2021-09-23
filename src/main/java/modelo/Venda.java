package modelo;

import java.util.Scanner;

public class Venda {
	Scanner ler = new Scanner(System.in);
	private Funcionario funcionario = new Funcionario();
	private Cliente cliente = new Cliente();
	private Calca calca = new Calca();
    private Camisa camisa = new Camisa();
    private Camiseta camiseta = new Camiseta();
    private Casaco casaco = new Casaco();
    private Cinto cinto = new Cinto();
    private Cropped cropped = new Cropped();
    private Macacao macacao = new Macacao();
    private Saia saia = new Saia();
    private Shorte shorte = new Shorte();
    
    private int codCompra; 
	private double valorTotal;
	private String formaPagamento;
	
	public Venda() {
		
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Calca cl) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.calca = cl;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Camisa cms) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.camisa = cms;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Camiseta cmst) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.camiseta = cmst;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Casaco casac) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.casaco= casac;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Cinto cin) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.cinto = cin;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Cropped crop) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.cropped = crop;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Macacao mac) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.macacao = mac;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Saia s) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.saia = s;
	}
	
	public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, Shorte shor) {
		this.codCompra = cod;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPag;
		this.funcionario = func;
		this.cliente = c;
		this.shorte = shor;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calca getCalca() {
		return calca;
	}

	public void setCalca(Calca calca) {
		this.calca = calca;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Camiseta getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	public Casaco getCasaco() {
		return casaco;
	}

	public void setCasaco(Casaco casaco) {
		this.casaco = casaco;
	}

	public Cinto getCinto() {
		return cinto;
	}

	public void setCinto(Cinto cinto) {
		this.cinto = cinto;
	}

	public Cropped getCropped() {
		return cropped;
	}

	public void setCropped(Cropped cropped) {
		this.cropped = cropped;
	}

	public Macacao getMacacao() {
		return macacao;
	}

	public void setMacacao(Macacao macacao) {
		this.macacao = macacao;
	}

	public Saia getSaia() {
		return saia;
	}

	public void setSaia(Saia saia) {
		this.saia = saia;
	}

	public Shorte getShorte() {
		return shorte;
	}

	public void setShorte(Shorte shorte) {
		this.shorte = shorte;
	}

	public int getCodCompra() {
		return codCompra;
	}

	public void setCodCompra(int codCompra) {
		this.codCompra = codCompra;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
	
	
	
	
	
	
	
	
}
