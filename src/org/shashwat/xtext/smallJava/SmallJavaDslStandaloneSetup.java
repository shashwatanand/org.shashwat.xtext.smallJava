/*
 * generated by Xtext
 */
package org.shashwat.xtext.smallJava;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SmallJavaDslStandaloneSetup extends SmallJavaDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SmallJavaDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
