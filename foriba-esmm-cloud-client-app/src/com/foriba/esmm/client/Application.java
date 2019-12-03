package com.foriba.esmm.client;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import com.foriba.esmm.CancelDocumentFaultMessage;
import com.foriba.esmm.CancelDocumentRequest;
import com.foriba.esmm.CancelDocumentRequestType;
import com.foriba.esmm.CancelDocumentResponse;
import com.foriba.esmm.ForibaESmmServices;
import com.foriba.esmm.ForibaESmmServicesPort;
import com.foriba.esmm.GetDocumentFaultMessage;
import com.foriba.esmm.GetDocumentRequest;
import com.foriba.esmm.GetDocumentRequestType;
import com.foriba.esmm.GetDocumentResponse;
import com.foriba.esmm.ParametersType;
import com.foriba.esmm.ProcessingFault;
import com.foriba.esmm.SendDocumentFaultMessage;
import com.foriba.esmm.SendDocumentRequest;
import com.foriba.esmm.SendDocumentRequestType;
import com.foriba.esmm.SendDocumentResponse;
import com.foriba.esmm.util.UtilsIO;

public class Application {

	public static final String ENDPOINT_URL = "https://earsivwstest.fitbulut.com/ClientESmmServicesPort.svc";

	public static ForibaESmmServices service;
	public static ForibaESmmServicesPort port;
	public static BindingProvider bp;
	public static String username = "";
	public static String password = "";

	static {
		service = new ForibaESmmServices();
		port = service.getForibaESmmServicesPort();
		bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);
		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
	}

	public static void main(String[] args) {
		Application client = new Application();
		client.sendDocument();
		client.getDocument();
		client.cancelDocument();

	}

	public void sendDocument() {
		System.out.println("----------------------SendDocument-------------------------");
		try {
			SendDocumentRequest request = new SendDocumentRequest();
			request.setVKNTCKN("1111111111");
			request.setBranch("default");
			SendDocumentRequestType requestType = new SendDocumentRequestType();
			// ETTN
			requestType.setUUID("81954ffa-cad2-46a9-9a34-0a99d6762489");
			requestType.setType("SMM");
			requestType.setDocType("XML");
			requestType.setViewType("PDF");

			// Ziplenmiş eSMM belgesinin okunması
			File smmFile = new File("src/com/foriba/esmm/client/eSMM.zip");
			requestType.setDocData(UtilsIO.readBytesFromFile(smmFile));

			// e-SMM belgesinin mail olarak alıcısına gönderilmesi
			ParametersType paramType = new ParametersType();
			paramType.setName("MAIL_TO");
			paramType.setValue("foriba@example.com");
			requestType.getParameters().add(paramType);

			request.getSendDocDetails().add(requestType);
			SendDocumentResponse response = port.sendDocument(request);

			System.out.println("UUID: " + response.getSendDocumentResponse().get(0).getUUID());
			System.out.println("ID:" + response.getSendDocumentResponse().get(0).getID());
			System.out.println("CustDocID: " + response.getSendDocumentResponse().get(0).getCustDocID());
			System.out.println("Type: " + response.getSendDocumentResponse().get(0).getType());
			System.out.println("DocType: " + response.getSendDocumentResponse().get(0).getDocType());

			// Base64 ile encode edilmiş PDF çıktısının alınması
			byte[] viewBinaryData = response.getSendDocumentResponse().get(0).getViewData();
			String viewEncodedData = Base64.getEncoder().encodeToString(viewBinaryData);
			System.out.println("ViewData: " + viewEncodedData);

		} catch (SendDocumentFaultMessage e) {
			ProcessingFault pf = e.getFaultInfo();
			System.out.println("Fault Code: " + pf.getCode());
			System.out.println("Fault Message: " + pf.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void cancelDocument() {
		System.out.println("----------------------CancelDocument-----------------------");
		try {
			CancelDocumentRequest request = new CancelDocumentRequest();
			request.setVKNTCKN("1111111111");
			request.setBranch("default");
			CancelDocumentRequestType requestType = new CancelDocumentRequestType();
			// e-SMM Makbuz Numarası
			requestType.setID("GIB2019000000001");
			requestType.setType("SMM");
			requestType.setDocType("XML");
			requestType.setTotalAmount(new BigDecimal(100));

			XMLGregorianCalendar cancelDate = null;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());
			cancelDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			requestType.setCancelDate(cancelDate);
			request.getCancelDocDetails().add(requestType);

			CancelDocumentResponse response = port.cancelDocument(request);

			System.out.println("ID: " + response.getCancelDocumentResponse().get(0).getID());
			System.out.println("CustDocID: " + response.getCancelDocumentResponse().get(0).getCustDocID());
			System.out.println("Type: " + response.getCancelDocumentResponse().get(0).getType());
			System.out.println("DocType: " + response.getCancelDocumentResponse().get(0).getDocType());
			System.out.println("Result: " + response.getCancelDocumentResponse().get(0).getResult());
			System.out.println("ResultDescription: " + response.getCancelDocumentResponse().get(0).getResultDescription());
			
		} catch (CancelDocumentFaultMessage e) {
			ProcessingFault pf = e.getFaultInfo();
			System.out.println("Fault Code: " + pf.getCode());
			System.out.println("Fault Message: " + pf.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getDocument() {
		System.out.println("----------------------GetDocument--------------------------");
		try {
			GetDocumentRequest request = new GetDocumentRequest();
			request.setVKNTCKN("1111111111");
			GetDocumentRequestType requestType = new GetDocumentRequestType();
			// ETTN
			requestType.setUUID("81954ffa-cad2-46a9-9a34-0a99d6762489");
			// e-SMM Makbuz Numarası
//			requestType.setID("GB72019000000052");

			requestType.setType("SMM");
			requestType.setDocType("XML");
			requestType.setViewType("PDF");
			request.getGetDocDetails().add(requestType);
			
			GetDocumentResponse response = port.getDocument(request);

			System.out.println("UUID: " + response.getGetDocumentResponse().get(0).getUUID());
			System.out.println("ID: " + response.getGetDocumentResponse().get(0).getID());
			System.out.println("Type: " + response.getGetDocumentResponse().get(0).getType());
			System.out.println("ViewType: " + response.getGetDocumentResponse().get(0).getViewType());

			// Base64 ile encode edilmiş PDF çıktısının alınması
			byte[] binaryData = response.getGetDocumentResponse().get(0).getDocData();
			String encodedData = Base64.getEncoder().encodeToString(binaryData);
			System.out.println("DocData: " + encodedData);
			System.out.println("Result: " + response.getGetDocumentResponse().get(0).getResult());
			System.out.println("ResultDescription: " + response.getGetDocumentResponse().get(0).getResultDescription());

		} catch (GetDocumentFaultMessage e) {
			ProcessingFault pf = e.getFaultInfo();
			System.out.println("Fault Code: " + pf.getCode());
			System.out.println("Fault Message: " + pf.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
