package v1;

import java.io.IOException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		
		//instância do gerenciador
		GerenciadorRegistros gerenciadorRegistros = new GerenciadorRegistros();
		
		List<Registro> registros = gerenciadorRegistros.criar();
		System.out.println("chegou aqui imprimir");
		gerenciadorRegistros.imprimir(registros);
	}
}
