package Iubar.CNCE;

import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.logging.*;
import org.jdom2.*;
import org.jdom2.output.*;

public class FlussoOutput {
	private static final Logger LOGGER = Logger.getLogger(FlussoOutput.class.getName());

	public static Element generateCNCE_DatiCantiere() {
		Namespace ns_CNCE_DatiCantiere = Namespace.getNamespace("CNCE_DatiCantiere",
				"http://mut.cnce.it/schemas/denunce/daticantiere");
		Element elem_CNCE_DatiCantiere = new Element("CNCE_DatiCantiere", ns_CNCE_DatiCantiere);

		//IdentificazioneInpresa
		
		Element elem_CA_CodCantierCE = new Element("CA_CodiceCantierCE");
		elem_CA_CodCantierCE.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_CodCantierCE);
		Element elem_CA_CodiceIdentificativoMUT = new Element("CA_CodiceIdentificativoMUT");
		elem_CA_CodiceIdentificativoMUT.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_CodiceIdentificativoMUT);
		Element elem_CA_Denominazione1 = new Element("CA_Denominazione1");
		elem_CA_Denominazione1.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_Denominazione1);
		Element elem_CA_Denominazione2 = new Element("CA_Denominazione2");
		elem_CA_Denominazione2.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_Denominazione2);
		
		elem_CNCE_DatiCantiere.addContent(FlussoInput.generateIndirizzoCantiere());
		
		Element elem_CA_AnnoInizio = new Element("CA_AnnoInizio");
		elem_CA_AnnoInizio.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_AnnoInizio);
		Element elem_CA_MeseInizio = new Element("CA_MeseInizio");
		elem_CA_MeseInizio.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_MeseInizio);
		Element elem_CA_TipoCommittente = new Element("CA_TipoCommittente");
		elem_CA_TipoCommittente.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_TipoCommittente);
		Element elem_CA_TipoLavoro = new Element("CA_TipoLavoro");
		elem_CA_TipoLavoro.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_TipoLavoro);
		Element elem_CA_CodFiscCommittente = new Element("CA_CodFiscCommittente");
		elem_CA_CodFiscCommittente.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_CodFiscCommittente);
		Element elem_CA_DenominazioneCommittente = new Element("CA_DenominazioneCommittente");
		elem_CA_DenominazioneCommittente.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_DenominazioneCommittente);
		Element elem_CA_TipoViaComm = new Element("CA_TipoViaComm");
		elem_CA_TipoViaComm.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_TipoViaComm);
		Element elem_CA_IndirizzoComm = new Element("CA_IndirizzoComm");
		elem_CA_IndirizzoComm.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_IndirizzoComm);
		Element elem_CA_NumeroCivicoComm = new Element("CA_NumeroCivicoComm");
		elem_CA_NumeroCivicoComm.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_NumeroCivicoComm);
		Element elem_CA_CAPCommittente = new Element("CA_CAPCommittente");
		elem_CA_CAPCommittente.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_CAPCommittente);
		Element elem_CA_CodiceComuneComm = new Element("CA_CodiceComuneComm");
		elem_CA_CodiceComuneComm.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_CodiceComuneComm);
		Element elem_CA_ComuneComm = new Element("CA_ComuneComm");
		elem_CA_ComuneComm.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_ComuneComm);
		Element elem_CA_ProvinciaComm = new Element("CA_ProvinciaComm");
		elem_CA_ProvinciaComm.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_ProvinciaComm);
		Element elem_CA_CodFiscaleAppaltatore = new Element("CA_CodFiscaleAppaltatore");
		elem_CA_CodFiscaleAppaltatore.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_CodFiscaleAppaltatore);
		Element elem_CA_DenominazioneAppaltatore = new Element("CA_DenominazioneAppaltatore");
		elem_CA_DenominazioneAppaltatore.setText("valore");
		elem_CNCE_DatiCantiere.addContent(elem_CA_DenominazioneAppaltatore);
		Element elem_CA_Attività07 = new Element("CA_Attività07");
		elem_CA_Attività07.setText("valore");
		
		elem_CNCE_DatiCantiere.addContent(FlussoInput.generateDatiAppalto());
		elem_CNCE_DatiCantiere.addContent(FlussoInput.generateNotificaPreliminare());
		elem_CNCE_DatiCantiere.addContent(FlussoInput.generateDatiOpera());
		
		
		return elem_CNCE_DatiCantiere;
	}

	static void updateNamespace(Element e) {
		Namespace ns = e.getNamespace();
		List<Element> childrens = e.getChildren();
		for (Element child : childrens) {
			if(child.getNamespace().getPrefix().equals("")) {
				child.setNamespace(ns);
			}
			updateNamespace(child);
		}
	}

	public static void main(String[] args) {

		String outPath = readConfig();
		
		try {

			Namespace ns_FlussoOutput = Namespace.getNamespace("CNCE_FlussoOutput",
					"http://mut.cnce.it/schemas/denunce/flussooutput");
			Element elem_CNCE_FlussoOutput = new Element("CNCE_FlussoOutput", ns_FlussoOutput);
			Document doc = new Document(elem_CNCE_FlussoOutput);

			Element elem_DataCreazione = new Element("DataCreazione");
			elem_DataCreazione.setText("valore");
			elem_CNCE_FlussoOutput.addContent(elem_DataCreazione);
			Element elem_VersioneFlusso = new Element("VersioneFlusso");
			elem_VersioneFlusso.setText("valore");
			elem_CNCE_FlussoOutput.addContent(elem_VersioneFlusso);
			Element elem_TipoFlusso = new Element("TipoFlusso");
			elem_TipoFlusso.setText("valore");
			elem_CNCE_FlussoOutput.addContent(elem_TipoFlusso);

			elem_CNCE_FlussoOutput.addContent(generateCNCE_DatiCantiere());

			updateNamespace(doc.getRootElement());

			XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());

			// display nice nice

			xmlOutput.output(doc, new FileWriter(outPath + "/FlussoOutput.xml"));

			LOGGER.info(xmlOutput.outputString(doc));
			LOGGER.info("File Saved!");

		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

	public static String readConfig() {
		String outPath = null;
		try (InputStream input = new FileInputStream("config.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			outPath = prop.getProperty("out.path");
			System.out.println(outPath);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return outPath;
	}

}
