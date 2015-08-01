package org.shashwat.xtext.smallJava.validation;

import org.eclipse.xtext.validation.Check;
import org.shashwat.xtext.smallJava.smallJavaDsl.Attribute;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage;

public class SmallJavaDslValidator extends AbstractSmallJavaDslValidator {
	
	@Check
	public void checkClassNameShouldStartWithCapitalLetter(SmallJava smallJava) {
		String className = smallJava.getName();
		if (Character.isLowerCase(className.charAt(0))) {
			warning("Class name should start with an upper case letter", SmallJavaDslPackage.Literals.SMALL_JAVA__NAME);
		}
	}
	
	@Check
	public void checkAttributeShouldStartWithLowerLetter(Attribute attribute) {
		String attributeName = attribute.getName();
		if (Character.isUpperCase(attributeName.charAt(0))) {
			warning("Attribute name should start with an lower case letter", SmallJavaDslPackage.Literals.ATTRIBUTE__NAME);
		}
	}
	
	@Check
	public void smallClassCannotExtendAFinalClass(SmallJava smallJava) {
		SmallJava parent = smallJava.getParent();
		if (parent != null) {
			if (parent.isFinal()) {
				error("SmallJava class cannot extend a final class", SmallJavaDslPackage.Literals.SMALL_JAVA__PARENT);
			}
		}
	}
}
