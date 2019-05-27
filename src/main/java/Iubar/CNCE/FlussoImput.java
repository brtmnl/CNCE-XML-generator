package Iubar.CNCE;

import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.logging.*;
import org.jdom2.*;
import org.jdom2.output.*;

public class FlussoImput {
	private static final Logger LOGGER = Logger.getLogger(FlussoImput.class.getName());

	public static Element generateCNCE_Denuncia() {
		Namespace ns_CNCE_Denuncia = Namespace.getNamespace("CNCE_Denuncia",
				"http://mut.cnce.it/schemas/denunce/denuncia");
		Element elem_CNCE_Denuncia = new Element("CNCE_Denuncia", ns_CNCE_Denuncia);

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
		Element elem_DE_TotDipImpresa = new Element("DE_TotDipImpresa");
		elem_CNCE_Denuncia.addContent(elem_DE_TotDipImpresa);
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

		elem_CNCE_Denuncia.addContent(generateCNCE_Cantiere());
		elem_CNCE_Denuncia.addContent(generateCNCE_Lavoratore());
		elem_CNCE_Denuncia.addContent(generateCNCE_LavoratoreNonDipendente());
		elem_CNCE_Denuncia.addContent(generateCNCE_Riepilogo());

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
		Element elem_IM_ABI = new Element("IM_ABI");
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

	public static Element generateIndirizzoCantiere() {
		Element elem_CNCE_Cantiere = new Element("CNCE_Cantiere");

		Element elem_CA_CAP = new Element("CA_CAP");
		elem_CNCE_Cantiere.addContent(elem_CA_CAP);
		Element elem_CA_TipoVia = new Element("CA_TipoVia");
		elem_CNCE_Cantiere.addContent(elem_CA_TipoVia);
		Element elem_CA_Indirizzo = new Element("CA_Indirizzo");
		elem_CNCE_Cantiere.addContent(elem_CA_Indirizzo);
		Element elem_CA_NumeroCivico = new Element("CA_NumeroCivico");
		elem_CNCE_Cantiere.addContent(elem_CA_NumeroCivico);
		Element elem_CA_Località = new Element("CA_Località");
		elem_CNCE_Cantiere.addContent(elem_CA_Località);
		Element elem_CA_CodiceComune = new Element("CA_CodiceComune");
		elem_CNCE_Cantiere.addContent(elem_CA_CodiceComune);
		Element elem_CA_Comune = new Element("CA_Comune");
		elem_CNCE_Cantiere.addContent(elem_CA_Comune);
		Element elem_CA_Provincia = new Element("CA_Provincia");
		elem_CNCE_Cantiere.addContent(elem_CA_Provincia);

		return elem_CNCE_Cantiere;
	}

	public static Element generateCNCE_Cantiere() {
		Namespace ns_CNCE_Cantiere = Namespace.getNamespace("CNCE_Cantiere",
				"http://mut.cnce.it/schemas/denunce/cantiere");
		Element elem_CNCE_Cantiere = new Element("CNCE_Cantiere", ns_CNCE_Cantiere);

		Element elem_CA_NumeroProg = new Element("A_NumeroProg");
		elem_CNCE_Cantiere.addContent(elem_CA_NumeroProg);
		Element elem_CA_CodCantierCE = new Element("CA_CodCantierCE");
		elem_CNCE_Cantiere.addContent(elem_CA_CodCantierCE);
		Element elem_CA_CodiceIdentificativoMUT = new Element("CA_CodiceIdentificativoMUT");
		elem_CNCE_Cantiere.addContent(elem_CA_CodiceIdentificativoMUT);
		Element elem_CA_Denominazione1 = new Element("CA_Denominazione1");
		elem_CNCE_Cantiere.addContent(elem_CA_Denominazione1);
		Element elem_CA_Denominazione2 = new Element("CA_Denominazione2");
		elem_CNCE_Cantiere.addContent(elem_CA_Denominazione2);
		Element elem_CA_ProtocolloNormPostSisma = new Element("CA_ProtocolloNormPostSisma");
		elem_CNCE_Cantiere.addContent(elem_CA_ProtocolloNormPostSisma);
		Element elem_CA_FlagCantierePostSisma = new Element("CA_FlagCantierePostSisma");
		elem_CNCE_Cantiere.addContent(elem_CA_FlagCantierePostSisma);
		Element elem_CA_ProtocolloSisma2016 = new Element("CA_ProtocolloSisma2016");
		elem_CNCE_Cantiere.addContent(elem_CA_ProtocolloSisma2016);
		Element elem_CA_FlagCantiereSisma2016 = new Element("CA_FlagCantiereSisma2016");
		elem_CNCE_Cantiere.addContent(elem_CA_FlagCantiereSisma2016);
		Element elem_CA_CantiereGenerico = new Element("CA_CantiereGenerico");
		elem_CNCE_Cantiere.addContent(elem_CA_CantiereGenerico);

		elem_CNCE_Cantiere.addContent(generateIndirizzoCantiere());

		Element elem_CA_AnnoInizio = new Element("CA_AnnoInizio");
		elem_CNCE_Cantiere.addContent(elem_CA_AnnoInizio);
		Element elem_CA_MeseInizio = new Element("CA_MeseInizio");
		elem_CNCE_Cantiere.addContent(elem_CA_MeseInizio);
		Element elem_CA_TipoCommittente = new Element("CA_TipoCommittente");
		elem_CNCE_Cantiere.addContent(elem_CA_TipoCommittente);
		Element elem_CA_TipoLavoro = new Element("CA_TipoLavoro");
		elem_CNCE_Cantiere.addContent(elem_CA_TipoLavoro);
		Element elem_CA_CodFiscCommittente = new Element("CA_CodFiscCommittente");
		elem_CNCE_Cantiere.addContent(elem_CA_CodFiscCommittente);
		Element elem_CA_DenominazioneCommittente = new Element("CA_DenominazioneCommittente");
		elem_CNCE_Cantiere.addContent(elem_CA_DenominazioneCommittente);
		Element elem_CA_TipoViaComm = new Element("CA_TipoViaComm");
		elem_CNCE_Cantiere.addContent(elem_CA_TipoViaComm);
		Element elem_CA_IndirizzoComm = new Element("CA_IndirizzoComm");
		elem_CNCE_Cantiere.addContent(elem_CA_IndirizzoComm);
		Element elem_CA_NumeroCivicoComm = new Element("CA_NumeroCivicoComm");
		elem_CNCE_Cantiere.addContent(elem_CA_NumeroCivicoComm);
		Element elem_CA_CAPCommittente = new Element("CA_CAPCommittente");
		elem_CNCE_Cantiere.addContent(elem_CA_CAPCommittente);
		Element elem_CA_CodiceComuneComm = new Element("CA_CodiceComuneComm");
		elem_CNCE_Cantiere.addContent(elem_CA_CodiceComuneComm);
		Element elem_CA_ComuneComm = new Element("CA_ComuneComm");
		elem_CNCE_Cantiere.addContent(elem_CA_ComuneComm);
		Element elem_CA_ProvinciaComm = new Element("CA_ProvinciaComm");
		elem_CNCE_Cantiere.addContent(elem_CA_ProvinciaComm);
		Element elem_CA_CodFiscaleAppaltator = new Element("CA_CodFiscaleAppaltator");
		elem_CNCE_Cantiere.addContent(elem_CA_CodFiscaleAppaltator);
		Element elem_CA_DenominazioneAppaltator = new Element("CA_DenominazioneAppaltator");
		elem_CNCE_Cantiere.addContent(elem_CA_DenominazioneAppaltator);
		Element elem_CA_Attivita07 = new Element("CA_Attivita07");
		elem_CNCE_Cantiere.addContent(elem_CA_Attivita07);
		Element elem_CA_ImponibileINPS = new Element("CA_ImponibileINPS");
		elem_CNCE_Cantiere.addContent(elem_CA_ImponibileINPS);
		Element elem_CA_ImponibileContr = new Element("CA_ImponibileContr");
		elem_CNCE_Cantiere.addContent(elem_CA_ImponibileContr);
		Element elem_CA_Situazione = new Element("CA_Situazione");
		elem_CNCE_Cantiere.addContent(elem_CA_Situazione);
		Element elem_CA_GiornoSituazione = new Element("CA_GiornoSituazione");
		elem_CNCE_Cantiere.addContent(elem_CA_GiornoSituazione);
		Element elem_CA_LavoratoriTrasfertisti = new Element("CA_LavoratoriTrasfertisti");
		elem_CNCE_Cantiere.addContent(elem_CA_LavoratoriTrasfertisti);
		Element elem_CA_Subappalti = new Element("CA_Subappalti");
		elem_CNCE_Cantiere.addContent(elem_CA_Subappalti);
		Element elem_CA_LavoratoriInterinali = new Element("CA_LavoratoriInterinali");
		elem_CNCE_Cantiere.addContent(elem_CA_LavoratoriInterinali);
		Element elem_CA_Note = new Element("CA_Note");
		elem_CNCE_Cantiere.addContent(elem_CA_Note);

		elem_CNCE_Cantiere.addContent(generateDatiAppalto());
		elem_CNCE_Cantiere.addContent(generateNotificaPreliminare());
		elem_CNCE_Cantiere.addContent(generateDatiOpera());
		elem_CNCE_Cantiere.addContent(generateCNCE_Subappalti());

		return elem_CNCE_Cantiere;
	}

	public static Element generateCNCE_Subappalti() {
		Element elem_CNCE_Subappalti = new Element("CNCE_Subappalti");

		Element elem_SU_CodiceFiscale = new Element("SU_CodiceFiscale");
		elem_CNCE_Subappalti.addContent(elem_SU_CodiceFiscale);
		Element elem_SU_Denominazione = new Element("SU_Denominazione");
		elem_CNCE_Subappalti.addContent(elem_SU_Denominazione);
		Element elem_SU_TipoVia = new Element("SU_TipoVia");
		elem_CNCE_Subappalti.addContent(elem_SU_TipoVia);
		Element elem_SU_Indirizzo = new Element("SU_Indirizzo");
		elem_CNCE_Subappalti.addContent(elem_SU_Indirizzo);
		Element elem_SU_NumeroCivico = new Element("SU_NumeroCivico");
		elem_CNCE_Subappalti.addContent(elem_SU_NumeroCivico);
		Element elem_SU_Localita = new Element("SU_Localita");
		elem_CNCE_Subappalti.addContent(elem_SU_Localita);
		Element elem_SU_CAP = new Element("SU_CAP");
		elem_CNCE_Subappalti.addContent(elem_SU_CAP);
		Element elem_SU_CodiceComune = new Element("SU_CodiceComune");
		elem_CNCE_Subappalti.addContent(elem_SU_CodiceComune);
		Element elem_SU_Comune = new Element("SU_Comune");
		elem_CNCE_Subappalti.addContent(elem_SU_Comune);
		Element elem_SU_Provincia = new Element("SU_Provincia");
		elem_CNCE_Subappalti.addContent(elem_SU_Provincia);
		Element elem_SU_DescrizioneLavori = new Element("SU_DescrizioneLavori");
		elem_CNCE_Subappalti.addContent(elem_SU_DescrizioneLavori);
		Element elem_SU_ImportoLavoriSubappalto = new Element("SU_ImportoLavoriSubappalto");
		elem_CNCE_Subappalti.addContent(elem_SU_ImportoLavoriSubappalto);
		Element elem_SU_DataPresuntaInizioLavori = new Element("SU_DataPresuntaInizioLavori");
		elem_CNCE_Subappalti.addContent(elem_SU_DataPresuntaInizioLavori);
		Element elem_SU_DataPresuntaIFineLavori = new Element("SU_DataPresuntaIFineLavori");
		elem_CNCE_Subappalti.addContent(elem_SU_DataPresuntaIFineLavori);

		return elem_CNCE_Subappalti;
	}

	public static Element generateDatiAppalto() {
		Element elem_DatiAppalto = new Element("DatiAppalto");

		Element elem_AP_CIP = new Element("AP_CIP");
		elem_DatiAppalto.addContent(elem_AP_CIP);
		Element elem_AP_ProtocolloAppalto = new Element("AP_ProtocolloAppalto");
		elem_DatiAppalto.addContent(elem_AP_ProtocolloAppalto);
		Element elem_AP_DataAppalto = new Element("AP_DataAppalto");
		elem_DatiAppalto.addContent(elem_AP_DataAppalto);
		Element elem_AP_CodiceCIG = new Element("AP_CodiceCIG");
		elem_DatiAppalto.addContent(elem_AP_CodiceCIG);

		return elem_DatiAppalto;
	}

	public static Element generateNotificaPreliminare() {
		Element elem_NotificaPreliminare = new Element("NotificaPreliminare");

		Element elem_NP_CodNotifica = new Element("NP_CodNotifica");
		elem_NotificaPreliminare.addContent(elem_NP_CodNotifica);
		Element elem_NP_DataNotifica = new Element("NP_DataNotifica");
		elem_NotificaPreliminare.addContent(elem_NP_DataNotifica);

		return elem_NotificaPreliminare;
	}

	public static Element generateDatiOpera() {
		Element elem_DatiOpera = new Element("DatiOpera");

		Element elem_OP_ValoreComplessivo = new Element("OP_ValoreComplessivo");
		elem_DatiOpera.addContent(elem_OP_ValoreComplessivo);
		Element elem_OP_ImportoLavoriEdili = new Element("OP_ImportoLavoriEdili");
		elem_DatiOpera.addContent(elem_OP_ImportoLavoriEdili);
		Element elem_OP_DataPresuntaFineLavori = new Element("OP_DataPresuntaFineLavori");
		elem_DatiOpera.addContent(elem_OP_DataPresuntaFineLavori);

		return elem_DatiOpera;
	}

	public static Element generateCNCE_Lavoratore() {
		Namespace ns_CNCE_Lavoratore = Namespace.getNamespace("CNCE_Lavoratore",
				"http://mut.cnce.it/schemas/denunce/lavoratore");
		Element elem_CNCE_Lavoratore = new Element("CNCE_Lavoratore", ns_CNCE_Lavoratore);

		Element elem_LV_CodIscrizioneCE = new Element("LV_CodIscrizioneCE");
		elem_CNCE_Lavoratore.addContent(elem_LV_CodIscrizioneCE);
		Element elem_LV_Cognome = new Element("LV_Cognome");
		elem_CNCE_Lavoratore.addContent(elem_LV_Cognome);
		Element elem_LV_Nome = new Element("LV_Nome");
		elem_CNCE_Lavoratore.addContent(elem_LV_Nome);
		Element elem_LV_CodiceFiscale = new Element("LV_CodiceFiscale");
		elem_CNCE_Lavoratore.addContent(elem_LV_CodiceFiscale);
		Element elem_LV_RigaBis = new Element("LV_RigaBis");
		elem_CNCE_Lavoratore.addContent(elem_LV_RigaBis);

		elem_CNCE_Lavoratore.addContent(generateDatiAnagrafici());
		elem_CNCE_Lavoratore.addContent(generateIndirizzoLavoratore());
		elem_CNCE_Lavoratore.addContent(generateDatiBancariLavoratore());

		Element elem_LV_LavFuoriProvincia = new Element("LV_LavFuoriProvincia");
		elem_CNCE_Lavoratore.addContent(elem_LV_LavFuoriProvincia);
		Element elem_LV_AltraCasa = new Element("LV_AltraCasa");
		elem_CNCE_Lavoratore.addContent(elem_LV_AltraCasa);

		elem_CNCE_Lavoratore.addContent(generateRapportoDiLavoro());
		elem_CNCE_Lavoratore.addContent(generateElementiPaga());
		elem_CNCE_Lavoratore.addContent(generateCNCE_LavoroCantiere());
		elem_CNCE_Lavoratore.addContent(generateImponibili());
		elem_CNCE_Lavoratore.addContent(generateOreLavoratore());
		elem_CNCE_Lavoratore.addContent(generateAccantonamenti());
		elem_CNCE_Lavoratore.addContent(generateArretrati_FSN());
		elem_CNCE_Lavoratore.addContent(generateDatiPREVIDENZACOMPLEMENTARE());
		elem_CNCE_Lavoratore.addContent(generateDatiContributoContrattualeCooperativo());
		elem_CNCE_Lavoratore.addContent(generateOpzioniPREVIDENZACOMPLEMENTARE());
		elem_CNCE_Lavoratore.addContent(generateRecuperoPREVCOMPL());
		elem_CNCE_Lavoratore.addContent(generateDatiIstitutoTFR());

		Element elem_LV_ImportoRimborsoCIG = new Element("LV_ImportoRimborsoCIG");
		elem_CNCE_Lavoratore.addContent(elem_LV_ImportoRimborsoCIG);
		Element elem_LV_OreTrimPreced = new Element("LV_OreTrimPreced");
		elem_CNCE_Lavoratore.addContent(elem_LV_OreTrimPreced);
		Element elem_LV_SantoPatrono = new Element("LV_SantoPatrono");
		elem_CNCE_Lavoratore.addContent(elem_LV_SantoPatrono);
		Element elem_LV_NormaPremiali = new Element("LV_NormaPremiali");
		elem_CNCE_Lavoratore.addContent(elem_LV_NormaPremiali);
		Element elem_LV_Note = new Element("LV_Note");
		elem_CNCE_Lavoratore.addContent(elem_LV_Note);

		elem_CNCE_Lavoratore.addContent(generateCNCE_Malattia());
		elem_CNCE_Lavoratore.addContent(generateCNCE_RecupPrevCompl());

		return elem_CNCE_Lavoratore;
	}

	public static Element generateArretrati_FSN() {

		Element elem_Arretrati_FSN = new Element("Arretrati_FSN");

		Element elem_LV_RecuperoFSNAnno1 = new Element("LV_RecuperoFSNAnno1");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno1);
		Element elem_LV_RecuperoFSNMese1 = new Element("LV_RecuperoFSNMese1");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese1);
		Element elem_LV_RecuperoFSNImporto1 = new Element("LV_RecuperoFSNImporto1");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto1);

		Element elem_LV_RecuperoFSNAnno2 = new Element("LV_RecuperoFSNAnno2");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno2);
		Element elem_LV_RecuperoFSNMese2 = new Element("LV_RecuperoFSNMese2");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese2);
		Element elem_LV_RecuperoFSNImporto2 = new Element("LV_RecuperoFSNImporto2");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto2);

		Element elem_LV_RecuperoFSNAnno3 = new Element("LV_RecuperoFSNAnno3");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno3);
		Element elem_LV_RecuperoFSNMese3 = new Element("LV_RecuperoFSNMese3");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese3);
		Element elem_LV_RecuperoFSNImporto3 = new Element("LV_RecuperoFSNImporto3");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto3);

		Element elem_LV_RecuperoFSNAnno4 = new Element("LV_RecuperoFSNAnno4");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno4);
		Element elem_LV_RecuperoFSNMese4 = new Element("LV_RecuperoFSNMese4");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese4);
		Element elem_LV_RecuperoFSNImporto4 = new Element("LV_RecuperoFSNImporto4");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto4);

		Element elem_LV_RecuperoFSNAnno5 = new Element("LV_RecuperoFSNAnno5");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno5);
		Element elem_LV_RecuperoFSNMese5 = new Element("LV_RecuperoFSNMese5");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese5);
		Element elem_LV_RecuperoFSNImporto5 = new Element("LV_RecuperoFSNImporto5");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto5);

		Element elem_LV_RecuperoFSNAnno6 = new Element("LV_RecuperoFSNAnno6");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno6);
		Element elem_LV_RecuperoFSNMese6 = new Element("LV_RecuperoFSNMese6");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese6);
		Element elem_LV_RecuperoFSNImporto6 = new Element("LV_RecuperoFSNImporto6");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto6);

		Element elem_LV_RecuperoFSNAnno7 = new Element("LV_RecuperoFSNAnno7");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno7);
		Element elem_LV_RecuperoFSNMese7 = new Element("LV_RecuperoFSNMese7");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese7);
		Element elem_LV_RecuperoFSNImporto7 = new Element("LV_RecuperoFSNImporto7");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto7);

		Element elem_LV_RecuperoFSNAnno8 = new Element("LV_RecuperoFSNAnno8");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno8);
		Element elem_LV_RecuperoFSNMese8 = new Element("LV_RecuperoFSNMese8");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese8);
		Element elem_LV_RecuperoFSNImporto8 = new Element("LV_RecuperoFSNImporto8");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto8);

		Element elem_LV_RecuperoFSNAnno9 = new Element("LV_RecuperoFSNAnno9");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno9);
		Element elem_LV_RecuperoFSNMese9 = new Element("LV_RecuperoFSNMese9");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese9);
		Element elem_LV_RecuperoFSNImporto9 = new Element("LV_RecuperoFSNImporto9");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto9);

		Element elem_LV_RecuperoFSNAnno10 = new Element("LV_RecuperoFSNAnno10");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno10);
		Element elem_LV_RecuperoFSNMese10 = new Element("LV_RecuperoFSNMese10");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese10);
		Element elem_LV_RecuperoFSNImporto10 = new Element("LV_RecuperoFSNImporto10");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto10);

		Element elem_LV_RecuperoFSNAnno11 = new Element("LV_RecuperoFSNAnno11");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno11);
		Element elem_LV_RecuperoFSNMese11 = new Element("LV_RecuperoFSNMese11");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese11);
		Element elem_LV_RecuperoFSNImporto11 = new Element("LV_RecuperoFSNImporto11");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto11);

		Element elem_LV_RecuperoFSNAnno12 = new Element("LV_RecuperoFSNAnno12");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNAnno12);
		Element elem_LV_RecuperoFSNMese12 = new Element("LV_RecuperoFSNMese12");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNMese12);
		Element elem_LV_RecuperoFSNImporto12 = new Element("LV_RecuperoFSNImporto12");
		elem_Arretrati_FSN.addContent(elem_LV_RecuperoFSNImporto12);

		return elem_Arretrati_FSN;
	}

	public static Element generateAccantonamenti() {

		Element elem_Accantonamenti = new Element("Accantonamenti");

		Element elem_LV_AccantonGNF = new Element("LV_AccantonGNF");
		elem_Accantonamenti.addContent(elem_LV_AccantonGNF);
		Element elem_LV_AccantonGNFMalInf = new Element("LV_AccantonGNFMalInf");
		elem_Accantonamenti.addContent(elem_LV_AccantonGNFMalInf);
		Element elem_LV_AccantonRiposiAnnui = new Element("LV_AccantonRiposiAnnui");
		elem_Accantonamenti.addContent(elem_LV_AccantonRiposiAnnui);
		Element elem_LV_AccantonFerie = new Element("LV_AccantonFerie");
		elem_Accantonamenti.addContent(elem_LV_AccantonFerie);
		Element elem_LV_AnticipoAccantonamento = new Element("LV_AnticipoAccantonamento");
		elem_Accantonamenti.addContent(elem_LV_AnticipoAccantonamento);
		Element elem_LV_AltroAccantonamento = new Element("LV_AltroAccantonamento");
		elem_Accantonamenti.addContent(elem_LV_AltroAccantonamento);
		Element elem_LV_GGOreAltroAccantonamento = new Element("LV_GGOreAltroAccantonamento");
		elem_Accantonamenti.addContent(elem_LV_GGOreAltroAccantonamento);
		Element elem_LV_FlagGGOreAltroAccantonamento = new Element("LV_FlagGGOreAltroAccantonamento");
		elem_Accantonamenti.addContent(elem_LV_FlagGGOreAltroAccantonamento);
		Element elem_LV_ContributoAPE = new Element("LV_ContributoAPE");
		elem_Accantonamenti.addContent(elem_LV_ContributoAPE);
		Element elem_LV_IntegrazioneAPE = new Element("LV_IntegrazioneAPE");
		elem_Accantonamenti.addContent(elem_LV_IntegrazioneAPE);
		Element elem_LV_PagaFondoSanitarioNaz = new Element("LV_PagaFondoSanitarioNaz");
		elem_Accantonamenti.addContent(elem_LV_PagaFondoSanitarioNaz);
		Element elem_LV_ImponibileFondoSanitarioNazOperaio = new Element("LV_ImponibileFondoSanitarioNazOperaio");
		elem_Accantonamenti.addContent(elem_LV_ImponibileFondoSanitarioNazOperaio);
		Element elem_LV_ImponibileFondoSanitarioNazImpiegato = new Element("LV_ImponibileFondoSanitarioNazImpiegato");
		elem_Accantonamenti.addContent(elem_LV_ImponibileFondoSanitarioNazImpiegato);
		Element elem_LV_OreLavorateAltreCasse = new Element("LV_OreLavorateAltreCasse");
		elem_Accantonamenti.addContent(elem_LV_OreLavorateAltreCasse);
		Element elem_LV_CassaIntegrazioneFondoSanitario = new Element("LV_CassaIntegrazioneFondoSanitario");
		elem_Accantonamenti.addContent(elem_LV_CassaIntegrazioneFondoSanitario);
		Element elem_LV_ContributoFondoSanitarioNaz = new Element("LV_ContributoFondoSanitarioNaz");
		elem_Accantonamenti.addContent(elem_LV_ContributoFondoSanitarioNaz);
		Element elem_LV_ContributoFondoSanitarioNaz201810 = new Element("LV_ContributoFondoSanitarioNaz201810");
		elem_Accantonamenti.addContent(elem_LV_ContributoFondoSanitarioNaz201810);
		Element elem_LV_ContributoFondoSanitarioNaz201811 = new Element("LV_ContributoFondoSanitarioNaz201811");
		elem_Accantonamenti.addContent(elem_LV_ContributoFondoSanitarioNaz201811);
		Element elem_LV_ContributoFondoSanitarioNaz201812 = new Element("LV_ContributoFondoSanitarioNaz201812");
		elem_Accantonamenti.addContent(elem_LV_ContributoFondoSanitarioNaz201812);
		Element elem_LV_ContributoFondoSanitarioNaz201901 = new Element("LV_ContributoFondoSanitarioNaz201901");
		elem_Accantonamenti.addContent(elem_LV_ContributoFondoSanitarioNaz201901);
		Element elem_LV_ContributoFondoSanitarioNazAC = new Element("LV_ContributoFondoSanitarioNazAC");
		elem_Accantonamenti.addContent(elem_LV_ContributoFondoSanitarioNazAC);

		return elem_Accantonamenti;
	}

	public static Element generateCNCE_Malattia() {
		Namespace ns_CNCE_Malattia = Namespace.getNamespace("CNCE_Malattia",
				"http://mut.cnce.it/schemas/denunce/malattia");
		Element elem_CNCE_Malattia = new Element("CNCE_Malattia", ns_CNCE_Malattia);

		Element elem_MAL_DataInizio = new Element("MAL_DataInizio");
		elem_CNCE_Malattia.addContent(elem_MAL_DataInizio);
		Element elem_MAL_GiornoFine = new Element("MAL_GiornoFine");
		elem_CNCE_Malattia.addContent(elem_MAL_GiornoFine);
		Element elem_MAL_ContinuazMalattia = new Element("MAL_ContinuazMalattia");
		elem_CNCE_Malattia.addContent(elem_MAL_ContinuazMalattia);
		Element elem_MAL_Tipo = new Element("MAL_Tipo");
		elem_CNCE_Malattia.addContent(elem_MAL_Tipo);
		Element elem_MAL_Ricaduta = new Element("MAL_Ricaduta");
		elem_CNCE_Malattia.addContent(elem_MAL_Ricaduta);
		Element elem_MAL_GiornoInizio = new Element("MAL_GiornoInizio");
		elem_CNCE_Malattia.addContent(elem_MAL_GiornoInizio);
		Element elem_MAL_OreCarenza = new Element("MAL_OreCarenza");
		elem_CNCE_Malattia.addContent(elem_MAL_OreCarenza);
		Element elem_MAL_OreMalattiaInfort = new Element("MAL_OreMalattiaInfort");
		elem_CNCE_Malattia.addContent(elem_MAL_OreMalattiaInfort);
		Element elem_MAL_OreAssenzaIngiust = new Element("MAL_OreAssenzaIngiust");
		elem_CNCE_Malattia.addContent(elem_MAL_OreAssenzaIngiust);
		Element elem_MAL_ConguaglioRimborso = new Element("MAL_ConguaglioRimborso");
		elem_CNCE_Malattia.addContent(elem_MAL_ConguaglioRimborso);
		Element elem_MAL_NumProtocolloCert1 = new Element("MAL_NumProtocolloCert1");
		elem_CNCE_Malattia.addContent(elem_MAL_NumProtocolloCert1);
		Element elem_MAL_NumProtocolloCert2 = new Element("MAL_NumProtocolloCert2");
		elem_CNCE_Malattia.addContent(elem_MAL_NumProtocolloCert2);
		Element elem_MAL_NumProtocolloCert3 = new Element("MAL_NumProtocolloCert3");
		elem_CNCE_Malattia.addContent(elem_MAL_NumProtocolloCert3);
		Element elem_MAL_NumProtocolloCert4 = new Element("MAL_NumProtocolloCert4");
		elem_CNCE_Malattia.addContent(elem_MAL_NumProtocolloCert4);
		Element elem_MAL_NumProtocolloCert5 = new Element("MAL_NumProtocolloCert5");
		elem_CNCE_Malattia.addContent(elem_MAL_NumProtocolloCert5);
		Element elem_MAL_RetrGGINPSS = new Element("elem_MAL_RetrGGINPSS");
		elem_CNCE_Malattia.addContent(elem_MAL_RetrGGINPSS);

		return elem_CNCE_Malattia;

	}

	public static Element generateDatiAnagrafici() {
		Element elem_DatiAnagrafici = new Element("DatiAnagrafici");

		Element elem_LV_DatadiNascita = new Element("LV_DatadiNascita");
		elem_DatiAnagrafici.addContent(elem_LV_DatadiNascita);
		Element elem_LV_CodComunediNascita = new Element("LV_CodComunediNascita");
		elem_DatiAnagrafici.addContent(elem_LV_CodComunediNascita);
		Element elem_LV_ComunediNascita = new Element("LV_ComunediNascita");
		elem_DatiAnagrafici.addContent(elem_LV_ComunediNascita);
		Element elem_LV_ProvinciadiNascita = new Element("LV_ProvinciadiNascita");
		elem_DatiAnagrafici.addContent(elem_LV_ProvinciadiNascita);
		Element elem_LV_Sesso = new Element("LV_Sesso");
		elem_DatiAnagrafici.addContent(elem_LV_Sesso);
		Element elem_LV_Nazionalita = new Element("LV_Nazionalita");
		elem_DatiAnagrafici.addContent(elem_LV_Nazionalita);

		return elem_DatiAnagrafici;
	}

	public static Element generateIndirizzoLavoratore() {
		Element elem_IndirizzoLavoratore = new Element("IndirizzoLavoratore");

		Element elem_LV_TipoViaResidenza = new Element("LV_TipoViaResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_TipoViaResidenza);
		Element elem_LV_IndirizzoResidenza = new Element("LV_IndirizzoResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_IndirizzoResidenza);
		Element elem_LV_NumCivicoResidenza = new Element("LV_NumCivicoResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_NumCivicoResidenza);
		Element elem_LV_CAPResidenza = new Element("LV_CAPResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_CAPResidenza);
		Element elem_LV_LocalitaResidenza = new Element("LV_LocalitaResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_LocalitaResidenza);
		Element elem_LV_CodComuneResidenza = new Element("LV_CodComuneResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_CodComuneResidenza);
		Element elem_LV_ComuneResidenza = new Element("LV_ComuneResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_ComuneResidenza);
		Element elem_LV_ProvinciaResidenza = new Element("LV_ProvinciaResidenza");
		elem_IndirizzoLavoratore.addContent(elem_LV_ProvinciaResidenza);
		Element elem_LV_Email = new Element("LV_Email");
		elem_IndirizzoLavoratore.addContent(elem_LV_Email);
		Element elem_LV_Cellulare = new Element("LV_Cellulare");
		elem_IndirizzoLavoratore.addContent(elem_LV_Cellulare);

		return elem_IndirizzoLavoratore;
	}

	public static Element generateDatiBancariLavoratore() {
		Element elem_DatiBancariLavoratore = new Element("DatiBancariLavoratore");

		Element elem_LV_CodPaese = new Element("LV_CodPaese");
		elem_DatiBancariLavoratore.addContent(elem_LV_CodPaese);
		Element elem_LV_CheckDigit = new Element("LV_CheckDigit");
		elem_DatiBancariLavoratore.addContent(elem_LV_CheckDigit);
		Element elem_LV_CIN = new Element("LV_CIN");
		elem_DatiBancariLavoratore.addContent(elem_LV_CIN);
		Element elem_LV_ABI = new Element("LV_ABI");
		elem_DatiBancariLavoratore.addContent(elem_LV_ABI);
		Element elem_LV_CAB = new Element("LV_CAB");
		elem_DatiBancariLavoratore.addContent(elem_LV_CAB);
		Element elem_LV_ContoCorrente = new Element("LV_ContoCorrente");
		elem_DatiBancariLavoratore.addContent(elem_LV_ContoCorrente);

		return elem_DatiBancariLavoratore;
	}

	public static Element generateRapportoDiLavoro() {
		Element elem_RapportoDiLavoro = new Element("RapportoDiLavoro");

		Element elem_LV_DataAssunzione = new Element("LV_DataAssunzione");
		elem_RapportoDiLavoro.addContent(elem_LV_DataAssunzione);
		Element elem_LV_TipoAssunzione = new Element("LV_TipoAssunzione");
		elem_RapportoDiLavoro.addContent(elem_LV_TipoAssunzione);
		Element elem_LV_TipoOccupazione = new Element("LV_TipoOccupazione");
		elem_RapportoDiLavoro.addContent(elem_LV_TipoOccupazione);
		Element elem_LV_EsenzLimitiCCNL = new Element("LV_EsenzLimitiCCNL");
		elem_RapportoDiLavoro.addContent(elem_LV_EsenzLimitiCCNL);
		Element elem_LV_SpecificaRapporto = new Element("LV_SpecificaRapporto");
		elem_RapportoDiLavoro.addContent(elem_LV_SpecificaRapporto);
		Element elem_LV_GiornoCessazione = new Element("LV_GiornoCessazione");
		elem_RapportoDiLavoro.addContent(elem_LV_GiornoCessazione);
		Element elem_LV_TipoCessazione = new Element("LV_TipoCessazione");
		elem_RapportoDiLavoro.addContent(elem_LV_TipoCessazione);
		Element elem_LV_CodiceQualifica = new Element("LV_CodiceQualifica");
		elem_RapportoDiLavoro.addContent(elem_LV_CodiceQualifica);
		Element elem_LV_CodiceMansione = new Element("LV_CodiceMansione");
		elem_RapportoDiLavoro.addContent(elem_LV_CodiceMansione);
		Element elem_LV_OreSettimanali = new Element("LV_OreSettimanali");
		elem_RapportoDiLavoro.addContent(elem_LV_OreSettimanali);
		Element elem_LV_PercPartTime = new Element("LV_PercPartTime");
		elem_RapportoDiLavoro.addContent(elem_LV_PercPartTime);

		return elem_RapportoDiLavoro;
	}

	public static Element generateElementiPaga() {
		Element elem_ElementiPaga = new Element("ElementiPaga");

		Element elem_LV_PagaOraria = new Element("LV_PagaOraria");
		elem_ElementiPaga.addContent(elem_LV_PagaOraria);
		Element elem_LV_SuperminimoOrario = new Element("LV_SuperminimoOrario");
		elem_ElementiPaga.addContent(elem_LV_SuperminimoOrario);
		Element elem_LV_MaggCaposquadra = new Element("LV_MaggCaposquadra");
		elem_ElementiPaga.addContent(elem_LV_MaggCaposquadra);
		Element elem_LV_Cottimo = new Element("LV_Cottimo");
		elem_ElementiPaga.addContent(elem_LV_Cottimo);
		Element elem_LV_SuperminimoMensile = new Element("LV_SuperminimoMensile");
		elem_ElementiPaga.addContent(elem_LV_SuperminimoMensile);

		return elem_ElementiPaga;
	}

	public static Element generateCNCE_LavoroCantiere() {
		Namespace ns_CNCE_LavoroCantiere = Namespace.getNamespace("CNCE_LavoroCantiere",
				"http://mut.cnce.it/schemas/denunce/LavoroCantiere");
		Element elem_CNCE_LavoroCantiere = new Element("CNCE_LavoroCantiere", ns_CNCE_LavoroCantiere);

		Element elem_LC_NumCantiere = new Element("LC_NumCantiere");
		elem_CNCE_LavoroCantiere.addContent(elem_LC_NumCantiere);
		Element elem_LC_OREOrdinarie = new Element("LC_OREOrdinarie");
		elem_CNCE_LavoroCantiere.addContent(elem_LC_OREOrdinarie);
		Element elem_LC_OREFestiva = new Element("LC_OREFestiva");
		elem_CNCE_LavoroCantiere.addContent(elem_LC_OREFestiva);
		Element elem_LC_ImponibileGNF = new Element("LC_ImponibileGNF");
		elem_CNCE_LavoroCantiere.addContent(elem_LC_ImponibileGNF);
		Element elem_LC_ImponibileContributivo = new Element("TFR_ImponibileContributivo");
		elem_CNCE_LavoroCantiere.addContent(elem_LC_ImponibileContributivo);
		Element elem_LC_AccantonGNF = new Element("LC_AccantonGNF");
		elem_CNCE_LavoroCantiere.addContent(elem_LC_AccantonGNF);
		Element elem_LC_AccantonFerie = new Element("LC_AccantonFerie");
		elem_CNCE_LavoroCantiere.addContent(elem_LC_AccantonFerie);

		return elem_CNCE_LavoroCantiere;
	}

	public static Element generateImponibili() {
		Element elem_Imponibili = new Element("Imponibili");

		Element elem_LV_ImponibileGNF = new Element("LV_ImponibileGNF");
		elem_Imponibili.addContent(elem_LV_ImponibileGNF);
		Element elem_LV_ImponibileContributivo = new Element("LV_ImponibileContributivo");
		elem_Imponibili.addContent(elem_LV_ImponibileContributivo);
		Element elem_LV_ImponibileContrSanz = new Element("LV_ImponibileContrSanz");
		elem_Imponibili.addContent(elem_LV_ImponibileContrSanz);
		Element elem_LV_ImponibileTFR = new Element("LV_ImponibileTFR");
		elem_Imponibili.addContent(elem_LV_ImponibileTFR);
		Element elem_TFR_ImponibileINPS = new Element("TFR_ImponibileINPS");
		elem_Imponibili.addContent(elem_TFR_ImponibileINPS);

		return elem_Imponibili;
	}

	public static Element generateDatiIstitutoTFR() {

		Element elem_DatiIstitutoTFR = new Element("DatiIstitutoTFR");

		Element elem_TFR_TFRDaVersare = new Element("TFR_TFRDaVersare");
		elem_DatiIstitutoTFR.addContent(elem_TFR_TFRDaVersare);
		Element elem_TFR_OreFigurative = new Element("TFR_OreFigurative");
		elem_DatiIstitutoTFR.addContent(elem_TFR_OreFigurative);
		Element elem_TFR_GiorniLavorabili = new Element("TFR_GiorniLavorabili");
		elem_DatiIstitutoTFR.addContent(elem_TFR_GiorniLavorabili);
		Element elem_TFR_ImportoFAP = new Element("TFR_ImportoFAP");
		elem_DatiIstitutoTFR.addContent(elem_TFR_ImportoFAP);
		Element elem_TFR_ImportoAumDim = new Element("TFR_ImportoAumDim");
		elem_DatiIstitutoTFR.addContent(elem_TFR_ImportoAumDim);
		Element elem_TFR_SegnoImportoAD = new Element("TFR_SegnoImportoAD");
		elem_DatiIstitutoTFR.addContent(elem_TFR_SegnoImportoAD);
		Element elem_TFR_OreUtili = new Element("TFR_OreUtili");
		elem_DatiIstitutoTFR.addContent(elem_TFR_OreUtili);
		Element elem_TFR_PagaOraria = new Element("TFR_PagaOraria");
		elem_DatiIstitutoTFR.addContent(elem_TFR_PagaOraria);

		return elem_DatiIstitutoTFR;
	}

	public static Element generateDatiContributoContrattualeCooperativo() {
		Element elem_DatiContributoContrattualeCooperativo = new Element("DatiContributoContrattualeCooperativo");

		Element elem_PRE_VersContribContrattCOOP = new Element("PRE_VersContribContrattCOOP");
		elem_DatiContributoContrattualeCooperativo.addContent(elem_PRE_VersContribContrattCOOP);
		Element elem_PRE_ContribContrattCOOP = new Element("PRE_ContribContrattCOOP");
		elem_DatiContributoContrattualeCooperativo.addContent(elem_PRE_ContribContrattCOOP);

		return elem_DatiContributoContrattualeCooperativo;
	}

	public static Element generateRecuperoPREVCOMPL() {
		Element elem_RecuperoPREVCOMPL = new Element("RecuperoPREVCOMPL");

		Element elem_PREP_AnnoDa = new Element("PREP_AnnoDa");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_AnnoDa);
		Element elem_PREP_MeseDa = new Element("PREP_MeseDa");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_MeseDa);
		Element elem_PREP_AnnoA = new Element("PREP_AnnoA");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_AnnoA);
		Element elem_PREP_MeseA = new Element("PREP_MeseA");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_MeseA);
		Element elem_PREP_ContribLavoratore = new Element("PREP_ContribLavoratore");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_ContribLavoratore);
		Element elem_PREP_ContribVolontario = new Element("PREP_ContribVolontario");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_ContribVolontario);
		Element elem_PREP_ContribDitta = new Element("PREP_ContribDitta");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_ContribDitta);
		Element elem_PREP_ContribContrattuale = new Element("PREP_ContribContrattuale");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_ContribContrattuale);
		Element elem_PREP_QuotaTFR = new Element("PREP_QuotaTFR");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_QuotaTFR);
		Element elem_PREP_Rivalutazione = new Element("PREP_Rivalutazione");
		elem_RecuperoPREVCOMPL.addContent(elem_PREP_Rivalutazione);

		return elem_RecuperoPREVCOMPL;
	}

	public static Element generateOreLavoratore() {
		Element elem_OreLavoratore = new Element("OreLavoratore");

		Element elem_ORE_Malattia = new Element("ORE_Malattia");
		elem_OreLavoratore.addContent(elem_ORE_Malattia);
		Element elem_ORE_Infortunio = new Element("ORE_Infortunio");
		elem_OreLavoratore.addContent(elem_ORE_Infortunio);
		Element elem_ORE_Carenza = new Element("ORE_Carenza");
		elem_OreLavoratore.addContent(elem_ORE_Carenza);

		elem_OreLavoratore.addContent(generateORE_Ferie());
		elem_OreLavoratore.addContent(generateORE_CassaIntegrazione());
		elem_OreLavoratore.addContent(generateORE_Congedi());

		Element elem_ORE_PermNonRetr = new Element("ORE_PermNonRetr");
		elem_OreLavoratore.addContent(elem_ORE_PermNonRetr);
		Element elem_ORE_RiduzioneOrario = new Element("ORE_RiduzioneOrario");
		elem_OreLavoratore.addContent(elem_ORE_RiduzioneOrario);
		Element elem_ORE_AggiuntiveAPE = new Element("ORE_AggiuntiveAPE");
		elem_OreLavoratore.addContent(elem_ORE_AggiuntiveAPE);

		elem_OreLavoratore.addContent(generateORE_AssenzaGiust());
		elem_OreLavoratore.addContent(generateORE_Sanzionabili());

		return elem_OreLavoratore;
	}

	public static Element generateORE_Ferie() {
		Element elem_ORE_Ferie = new Element("ORE_Ferie");

		Element elem_ORE_Ferie2 = new Element("ORE_Ferie");
		elem_ORE_Ferie.addContent(elem_ORE_Ferie2);
		Element elem_OREFE_FerieAC = new Element("OREFE_FerieAC");
		elem_ORE_Ferie.addContent(elem_OREFE_FerieAC);
		Element elem_OREFE_FerieResudueAP = new Element("OREFE_FerieResudueAP");
		elem_ORE_Ferie.addContent(elem_OREFE_FerieResudueAP);

		return elem_ORE_Ferie;
	}

	public static Element generateORE_CassaIntegrazione() {
		Element elem_ORE_CassaIntegrazione = new Element("ORE_CassaIntegrazione");

		Element elem_ORE_CiG = new Element("ORE_CiG");
		elem_ORE_CassaIntegrazione.addContent(elem_ORE_CiG);
		Element elem_ORECIG_Maltempo = new Element("ORECIG_Maltempo");
		elem_ORE_CassaIntegrazione.addContent(elem_ORECIG_Maltempo);
		Element elem_ORECIG_Altro = new Element("ORECIG_Altro");
		elem_ORE_CassaIntegrazione.addContent(elem_ORECIG_Altro);
		Element elem_ORECIG_Ordinaria = new Element("ORECIG_Ordinaria");
		elem_ORE_CassaIntegrazione.addContent(elem_ORECIG_Ordinaria);
		Element elem_ORECIG_Straordinaria = new Element("ORECIG_Straordinaria");
		elem_ORE_CassaIntegrazione.addContent(elem_ORECIG_Straordinaria);
		Element elem_ORECIG_Deroga = new Element("ORECIG_Deroga");
		elem_ORE_CassaIntegrazione.addContent(elem_ORECIG_Deroga);

		return elem_ORE_CassaIntegrazione;
	}

	public static Element generateORE_Congedi() {
		Element elem_ORE_Congedi = new Element("ORE_Congedi");

		Element elem_ORECO_TotaleOreCo = new Element("ORECO_TotaleOreCo");
		elem_ORE_Congedi.addContent(elem_ORECO_TotaleOreCo);
		Element elem_ORECO_Matrim = new Element("ORECO_Matrim");
		elem_ORE_Congedi.addContent(elem_ORECO_Matrim);
		Element elem_ORECO_Matern = new Element("ORECO_Matern");
		elem_ORE_Congedi.addContent(elem_ORECO_Matern);
		Element elem_ORECO_ServMil = new Element("ORECO_ServMil");
		elem_ORE_Congedi.addContent(elem_ORECO_ServMil);

		return elem_ORE_Congedi;
	}

	public static Element generateORE_AssenzaGiust() {
		Element elem_ORE_AssenzaGiust = new Element("ORE_AssenzaGiust");

		Element elem_OREAG_TotaleOreAG = new Element("OREAG_TotaleOreAG");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_TotaleOreAG);
		Element elem_OREAG_PermSind = new Element("OREAG_PermSind");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_PermSind);
		Element elem_OREAG_AssembSind = new Element("OREAG_AssembSind");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_AssembSind);

		elem_ORE_AssenzaGiust.addContent(generateORE_PermessiRetribuiti());

		Element elem_OREAG_MaternFacolt = new Element("OREAG_MaternFacolt");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_MaternFacolt);
		Element elem_OREAG_CorsiForm = new Element("OREAG_CorsiForm");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_CorsiForm);
		Element elem_OREAG_PermStud = new Element("OREAG_PermStud");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_PermStud);
		Element elem_OREAG_ProvvDiscip = new Element("OREAG_ProvvDiscip");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_ProvvDiscip);
		Element elem_OREAG_FunzElett = new Element("OREAG_FunzElett");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_FunzElett);
		Element elem_OREAG_CongParent = new Element("OREAG_CongParent");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_CongParent);
		Element elem_OREAG_ProvvAutGiud = new Element("OREAG_ProvvAutGiud");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_ProvvAutGiud);
		Element elem_OREAG_FerieCollNonMat = new Element("OREAG_FerieCollNonMat");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_FerieCollNonMat);
		Element elem_OREAG_DichAltreCE = new Element("OREAG_DichAltreCE");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_DichAltreCE);
		Element elem_OREAG_Scioperi = new Element("OREAG_Scioperi");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_Scioperi);
		Element elem_OREAG_AssIngSanz = new Element("OREAG_AssIngSanz");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_AssIngSanz);
		Element elem_OREAG_AspettNonRetr = new Element("OREAG_AspettNonRetr");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_AspettNonRetr);
		Element elem_OREAG_DonazSangue = new Element("OREAG_DonazSangue");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_DonazSangue);
		Element elem_OREAG_L104 = new Element("OREAG_L104");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_L104);
		Element elem_OREAG_CongStraord = new Element("OREAG_CongStraord");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_CongStraord);
		Element elem_OREAG_PermLutto = new Element("OREAG_PermLutto");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_PermLutto);
		Element elem_OREAG_AspettSindac = new Element("OREAG_AspettSindac");
		elem_ORE_AssenzaGiust.addContent(elem_OREAG_AspettSindac);

		return elem_ORE_AssenzaGiust;
	}

	public static Element generateORE_PermessiRetribuiti() {
		Element elem_ORE_PermessiRetribuiti = new Element("ORE_PermessiRetribuiti");

		Element elem_OREAG_PermRetrib = new Element("OREAG_PermRetrib");
		elem_ORE_PermessiRetribuiti.addContent(elem_OREAG_PermRetrib);
		Element elem_OREAG_PermRetribAC = new Element("OREAG_PermRetribAC");
		elem_ORE_PermessiRetribuiti.addContent(elem_OREAG_PermRetribAC);
		Element elem_OREAG_PermRetribAP = new Element("OREAG_PermRetribAP");
		elem_ORE_PermessiRetribuiti.addContent(elem_OREAG_PermRetribAP);

		return elem_ORE_PermessiRetribuiti;
	}

	public static Element generateORE_Sanzionabili() {
		Element elem_ORE_Sanzionabili = new Element("ORE_sanzionabili");

		Element elem_ORESA_TotaleOreSanz = new Element("ORESA_TotaleOreSanz");
		elem_ORE_Sanzionabili.addContent(elem_ORESA_TotaleOreSanz);
		Element elem_ORESA_FerieSanzionabili = new Element("ORESA_FerieSanzionabili");
		elem_ORE_Sanzionabili.addContent(elem_ORESA_FerieSanzionabili);
		Element elem_ORESA_PermNonRetrSanz = new Element("ORESA_PermNonRetrSanz");
		elem_ORE_Sanzionabili.addContent(elem_ORESA_PermNonRetrSanz);
		Element elem_ORESA_PermRetrSanz = new Element("ORESA_PermRetrSanz");
		elem_ORE_Sanzionabili.addContent(elem_ORESA_PermRetrSanz);

		return elem_ORE_Sanzionabili;
	}

	public static Element generateOpzioniPREVIDENZACOMPLEMENTARE() {
		Element elem_OpzioniPREVIDENZACOMPLEMENTARE = new Element("OpzioniPREVIDENZACOMPLEMENTARE");

		Element elem_PRE_CodiceFondo = new Element("PRE_CodiceFondo");
		elem_OpzioniPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_CodiceFondo);
		Element elem_PRE_NumAlboCOVIP = new Element("PRE_NumAlboCOVIP");
		elem_OpzioniPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_NumAlboCOVIP);
		Element elem_PRE_SceltaPrevidenza = new Element("PRE_SceltaPrevidenza");
		elem_OpzioniPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_SceltaPrevidenza);
		Element elem_PRE_DataSorroscrTFR = new Element("PRE_DataSorroscrTFR");
		elem_OpzioniPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_DataSorroscrTFR);

		return elem_OpzioniPREVIDENZACOMPLEMENTARE;
	}

	public static Element generateDatiPREVIDENZACOMPLEMENTARE() {
		Element elem_DatiPREVIDENZACOMPLEMENTARE = new Element("DatiPREVIDENZACOMPLEMENTARE");

		Element elem_PRE_AdesioneFondo = new Element("PRE_AdesioneFondo");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_AdesioneFondo);
		Element elem_PRE_AdesioneSilente = new Element("PRE_AdesioneSilente");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_AdesioneSilente);
		Element elem_PRE_TipoAdesione = new Element("PRE_TipoAdesione");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_TipoAdesione);
		Element elem_PRE_FlagDataAdesione = new Element("PRE_FlagDataAdesione");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_FlagDataAdesione);
		Element elem_PRE_ContribLavoratore = new Element("PRE_ContribLavoratore");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_ContribLavoratore);
		Element elem_PRE_ContribVolontario = new Element("PRE_ContribVolontario");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_ContribVolontario);
		Element elem_PRE_ContribDitta = new Element("PRE_ContribDitta");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_ContribDitta);
		Element elem_PRE_ContribContrattuale = new Element("PRE_ContribContrattuale");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_ContribContrattuale);
		Element elem_PRE_QuotaTFR = new Element("PRE_QuotaTFR");
		elem_DatiPREVIDENZACOMPLEMENTARE.addContent(elem_PRE_QuotaTFR);

		return elem_DatiPREVIDENZACOMPLEMENTARE;
	}

	public static Element generateCNCE_RecupPrevCompl() {
		Namespace ns_CNCE_RecupPrevCompl = Namespace.getNamespace("CNCE_RecupPrevCompl",
				"http://mut.cnce.it/schemas/denunce/recupPrevCompl");
		Element elem_CNCE_RecupPrevCompl = new Element("CNCE_RecupPrevCompl", ns_CNCE_RecupPrevCompl);

		Element elem_PRER_Anno = new Element("PRER_Anno");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_Anno);
		Element elem_PRER_Mese = new Element("PRER_Mese");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_Mese);
		Element elem_PRER_ContribLavoratore = new Element("PRER_ContribLavoratore");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_ContribLavoratore);
		Element elem_PRER_ContribVolontario = new Element("PRER_ContribVolontario");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_ContribVolontario);
		Element elem_PRER_ContribDitta = new Element("PRER_ContribDitta");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_ContribDitta);
		Element elem_PRER_ContribContrattuale = new Element("PRER_ContribContrattuale");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_ContribContrattuale);
		Element elem_PRER_QuotaTFR = new Element("PRER_QuotaTFR");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_QuotaTFR);
		Element elem_PRER_Rivalutazione = new Element("PRER_Rivalutazione");
		elem_CNCE_RecupPrevCompl.addContent(elem_PRER_Rivalutazione);

		return elem_CNCE_RecupPrevCompl;
	}

	public static Element generateCNCE_LavoratoreNonDipendente() {
		Namespace ns_CNCE_LavoratoreNonDipendente = Namespace.getNamespace("CNCE_LavoratoreNonDipendente",
				"http://mut.cnce.it/schemas/denunce/lavoratorenondipendente");
		Element elem_CNCE_LavoratoreNonDipendente = new Element("CNCE_LavoratoreNonDipendente",
				ns_CNCE_LavoratoreNonDipendente);

		Element elem_ND_TipoLavoratore = new Element("ND_TipoLavoratore");
		elem_CNCE_LavoratoreNonDipendente.addContent(elem_ND_TipoLavoratore);
		Element elem_ND_CodiceFiscale = new Element("ND_CodiceFiscale");
		elem_CNCE_LavoratoreNonDipendente.addContent(elem_ND_CodiceFiscale);
		Element elem_ND_Cognome = new Element("ND_Cognome");
		elem_CNCE_LavoratoreNonDipendente.addContent(elem_ND_Cognome);
		Element elem_ND_Nome = new Element("ND_Nome");
		elem_CNCE_LavoratoreNonDipendente.addContent(elem_ND_Nome);
		Element elem_ND_DataDiNascita = new Element("ND_DataDiNascita");
		elem_CNCE_LavoratoreNonDipendente.addContent(elem_ND_DataDiNascita);
		Element elem_ND_CodiceFiscaleAltraImpresa = new Element("ND_CodiceFiscaleAltraImpresa");
		elem_CNCE_LavoratoreNonDipendente.addContent(elem_ND_CodiceFiscaleAltraImpresa);
		Element elem_ND_RagioneSocialeAltraImpresa = new Element("ND_RagioneSocialeAltraImpresa");
		elem_CNCE_LavoratoreNonDipendente.addContent(elem_ND_RagioneSocialeAltraImpresa);

		elem_CNCE_LavoratoreNonDipendente.addContent(generateCNCE_OreLavoratoreND());

		return elem_CNCE_LavoratoreNonDipendente;
	}

	public static Element generateCNCE_OreLavoratoreND() {
		Element elem_CNCE_OreLavoratoreND = new Element("CNCE_OreLavoratoreND");

		return elem_CNCE_OreLavoratoreND;
	}

	public static Element generateCNCE_Riepilogo() {
		Namespace ns_CNCE_Riepilogo = Namespace.getNamespace("CNCE_Riepilogo",
				"http://mut.cnce.it/schemas/denunce/riepilogo");
		Element elem_CNCE_Riepilogo = new Element("CNCE_Riepilogo", ns_CNCE_Riepilogo);

		Element elem_RI_PercContributi = new Element("RI_PercContributi");
		elem_CNCE_Riepilogo.addContent(elem_RI_PercContributi);
		Element elem_RI_ImportoContributi = new Element("RI_ImportoContributi");
		elem_CNCE_Riepilogo.addContent(elem_RI_ImportoContributi);
		Element elem_RI_ContributoAPE = new Element("RI_ContributoAPE");
		elem_CNCE_Riepilogo.addContent(elem_RI_ContributoAPE);
		Element elem_RI_IntegrazioneAPE = new Element("RI_IntegrazioneAPE");
		elem_CNCE_Riepilogo.addContent(elem_RI_IntegrazioneAPE);
		Element elem_RI_ContributoSanitarioSanitarioNaz = new Element("RI_TContributoSanitarioSanitarioNaz");
		elem_CNCE_Riepilogo.addContent(elem_RI_ContributoSanitarioSanitarioNaz);
		Element elem_RI_ContributoSanitarioSanitarioNaz201810 = new Element("RI_ContributoSanitarioSanitarioNaz201810");
		elem_CNCE_Riepilogo.addContent(elem_RI_ContributoSanitarioSanitarioNaz201810);
		Element elem_RI_ContributoSanitarioSanitarioNaz201811 = new Element("RI_ContributoSanitarioSanitarioNaz201811");
		elem_CNCE_Riepilogo.addContent(elem_RI_ContributoSanitarioSanitarioNaz201811);
		Element elem_RI_ContributoSanitarioSanitarioNaz201812 = new Element("RI_ContributoSanitarioSanitarioNaz201812");
		elem_CNCE_Riepilogo.addContent(elem_RI_ContributoSanitarioSanitarioNaz201812);
		Element elem_RI_ContributoSanitarioSanitarioNaz201901 = new Element("RI_ContributoSanitarioSanitarioNaz201901");
		elem_CNCE_Riepilogo.addContent(elem_RI_ContributoSanitarioSanitarioNaz201901);
		Element elem_RI_VersaFondoSanNazImpiegati = new Element("RI_VersaFondoSanNazImpiegati");
		elem_CNCE_Riepilogo.addContent(elem_RI_VersaFondoSanNazImpiegati);
		Element elem_RI_PercContrAssImpr = new Element("RI_PercContrAssImpr");
		elem_CNCE_Riepilogo.addContent(elem_RI_PercContrAssImpr);
		Element elem_RI_ImportoContrAssImpr = new Element("RI_TImportoContrAssImpr");
		elem_CNCE_Riepilogo.addContent(elem_RI_ImportoContrAssImpr);
		Element elem_RI_PercContrAssImprFP = new Element("RI_PercContrAssImprFP");
		elem_CNCE_Riepilogo.addContent(elem_RI_PercContrAssImprFP);
		Element elem_RI_ImportoContrAssImprFP = new Element("RI_ImportoContrAssImprFP");
		elem_CNCE_Riepilogo.addContent(elem_RI_ImportoContrAssImprFP);
		Element elem_RI_ImportoConguaglio = new Element("RI_ImportoConguaglio");
		elem_CNCE_Riepilogo.addContent(elem_RI_ImportoConguaglio);
		Element elem_RI_ImportoCreditoPrec = new Element("RI_ImportoCreditoPrec");
		elem_CNCE_Riepilogo.addContent(elem_RI_ImportoCreditoPrec);
		Element elem_RI_ImportoDebitoPrec = new Element("RI_ImportoDebitoPrec");
		elem_CNCE_Riepilogo.addContent(elem_RI_ImportoDebitoPrec);
		Element elem_RI_ImportoAltriDebiti = new Element("RI_ImportoAltriDebiti");
		elem_CNCE_Riepilogo.addContent(elem_RI_ImportoAltriDebiti);
		Element elem_RI_FondoPrepensionamento201810 = new Element("RI_FondoPrepensionamento201810");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoPrepensionamento201810);
		Element elem_RI_FondoPrepensionamento201811 = new Element("RI_FondoPrepensionamento201811");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoPrepensionamento201811);
		Element elem_RI_FondoPrepensionamento201812 = new Element("RI_FondoPrepensionamento201812");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoPrepensionamento201812);
		Element elem_RI_FondoPrepensionamento201901 = new Element("RI_FondoPrepensionamento201901");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoPrepensionamento201901);
		Element elem_RI_FondoOccupazione = new Element("RI_FondoOccupazione");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoOccupazione);
		Element elem_RI_FondoOccupazione201810 = new Element("RI_FondoOccupazione201810");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoOccupazione201810);
		Element elem_RI_FondoOccupazione201811 = new Element("RI_FondoOccupazione201811");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoOccupazione201811);
		Element elem_RI_FondoOccupazione201812 = new Element("RI_FondoOccupazione201812");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoOccupazione201812);
		Element elem_RI_FondoOccupazione201901 = new Element("RI_FondoOccupazione201901");
		elem_CNCE_Riepilogo.addContent(elem_RI_FondoOccupazione201901);
		Element elem_RI_TotaleDaVersare = new Element("RI_TotaleDaVersare");
		elem_CNCE_Riepilogo.addContent(elem_RI_TotaleDaVersare);
		Element elem_RI_TotaleaCredito = new Element("RI_TotaleaCredito");
		elem_CNCE_Riepilogo.addContent(elem_RI_TotaleaCredito);

		elem_CNCE_Riepilogo.addContent(generateCNCE_AltriContributi());

		return elem_CNCE_Riepilogo;
	}

	public static Element generateCNCE_AltriContributi() {
		Namespace ns_CNCE_AltriContributi = Namespace.getNamespace("CNCE_AltriContributi",
				"http://mut.cnce.it/schemas/denunce/altricontributi");
		Element elem_CNCE_AltriContributi = new Element("CNCE_AltriContributi", ns_CNCE_AltriContributi);

		Element elem_AC_CodiceContributo = new Element("AC_CodiceContributo");
		elem_CNCE_AltriContributi.addContent(elem_AC_CodiceContributo);
		Element elem_AC_DescrContributo = new Element("AC_DescrContributo");
		elem_CNCE_AltriContributi.addContent(elem_AC_DescrContributo);
		Element elem_AC_PercContributo = new Element("AC_PercContributo");
		elem_CNCE_AltriContributi.addContent(elem_AC_PercContributo);
		Element elem_AC_ImportoContributo = new Element("AC_ImportoContributo");
		elem_CNCE_AltriContributi.addContent(elem_AC_ImportoContributo);

		return elem_CNCE_AltriContributi;
	}
	
	public static Element generateArretrati_Recuperi() {
		Element elem_Arretrati_Recuperi = new Element("Arretrati_Recuperi");
		
		Element elem_RI_RecuperoAnno1 = new Element("RI_RecuperoAnno1");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno1);
		Element elem_RI_RecuperoMese1 = new Element("RI_RecuperoMese1");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese1);
		Element elem_RI_RecuperoTipo1 = new Element("RI_RecuperoTipo1");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo1);
		Element elem_RI_RecuperoImporto1 = new Element("RI_RecuperoImporto1");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto1);
		Element elem_RI_RecuperoAnno2 = new Element("RI_RecuperoAnno2");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno2);
		Element elem_RI_RecuperoMese2 = new Element("RI_RecuperoMese2");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese2);
		Element elem_RI_RecuperoTipo2 = new Element("RI_RecuperoTipo2");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo2);
		Element elem_RI_RecuperoImporto2 = new Element("RI_RecuperoImporto2");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto2);
		Element elem_RI_RecuperoAnno3 = new Element("RI_RecuperoAnno3");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno3);
		Element elem_RI_RecuperoMese3 = new Element("RI_RecuperoMese3");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese3);
		Element elem_RI_RecuperoTipo3 = new Element("RI_RecuperoTipo3");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo3);
		Element elem_RI_RecuperoImporto3 = new Element("RI_RecuperoImporto3");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto3);
		Element elem_RI_RecuperoAnno4 = new Element("RI_RecuperoAnno4");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno4);
		Element elem_RI_RecuperoMese4 = new Element("RI_RecuperoMese4");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese4);
		Element elem_RI_RecuperoTipo4 = new Element("RI_RecuperoTipo4");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo4);
		Element elem_RI_RecuperoImporto4 = new Element("RI_RecuperoImporto4");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto4);
		Element elem_RI_RecuperoAnno5 = new Element("RI_RecuperoAnno5");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno5);
		Element elem_RI_RecuperoMese5 = new Element("RI_RecuperoMese5");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese5);
		Element elem_RI_RecuperoTipo5 = new Element("RI_RecuperoTipo5");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo5);
		Element elem_RI_RecuperoImporto5 = new Element("RI_RecuperoImporto5");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto5);
		Element elem_RI_RecuperoAnno6 = new Element("RI_RecuperoAnno6");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno6);
		Element elem_RI_RecuperoMese6 = new Element("RI_RecuperoMese6");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese6);
		Element elem_RI_RecuperoTipo6 = new Element("RI_RecuperoTipo6");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo6);
		Element elem_RI_RecuperoImporto6 = new Element("RI_RecuperoImporto6");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto6);
		Element elem_RI_RecuperoAnno7 = new Element("RI_RecuperoAnno7");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno7);
		Element elem_RI_RecuperoMese7 = new Element("RI_RecuperoMese7");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese7);
		Element elem_RI_RecuperoTipo7 = new Element("RI_RecuperoTipo7");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo7);
		Element elem_RI_RecuperoImporto7 = new Element("RI_RecuperoImporto7");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto7);
		Element elem_RI_RecuperoAnno8 = new Element("RI_RecuperoAnno8");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno8);
		Element elem_RI_RecuperoMese8 = new Element("RI_RecuperoMese8");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese8);
		Element elem_RI_RecuperoTipo8 = new Element("RI_RecuperoTipo8");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo8);
		Element elem_RI_RecuperoImporto8 = new Element("RI_RecuperoImporto8");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto8);
		Element elem_RI_RecuperoAnno9 = new Element("RI_RecuperoAnno9");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno9);
		Element elem_RI_RecuperoMese9 = new Element("RI_RecuperoMese9");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese9);
		Element elem_RI_RecuperoTipo9 = new Element("RI_RecuperoTipo9");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo9);
		Element elem_RI_RecuperoImporto9 = new Element("RI_RecuperoImporto9");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto9);
		Element elem_RI_RecuperoAnno10 = new Element("RI_RecuperoAnno10");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno10);
		Element elem_RI_RecuperoMese10 = new Element("RI_RecuperoMese10");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese10);
		Element elem_RI_RecuperoTipo10 = new Element("RI_RecuperoTipo10");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo10);
		Element elem_RI_RecuperoImporto10 = new Element("RI_RecuperoImporto10");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto10);
		Element elem_RI_RecuperoAnno11 = new Element("RI_RecuperoAnno11");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno11);
		Element elem_RI_RecuperoMese11 = new Element("RI_RecuperoMese11");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese11);
		Element elem_RI_RecuperoTipo11 = new Element("RI_RecuperoTipo11");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo11);
		Element elem_RI_RecuperoImporto11 = new Element("RI_RecuperoImporto11");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto11);
		Element elem_RI_RecuperoAnno12 = new Element("RI_RecuperoAnno12");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoAnno12);
		Element elem_RI_RecuperoMese12 = new Element("RI_RecuperoMese12");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoMese12);
		Element elem_RI_RecuperoTipo12 = new Element("RI_RecuperoTipo12");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoTipo12);
		Element elem_RI_RecuperoImporto12 = new Element("RI_RecuperoImporto12");
		elem_Arretrati_Recuperi.addContent(elem_RI_RecuperoImporto12);
	
		
		
		return elem_Arretrati_Recuperi;
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

			Namespace ns_FlussoInput = Namespace.getNamespace("CNCE_FlussoInput",
					"http://mut.cnce.it/schemas/denunce/flussoinput");
			Element elem_CNCE_FlussoInput = new Element("CNCE_FlussoInput", ns_FlussoInput);
			Document doc = new Document(elem_CNCE_FlussoInput);

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

			updateNamespace(doc.getRootElement());

			XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());

			// display nice nice

			xmlOutput.output(doc, new FileWriter(outPath + "/FlussoInput.xml"));

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
