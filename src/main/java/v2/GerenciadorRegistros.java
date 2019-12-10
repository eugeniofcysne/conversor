package v2;

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
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lombok.Cleanup;
public class GerenciadorRegistros {

	public void lerArqXlsx(BufferedInputStream buf) {
        System.out.println("Lendo arquivo no formato XLSX");
        try {

            XSSFWorkbook wb = new XSSFWorkbook(buf);
            Sheet sheet = wb.getSheetAt(0);
            Iterator linhas = sheet.rowIterator();
           System.out.println("Aberto arquivo XLSX.\nSerá iniciado a leitura de registro por registro");
            while (linhas.hasNext()) {
                XSSFRow linha = (XSSFRow) linhas.next();
                Iterator celulas = linha.cellIterator();

                Registro registro = new Registro();

                while (celulas.hasNext()) {
                    XSSFCell celula = (XSSFCell) celulas.next();
                    int z = celula.getColumnIndex();

                    switch (z) {
                        case 0:
                            registro.setId(celula.toString());
                        case 1:
                            analista.setNome(celula.toString());
                        case 2:
                            analista.setTurno(celula.toString());
                        case 3:
                            analista.setFunc(celula.toString());
                    }

                }
                if (analista.getFunc().toLowerCase().contains("apuração")) {
                    listaAnalistas.add(analista);
                }
            }
            log.info("O arquivo possui "+(listaAnalistas.size()+1)+" analistas de apuração");
            log.info("Leitura do arquivo do arquvio de Analistas no formato XLXS concluído com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: na hora de abrir dos analalistas no formato XLXS");
            log.debug("Deu erro no arquivo XLXS dos Analistas");
            log.debug(e.getMessage());
        }
    }
}
