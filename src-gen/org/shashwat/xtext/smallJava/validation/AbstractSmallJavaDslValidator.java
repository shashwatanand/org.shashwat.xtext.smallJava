/*
 * generated by Xtext
 */
package org.shashwat.xtext.smallJava.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSmallJavaDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage.eINSTANCE);
		return result;
	}
}
