package v1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lombok.Cleanup;
public class GerenciadorRegistros {

	public List<Registro> criar() throws IOException{
		
		List<Registro> registros = new ArrayList<>();
		
		//recuperando o arquivo
		@Cleanup FileInputStream file = new FileInputStream("src/main/resources/IN/teste.xlsx");  
		Workbook workbook = new XSSFWorkbook(file);
		
		//setando a aba
		Sheet sheet = workbook.getSheetAt(0);//pega o sheet número zero (no caso o primeiro sheet)
		
		//setando as linhas
		List<Row> rows = (List<Row>) toList(sheet.iterator());
		
		//removendo os cabecalhos
		rows.remove(0);
		
		//setando as células
		rows.forEach(row ->{
			//setando as celulas
			List<Cell> cells = (List<Cell>) toList(row.cellIterator());
			
			
		//Atribui os valores para a classe registro
			Registro registro = Registro.builder()
					.nroEstabelecimento(cells.get(0).getStringCellValue())
					.identificador(cells.get(1).getStringCellValue())
					.dataTransacao(cells.get(2).getDateCellValue())
					.modalidade(cells.get(3).getStringCellValue())
					.bandeira(cells.get(4).getStringCellValue())					
					.nroParcelas((int) cells.get(5).getNumericCellValue())
					.aquivo(cells.get(6).getStringCellValue())
					.nroLinha((int) cells.get(7).getNumericCellValue())
					.inconsistenciaEncontrada(cells.get(8).getStringCellValue())
					.valorBruto(new BigDecimal(cells.get(9).getNumericCellValue()))
					.valorLiquido(new BigDecimal(cells.get(10).getNumericCellValue()))
					.taxaPraticada(new BigDecimal(cells.get(11).getNumericCellValue()))
					.taxaContratada(new BigDecimal(cells.get(12).getNumericCellValue()))
					.valorLiquidoCorrigido(new BigDecimal(cells.get(13).getNumericCellValue()))
					.valorARessarcir(new BigDecimal(cells.get(14).getNumericCellValue()))	
					.build();
			
			registros.add(registro);
		});

		workbook.close();
		return registros;

	};
	public List<?> toList(Iterator<?> iterator){
		return IteratorUtils.toList(iterator);
	}
	
	public void imprimir(List<Registro> registros) {
		registros.forEach(System.out::println);
	}
}
