package Iubar.CNCE;

import java.io.*;
import org.jdom.*;
import org.jdom.output.*;
import java.util.logging.*;


public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());
	
	public static Element generateCNCE_Denuncia() {
		Element elem_CNCE_Denuncia = new Element("CNCE_Denuncia");
		
		Element elem_CassaEdileDest = new Element("CassaEdileDest");
		elem_CNCE_Denuncia.addContent(elem_CassaEdileDest);
		Element elem_CodiceImpresa = new Element("CodiceImpresa");
		elem_CNCE_Denuncia.addContent(elem_CodiceImpresa);
		Element elem_AnnoDenuncia = new Element("AnnoDenuncia");
		elem_CNCE_Denuncia.addContent(elem_AnnoDenuncia);
		Element elem_MeseDenuncia = new Element("MeseDenuncia");
		elem_CNCE_Denuncia.addContent(elem_MeseDenuncia);
		Element elem_SequenzaDenuncia = new Element("SequenzaDenuncia");
		elem_CNCE_Denuncia.addContent(elem_SequenzaDenuncia);
		
		elem_CNCE_Denuncia.addContent(generateSedeOperativa());
		elem_CNCE_Denuncia.addContent(generateSedeLegale());
		elem_CNCE_Denuncia.addContent(generateCoordinateBancarie());
		
		Element elem_CodiceFiscale = new Element("CodiceFiscale");
		elem_CNCE_Denuncia.addContent(elem_CodiceFiscale);
		Element elem_PartitaIVA = new Element("PartitaIVA");
		elem_CNCE_Denuncia.addContent(elem_PartitaIVA);
		Element elem_RagioneSociale = new Element("RagioneSociale");
		elem_CNCE_Denuncia.addContent(elem_RagioneSociale);
		Element elem_CCNLApplicato = new Element("CCNLApplicato");
		elem_CNCE_Denuncia.addContent(elem_CCNLApplicato);
		Element elem_DE_SituazioneDenuncia = new Element("DE_SituazioneDenuncia");
		elem_CNCE_Denuncia.addContent(elem_DE_SituazioneDenuncia);
		
		Element elem_DE_GiornoSituazione = new Element("DE_GiornoSituazione");
		elem_CNCE_Denuncia.addContent(elem_DE_GiornoSituazione);
		Element elem_DE_TotDipImpresa  = new Element("DE_TotDipImpresa");
		elem_CNCE_Denuncia.addContent(elem_DE_TotDipImpresa );
		Element elem_DE_TotOpeIndeterm = new Element("DE_TotOpeIndeterm");
		elem_CNCE_Denuncia.addContent(elem_DE_TotOpeIndeterm);
		Element elem_DE_TotOpePT = new Element("DE_TotOpePT");
		elem_CNCE_Denuncia.addContent(elem_DE_TotOpePT);
		
		elem_CNCE_Denuncia.addContent(generateAltriDatiImpresa());
		elem_CNCE_Denuncia.addContent(generateCompilatore());
		
		Element elem_TotaleCantieri = new Element("TotaleCantieri");
		elem_CNCE_Denuncia.addContent(elem_TotaleCantieri);
		Element elem_TotaleLavoratori = new Element("TotaleLavoratori");
		elem_CNCE_Denuncia.addContent(elem_TotaleLavoratori);
		
		
		
		return elem_CNCE_Denuncia;
	}
	
	public static Element generateSedeOperativa() {
		Element elem_SedeOperativa = new Element("SedeOperativa");
		
		Element elem_SO_CAP = new Element("SO_CAP");
		elem_SedeOperativa.addContent(elem_SO_CAP);
		Element elem_SO_TipoVia = new Element("SO_TipoVia");
		elem_SedeOperativa.addContent(elem_SO_TipoVia);
		Element elem_SO_Indirizzo = new Element("SO_Indirizzo");
		elem_SedeOperativa.addContent(elem_SO_Indirizzo);
		Element elem_SO_NumeroCivico = new Element("SO_NumeroCivico");
		elem_SedeOperativa.addContent(elem_SO_NumeroCivico);
		Element elem_SO_Località = new Element("SO_Località");
		elem_SedeOperativa.addContent(elem_SO_Località);
		Element elem_SO_CodiceComune = new Element("SO_CodiceComune");
		elem_SedeOperativa.addContent(elem_SO_CodiceComune);
		Element elem_SO_Comune = new Element("SO_Comune");
		elem_SedeOperativa.addContent(elem_SO_Comune);
		Element elem_SO_Provincia = new Element("SO_Provincia");
		elem_SedeOperativa.addContent(elem_SO_Provincia);
		Element elem_SO_Email = new Element("SO_Email");
		elem_SedeOperativa.addContent(elem_SO_Email);
		Element elem_SO_Telefono = new Element("SO_Telefono");
		elem_SedeOperativa.addContent(elem_SO_Telefono);
		Element elem_SO_Fax = new Element("SO_Fax");
		elem_SedeOperativa.addContent(elem_SO_Fax);
		Element elem_SO_EmailPEC = new Element("SO_EmailPEC");
		elem_SedeOperativa.addContent(elem_SO_EmailPEC);
		
		return elem_SedeOperativa;
	}
	
	public static Element generateSedeLegale() {
		Element elem_SedeLegale = new Element("SedeLegale");
		
		Element elem_SL_CAP = new Element("SL_CAP");
		elem_SedeLegale.addContent(elem_SL_CAP);
		Element elem_SL_TipoVia = new Element("SL_TipoVia");
		elem_SedeLegale.addContent(elem_SL_TipoVia);
		Element elem_SL_Indirizzo = new Element("SL_Indirizzo");
		elem_SedeLegale.addContent(elem_SL_Indirizzo);
		Element elem_SL_NumeroCivico = new Element("SL_NumeroCivico");
		elem_SedeLegale.addContent(elem_SL_NumeroCivico);
		Element elem_SL_Località = new Element("SL_Località");
		elem_SedeLegale.addContent(elem_SL_Località);
		Element elem_SL_CodiceComune = new Element("SL_CodiceComune");
		elem_SedeLegale.addContent(elem_SL_CodiceComune);
		Element elem_SL_Comune = new Element("SL_Comune");
		elem_SedeLegale.addContent(elem_SL_Comune);
		Element elem_SL_Provincia = new Element("SL_Provincia");
		elem_SedeLegale.addContent(elem_SL_Provincia);
		Element elem_SL_Email = new Element("SL_Email");
		elem_SedeLegale.addContent(elem_SL_Email);
		Element elem_SL_Telefono = new Element("SL_Telefono");
		elem_SedeLegale.addContent(elem_SL_Telefono);
		Element elem_SL_Fax = new Element("SL_Fax");
		elem_SedeLegale.addContent(elem_SL_Fax);
		Element elem_SL_EmailPEC = new Element("SL_EmailPEC");
		elem_SedeLegale.addContent(elem_SL_EmailPEC);
		
		return elem_SedeLegale;
	}
	
	public static Element generateCoordinateBancarie() {
		Element elem_CoordinateBancarie = new Element("CoordinateBancarie");
		
		Element elem_IM_CodPaese = new Element("IM_CodPaese");
		elem_CoordinateBancarie.addContent(elem_IM_CodPaese);
		Element elem_IM_CheckDigit = new Element("IM_CheckDigit");
		elem_CoordinateBancarie.addContent(elem_IM_CheckDigit);
		Element elem_IM_CIN = new Element("IM_CIN");
		elem_CoordinateBancarie.addContent(elem_IM_CIN);
		Element elem_IM_ABI= new Element("IM_ABI");
		elem_CoordinateBancarie.addContent(elem_IM_ABI);
		Element elem_IM_CAB = new Element("IM_CAB");
		elem_CoordinateBancarie.addContent(elem_IM_CAB);
		Element elem_IM_ContoCorrente = new Element("IM_ContoCorrente");
		elem_CoordinateBancarie.addContent(elem_IM_ContoCorrente);
		
		return elem_CoordinateBancarie;
	}
	
	public static Element generateCompilatore() {
		Element elem_Compilatore = new Element("Compilatore");
		
		Element elem_CodiceConsulente = new Element("CodiceConsulente");
		elem_Compilatore.addContent(elem_CodiceConsulente);
		Element elem_CodiceFiscaleConsulent = new Element("CodiceFiscaleConsulent");
		elem_Compilatore.addContent(elem_CodiceFiscaleConsulent);
		Element elem_ReferenteCompil = new Element("ReferenteCompil");
		elem_Compilatore.addContent(elem_ReferenteCompil);
		Element elem_TelefonoCompil = new Element("TelefonoCompil");
		elem_Compilatore.addContent(elem_TelefonoCompil);
		
		return elem_Compilatore;
	}
	 
	public static Element generateAltriDatiImpresa() {
		Element elem_AltriDatiImpresa = new Element("AltriDatiImpresa");
		
		Element elem_CodiceINAIL = new Element("CodiceINAIL");
		elem_AltriDatiImpresa.addContent(elem_CodiceINAIL);
		Element elem_CodiceINPS = new Element("CodiceINPS");
		elem_AltriDatiImpresa.addContent(elem_CodiceINPS);
		Element elem_NumeroIscrCCIAA = new Element("NumeroIscrCCIAA");
		elem_AltriDatiImpresa.addContent(elem_NumeroIscrCCIAA);
		Element elem_CodiceOrdinamento = new Element("CodiceOrdinamento");
		elem_AltriDatiImpresa.addContent(elem_CodiceOrdinamento);
		
		return elem_AltriDatiImpresa;
	}
	
	public static void main(String[] args) {

		try {

			Element elem_CNCE_FlussoInput = new Element("CNCE_FlussoInput");
			Document doc = new Document(elem_CNCE_FlussoInput);
			//doc.setRootElement(elem_CNCE_FlussoInput);
			
			Element elem_DataCreazione = new Element("DataCreazione");
			elem_CNCE_FlussoInput.addContent(elem_DataCreazione.setText("2019-01-01"));
			Element elem_TotDenunceFornite = new Element("TotDenunceFornite");
			elem_CNCE_FlussoInput.addContent(elem_TotDenunceFornite.setText("5"));
			Element elem_IDProdSoftware = new Element("IDProdSoftware");
			elem_CNCE_FlussoInput.addContent(elem_IDProdSoftware.setText("QWERT12345"));
			Element elem_NomeProdSoftware = new Element("NomeProdSoftware");
			elem_CNCE_FlussoInput.addContent(elem_NomeProdSoftware.setText("Iubar"));
			Element elem_VersioneFlusso = new Element("VersioneFlusso");
			elem_CNCE_FlussoInput.addContent(elem_VersioneFlusso.setText("2.3"));
			
			
			elem_CNCE_FlussoInput.addContent(generateCNCE_Denuncia());
	


			XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());

			//display nice nice

			xmlOutput.output(doc, new FileWriter("file.xml"));
			
			LOGGER.info(xmlOutput.outputString(doc));
			LOGGER.info("File Saved!");
			
	
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}
}
