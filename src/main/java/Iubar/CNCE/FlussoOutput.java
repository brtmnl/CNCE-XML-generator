package Iubar.CNCE;

import java.io.*;
import java.util.logging.*;
import org.jdom2.*;
import org.jdom2.output.*;

public class FlussoOutput {
	private static final Logger LOGGER = Logger.getLogger(FlussoOutput.class.getName());

	public static Element generateCNCE_DatiCantiere() {
		Namespace ns_CNCE_DatiCantiere = Namespace.getNamespace("CNCE_DatiCantiere",
				"http://mut.cnce.it/schemas/denunce/daticantiere");
		Element elem_CNCE_DatiCantiere = new Element("CNCE_DatiCantiere", ns_CNCE_DatiCantiere);
		
		
		
		return elem_CNCE_DatiCantiere;
	}

	static void updateNamespace(Element e) {
		Namespace ns = e.getNamespace();
		for (Element child : e.getChildren()) {
			if (child.getNamespace().getPrefix().equals("")) {
				child.setNamespace(ns);
			}
			updateNamespace(child);
		}
	}

	public static void main(String[] args) {

		try {

			Namespace ns_FlussoOutput = Namespace.getNamespace("CNCE_FlussoOutput",
					"http://mut.cnce.it/schemas/denunce/flussooutput");
			Element elem_CNCE_FlussoOutput = new Element("CNCE_FlussoOutput", ns_FlussoOutput);
			Document doc = new Document(elem_CNCE_FlussoOutput);

			Element elem_DataCreazione = new Element("DataCreazione");
			elem_CNCE_FlussoOutput.addContent(elem_DataCreazione);
			Element elem_VersioneFlusso = new Element("VersioneFlusso");
			elem_CNCE_FlussoOutput.addContent(elem_VersioneFlusso);
			Element elem_TipoFlusso = new Element("TipoFlusso");
			elem_CNCE_FlussoOutput.addContent(elem_TipoFlusso);

			elem_CNCE_FlussoOutput.addContent(generateCNCE_DatiCantiere());

			updateNamespace(doc.getRootElement());

			XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());

			// display nice nice

			xmlOutput.output(doc, new FileWriter(
					"C:\\Users\\iubar\\iubar\\workspace\\CNCE-XML-generator\\src\\main\\resources\\xml\\FlussoOutput.xml"));

			LOGGER.info(xmlOutput.outputString(doc));
			LOGGER.info("File Saved!");

		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

}
