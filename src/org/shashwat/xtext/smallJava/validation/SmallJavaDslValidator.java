package org.shashwat.xtext.smallJava.validation;

import org.eclipse.xtext.validation.Check;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage;

public class SmallJavaDslValidator extends AbstractSmallJavaDslValidator {
	
	@Check
	public void classNameShouldStartWithCapitalLetter(SmallJava smallJava) {
		String className = smallJava.getName();
		if (Character.isLowerCase(className.charAt(0))) {
			warning("Class name should start with an upper case letter", SmallJavaDslPackage.Literals.SMALL_JAVA__NAME);
		}
	}
}
