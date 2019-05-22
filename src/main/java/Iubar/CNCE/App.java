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
		
		elem_CNCE_Denuncia.addContent(generateCNCE_Cantiere());
		elem_CNCE_Denuncia.addContent(generateCNCE_Lavoratore());
		
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
		Element elem_CNCE_Cantieree = new Element("CNCE_Cantieree");
		
		Element elem_CA_NumeroProg = new Element("A_NumeroProg");
		elem_CNCE_Cantieree.addContent(elem_CA_NumeroProg);
		Element elem_CA_CodCantierCE = new Element("CA_CodCantierCE");
		elem_CNCE_Cantieree.addContent(elem_CA_CodCantierCE);
		Element elem_CA_CodiceIdentificativoMUT = new Element("CA_CodiceIdentificativoMUT");
		elem_CNCE_Cantieree.addContent(elem_CA_CodiceIdentificativoMUT);
		Element elem_CA_Denominazione1 = new Element("CA_Denominazione1");
		elem_CNCE_Cantieree.addContent(elem_CA_Denominazione1);
		Element elem_CA_Denominazione2 = new Element("CA_Denominazione2");
		elem_CNCE_Cantieree.addContent(elem_CA_Denominazione2);
		Element elem_CA_ProtocolloNormPostSisma = new Element("CA_ProtocolloNormPostSisma");
		elem_CNCE_Cantieree.addContent(elem_CA_ProtocolloNormPostSisma);
		Element elem_CA_FlagCantierePostSisma = new Element("CA_FlagCantierePostSisma");
		elem_CNCE_Cantieree.addContent(elem_CA_FlagCantierePostSisma);
		Element elem_CA_ProtocolloSisma2016 = new Element("CA_ProtocolloSisma2016");
		elem_CNCE_Cantieree.addContent(elem_CA_ProtocolloSisma2016);
		Element elem_CA_FlagCantiereSisma2016 = new Element("CA_FlagCantiereSisma2016");
		elem_CNCE_Cantieree.addContent(elem_CA_FlagCantiereSisma2016);
		Element elem_CA_CantiereGenerico = new Element("CA_CantiereGenerico");
		elem_CNCE_Cantieree.addContent(elem_CA_CantiereGenerico);
		
		elem_CNCE_Cantieree.addContent(generateIndirizzoCantiere());
		
		Element elem_CA_AnnoInizio = new Element("CA_AnnoInizio");
		elem_CNCE_Cantieree.addContent(elem_CA_AnnoInizio);
		Element elem_CA_MeseInizio = new Element("CA_MeseInizio");
		elem_CNCE_Cantieree.addContent(elem_CA_MeseInizio);
		Element elem_CA_TipoCommittente = new Element("CA_TipoCommittente");
		elem_CNCE_Cantieree.addContent(elem_CA_TipoCommittente);
		Element elem_CA_TipoLavoro = new Element("CA_TipoLavoro");
		elem_CNCE_Cantieree.addContent(elem_CA_TipoLavoro);
		Element elem_CA_CodFiscCommittente = new Element("CA_CodFiscCommittente");
		elem_CNCE_Cantieree.addContent(elem_CA_CodFiscCommittente);
		Element elem_CA_DenominazioneCommittente = new Element("CA_DenominazioneCommittente");
		elem_CNCE_Cantieree.addContent(elem_CA_DenominazioneCommittente);
		Element elem_CA_TipoViaComm = new Element("CA_TipoViaComm");
		elem_CNCE_Cantieree.addContent(elem_CA_TipoViaComm);
		Element elem_CA_IndirizzoComm = new Element("CA_IndirizzoComm");
		elem_CNCE_Cantieree.addContent(elem_CA_IndirizzoComm);
		Element elem_CA_NumeroCivicoComm = new Element("CA_NumeroCivicoComm");
		elem_CNCE_Cantieree.addContent(elem_CA_NumeroCivicoComm);
		Element elem_CA_CAPCommittente = new Element("CA_CAPCommittente");
		elem_CNCE_Cantieree.addContent(elem_CA_CAPCommittente);
		Element elem_CA_CodiceComuneComm = new Element("CA_CodiceComuneComm");
		elem_CNCE_Cantieree.addContent(elem_CA_CodiceComuneComm);
		Element elem_CA_ComuneComm = new Element("CA_ComuneComm");
		elem_CNCE_Cantieree.addContent(elem_CA_ComuneComm);
		Element elem_CA_ProvinciaComm = new Element("CA_ProvinciaComm");
		elem_CNCE_Cantieree.addContent(elem_CA_ProvinciaComm);
		Element elem_CA_CodFiscaleAppaltator = new Element("CA_CodFiscaleAppaltator");
		elem_CNCE_Cantieree.addContent(elem_CA_CodFiscaleAppaltator);
		Element elem_CA_DenominazioneAppaltator = new Element("CA_DenominazioneAppaltator");
		elem_CNCE_Cantieree.addContent(elem_CA_DenominazioneAppaltator);
		Element elem_CA_Attivita07 = new Element("CA_Attivita07");
		elem_CNCE_Cantieree.addContent(elem_CA_Attivita07);
		Element elem_CA_ImponibileINPS = new Element("CA_ImponibileINPS");
		elem_CNCE_Cantieree.addContent(elem_CA_ImponibileINPS);
		Element elem_CA_ImponibileContr = new Element("CA_ImponibileContr");
		elem_CNCE_Cantieree.addContent(elem_CA_ImponibileContr);
		Element elem_CA_Situazione = new Element("CA_Situazione");
		elem_CNCE_Cantieree.addContent(elem_CA_Situazione);
		Element elem_CA_GiornoSituazione = new Element("CA_GiornoSituazione");
		elem_CNCE_Cantieree.addContent(elem_CA_GiornoSituazione);
		Element elem_CA_LavoratoriTrasfertisti = new Element("CA_LavoratoriTrasfertisti");
		elem_CNCE_Cantieree.addContent(elem_CA_LavoratoriTrasfertisti);
		Element elem_CA_Subappalti = new Element("CA_Subappalti");
		elem_CNCE_Cantieree.addContent(elem_CA_Subappalti);
		Element elem_CA_LavoratoriInterinali = new Element("CA_LavoratoriInterinali");
		elem_CNCE_Cantieree.addContent(elem_CA_LavoratoriInterinali);
		Element elem_CA_Note = new Element("CA_Note");
		elem_CNCE_Cantieree.addContent(elem_CA_Note);
		
		elem_CNCE_Cantieree.addContent(generateDatiAppalto());
		elem_CNCE_Cantieree.addContent(generateNotificaPreliminare());
		elem_CNCE_Cantieree.addContent(generateDatiOpera());
		elem_CNCE_Cantieree.addContent(generateCNCE_Subappalti());
		
		return elem_CNCE_Cantieree;
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
		Element elem_CNCE_Lavoratore = new Element("CNCE_Lavoratore");
		
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
		elem_CNCE_Lavoratore.addContent(generateLavoroCantiere());
		elem_CNCE_Lavoratore.addContent(generateImponibili());
		//ore lav
		//accantonamenti
		//arrestrati fsn
		//dati previdenza sociale
		//dati contribut
		//opzioni prev
		//recupero prevcompl
		//datisititutoTFR
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
		//cnce malattia
		//cnce recuprev
		
		return elem_CNCE_Lavoratore;
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
	
	public static Element generateLavoroCantiere() {
		Element elem_LavoroCantiere = new Element("Imponibili");
		
		Element elem_LC_NumCantiere = new Element("LV_NumCantiere");
		elem_LavoroCantiere.addContent(elem_LC_NumCantiere);
		Element elem_LC_OREOrdinarie = new Element("LV_OREOrdinarie");
		elem_LavoroCantiere.addContent(elem_LC_OREOrdinarie);
		Element elem_LC_OREFestiva = new Element("LV_OREFestiva");
		elem_LavoroCantiere.addContent(elem_LC_OREFestiva);
		Element elem_LC_ImponibileGNF = new Element("LV_ImponibileGNF");
		elem_LavoroCantiere.addContent(elem_LC_ImponibileGNF);
		Element elem_LC_ImponibileContributivo = new Element("TFR_ImponibileContributivo");
		elem_LavoroCantiere.addContent(elem_LC_ImponibileContributivo);
		Element elem_LC_AccantonGNF = new Element("LV_AccantonGNF");
		elem_LavoroCantiere.addContent(elem_LC_AccantonGNF);
		Element elem_LC_AccantonFerie = new Element("LV_AccantonFerie");
		elem_LavoroCantiere.addContent(elem_LC_AccantonFerie);
		
		return elem_LavoroCantiere;
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
