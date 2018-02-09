package com.qvision.jbehaveMixto.steps;

import java.awt.AWTException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.After;
import org.junit.Assert;
import org.sikuli.script.FindFailed;

import com.qvision.framework.CLI.AccionesCLI;
import com.qvision.frameworkGUI.AccionesGUI;
import com.qvision.frameworkWeb.AccionesWeb;

public class JbehaveMixtoSteps {
	AccionesGUI accionesGUI;
	AccionesCLI accionesCLI;
	
	public JbehaveMixtoSteps(){
		accionesGUI = new AccionesGUI();
		accionesCLI = new AccionesCLI();
		new AccionesWeb();
	}

	@Given("estoy en la url $variable")
	public void metodoWeb1(String variable) {
	 AccionesWeb.irAUrl(variable);
	}

	@When("escribo $variable en campo TXTUSER")
	public void metodoWeb2(String variable) {
	 AccionesWeb.escribir(variable, 86);
	}
	
	@When("escribo $variable en campo TXTPASS")
	public void metodoWeb3(String variable) {
	 AccionesWeb.escribir(variable, 87);
	}

	@When("doy click en BTNLOGIN")
	public void metodoWeb4() {
	 AccionesWeb.click(88);
	 AccionesWeb.cerrarDriver();
	}

	@When("doy click en la lupa y escribo calculadora $variable")
	public void metodo2(String variable) throws FindFailed {
	  accionesGUI.escribir(variable, "calculadora");
	}

	@When("doy click en la imagen resultado $variable")
	public void metodo3(String variable) throws FindFailed, InterruptedException {
		accionesGUI.click(variable);
		Thread.sleep(3000);
	}

	@When("doy click en el cinco $variable")
	public void metodo4(String variable) throws FindFailed, InterruptedException {
		
		accionesGUI.click(variable);
	}

	@When("doy click en el por $variable")
	public void metodo5(String variable) throws FindFailed {
		accionesGUI.click(variable);
	}

	@When("doy click nuevamente en el cinco $variable")
	public void metodo6(String variable) throws FindFailed {
		accionesGUI.click(variable);
	}

	@When("doy click en el igual $variable")
	public void metodo7(String variable) throws FindFailed {
		accionesGUI.click(variable);
	}
	
	@When("nuevamente doy click en la lupa y escribo cmd $variable")
	public void metodo8(String variable) throws FindFailed {
	  accionesGUI.escribir(variable, "cmd");
	}

	@When("nuevamente doy click en la imagen resultado $variable")
	public void metodo9(String variable) throws FindFailed {
		accionesGUI.click(variable);
	}
	
	@When("escribo el comando $variable")
	public void metodo10(String variable) throws AWTException {
		accionesCLI.escribir(variable);
	}
	
	@When("presiono la tecla $variable")
	public void metodo11(String variable) throws AWTException {
		accionesCLI.Tecla("enter", "");
	}
	
	@Then("deberia ver la imagen $variable")
	public void metodo12(String variable) throws AWTException {
		Assert.assertTrue(accionesGUI.isImageInScreen(variable));
		accionesCLI.escribir("exit");
		accionesCLI.Tecla("enter", "");
	}



}
